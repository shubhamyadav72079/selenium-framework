package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUse {
    public static void main(String[] args) {
        commonMethods cm=new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        WebDriver driver=cm.driver;
        driver.findElement(By.xpath("//input[@data-testid='royal-email']"))
                .sendKeys("Shubham yadav");
        driver.findElement(By.xpath("//input[@id='pass']"))
                .sendKeys("1234567890");

    }
}
