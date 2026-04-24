package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
    public static void main(String[] args)throws Exception {
        ChromeDriver driver=new ChromeDriver();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Shubham Yadav");
        driver.findElement(By.name("password")).sendKeys("Shubh@12345");
//        driver.findElement(By.xpath("//div[normalize-space(text())='Log in')")).click();


    }
}
