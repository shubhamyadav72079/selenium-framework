package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class mouseAction {

    public static void main(String[] args) {
        commonMethods cm= new commonMethods();
        cm.openDriver("https://www.facebook.com/");
        WebDriver driver=cm.driver;
        driver.navigate().refresh();
        WebElement email=driver.findElement(By.id("email"));
        System.out.println(email.getSize());
        System.out.println(driver.manage().window().getSize());
        WebElement pass=driver.findElement(By.id("pass"));
        Actions actions = new Actions(driver);
        actions.sendKeys(email,"hello")
                .doubleClick().build().perform();
//        actions.contextClick(pass).build().perform();
        actions.moveByOffset(140,250).contextClick().build().perform();

    }
}
