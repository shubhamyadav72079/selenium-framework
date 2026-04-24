package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class dragAndDrop {
    public static void main(String[] args) {
        commonMethods cm= new commonMethods();
        cm.openDriver("https://emicalculator.net/");
        WebDriver driver=cm.driver;
        driver.navigate().refresh();
        WebElement slider=driver.findElement(By.xpath("//div[@id='loanamountslider']"));
        System.out.println(slider.getSize());
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(slider,100,0)
                .build().perform();
    }
}
