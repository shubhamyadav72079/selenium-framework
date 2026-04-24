package selinumFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class UdemyJavascriptAssingement {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Scroll down using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);

        // Find 3rd column values from the table
        List<WebElement> num = driver.findElements(
                By.xpath("//table[@name='courses']//tbody/tr/td[3]")
        );

        int sum = 0;
        for (WebElement n : num) {
            sum += Integer.parseInt(n.getText().trim());
        }

        System.out.println("Sum of 3rd column: " + sum);

        // Close the driver
        driver.quit();
    }
}
