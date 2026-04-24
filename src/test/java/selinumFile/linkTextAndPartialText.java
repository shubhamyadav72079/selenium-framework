package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextAndPartialText {
    public static void main(String[] args) {

        // ❌ Remove manual driver path
        // System.setProperty("webdriver.chrome.driver", "path");

        ChromeDriver driver = new ChromeDriver();   // Selenium Manager handles driver
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();

        WebElement link = driver.findElement(By.linkText("Forgotten password?"));
        link.click();

        driver.navigate().back();

        driver.findElement(By.partialLinkText("Ray")).click();
    }
}