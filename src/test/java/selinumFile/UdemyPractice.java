package selinumFile;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class UdemyPractice {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Shub");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shub@1234");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Pass123");
        driver.findElement(By.id("exampleCheck1")).click();
//        driver.findElement(By.id("exampleFormControlSelect1")).click();

        WebElement genderElement = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
        Select genderSelect = new Select(genderElement);
        genderSelect.selectByVisibleText("Female");

        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("20/12/2000");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
        driver.quit();

    }
}
