package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;

public class instagramLogin {
    public static void main(String[] args)throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\mohit\\IdeaProjects\\dummy4\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);

        WebElement user=driver.findElement(By.name("username"));

//        WebElement user=driver.findElement(By.name("u"));
        user.sendKeys("_Heart__Broken_7");
        WebElement pasword=driver.findElement(By.name("password"));
        pasword.sendKeys("ShubhamYadav@12345");
        driver.findElement(By.xpath("//div[normalize-space(text())='Log in']")).click();

    }
}
