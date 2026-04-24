package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getAttributes {
    public static void main(String[] args) {

        // Initialize commonMethods and open Chrome
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.facebook.com/");

        WebDriver driver = cm.driver;  // Using WebDriver instead of ChromeDriver

        // Find email input, type text, and get the value attribute
        WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
        mail.sendKeys("shub123@gmail.com");
        String typedEmail = mail.getAttribute("value");
        System.out.println("Typed email: " + typedEmail);

        // Find password input, type text, and get the value attribute
        WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
        pass.sendKeys("Shub@12345");
        String typedPass = pass.getAttribute("value");
        System.out.println("Typed password: " + typedPass);

        // Close the browser after use
        cm.closeDriver();
    }
}