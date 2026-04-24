package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinkAndSoftAssertion {

    public static void main(String[] args) throws IOException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> links = driver.findElements(By.xpath("//div[@id='gf-BIG']//a"));
        SoftAssert softAssert = new SoftAssert();

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            // Skip empty or invalid URLs
            if (url == null || url.isEmpty() || url.contains("javascript")) {
                continue;
            }

            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.setConnectTimeout(5000);
            conn.connect();

            int responseCode = conn.getResponseCode();
            System.out.println(responseCode + " --> " + url);

            softAssert.assertTrue(
                    responseCode < 400,
                    "Broken link found: " +
                            "Text = " + link.getText() +
                            ", URL = " + url +
                            ", Response Code = " + responseCode
            );
        }

        softAssert.assertAll();
        driver.quit();
    }
}
