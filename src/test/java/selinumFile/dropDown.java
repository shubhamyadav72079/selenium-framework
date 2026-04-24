package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) {
        commonMethods cm= new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        WebDriver driver=cm.driver;
//        driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        driver.findElement(By.xpath("//input[@aria-label='First name']"))
                .sendKeys("Shubham");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yadav");
       WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select s1 = new Select(day);
        s1.selectByVisibleText("12");

        WebElement mon = driver.findElement(By.xpath("//select[@id='month']"));
        Select s2 = new Select(mon);
        s2.selectByVisibleText("Jan");

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select s3 = new Select(year);
        s3.selectByVisibleText("2000");
        driver.findElement(By.xpath("//label[text()='Male']")).click();


        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7207945390");

        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Shubham@12345");

        driver.findElement(By.xpath("//button[@name='websubmit']")).click();


    }
}


