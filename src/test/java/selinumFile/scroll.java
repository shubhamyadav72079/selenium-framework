package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class scroll {
    public static void main(String[] args) throws Exception{
        commonMethods cm= new commonMethods();
        cm.openDriver("https:www.amazon.com");
        WebDriver driver=cm.driver;
        driver.navigate().refresh();
        WebElement imdb=driver.findElement(By.xpath("//h5[text()='IMDb']"));
        WebElement img=driver.findElement(By.xpath("//img[@data-a-hires='https://m.media-amazon.com/images/I/71z3-+jDtcL._SX3000_.jpg']"));
        Actions actions =new Actions(driver);
        actions.moveToElement(imdb).build().perform();
        driver.wait(8000);
        actions.moveToElement(img).build().perform();

    }
}
