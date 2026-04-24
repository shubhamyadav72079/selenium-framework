package selinumFile;

import lombok.With;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLoactors {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement inside=driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(inside)).getText());

        WebElement next=driver.findElement(By.xpath("//label[text()='Date of Birth']"));
        driver.findElement(with(By.tagName("input")).below(next)).click();

        WebElement leftOfCheckBox=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(leftOfCheckBox)).click();

        WebElement a=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(a)).getText());
    }
}
