package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class amazonIphone {
    int count=1;
    public static void main(String[] args) {
        commonMethods cm=new commonMethods();
        cm.openDriver("https://www.amazon.com/");
        WebDriver driver=cm.driver;
        driver.navigate().refresh();
        driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("iphone16");
        driver.findElement(By.xpath("//input[@value='Go']")).click();
       List <WebElement> wb=driver.findElements(By.xpath("//h2[contains(@aria-label, 'Apple iPhone 16')]"));
       for(int i=0;i<wb.size();i++){
          String item= wb.get(i).getText();
           System.out.println(item);
           System.out.println();


       }
       cm.closeDriver();
    }
}
