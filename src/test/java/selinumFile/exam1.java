package selinumFile;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class exam1 {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/" );
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Shubham");
        driver.findElement(By.name("password")).sendKeys("12345");




    }
}
