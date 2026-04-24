package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Element;

public class radioButtonPaytm {
    public static void main(String[] args) throws InterruptedException{
        commonMethods cm=new commonMethods();
        cm.openDriver("https://tickets.paytm.com/bus/");
        WebDriver driver =cm.driver;
        driver.findElement(By.xpath("//label[@id='roundtrip']")).click();
        WebElement returnDate=driver.findElement(By.xpath("//div[text()='Return date']"));
//        boolean verify=returnDate.isDisplayed();
//        System.out.println(verify);
        driver.findElement(By.xpath("//label[@id='oneway']")).click();
//        Thread.sleep(Long.parseLong("3000"));
//        boolean verify1=returnDate.isDisplayed();
//        System.out.println(verify1);


    }
}


