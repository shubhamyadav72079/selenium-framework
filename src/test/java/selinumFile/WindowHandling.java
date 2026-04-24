//package selinumFile;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.Iterator;
//import java.util.Set;
//
//public class WindowHandling {
//    public static void main(String[] args) {
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://rahulshettyacademy.com/angularpractice/");
//        driver.switchTo().newWindow(WindowType.TAB);
//        Set<String> handels=driver.getWindowHandles();
//        Iterator<String> it=handels.iterator();
//        String parentWindow=it.next();
//        String childWindow= it.next();
//        driver.switchTo().window(childWindow);
//        driver.get("https://rahulshettyacademy.com/#/index");
//        String name=driver.findElement(By.xpath("//h1[text()='An Academy to']")).getText();
//
//        driver.switchTo().window(parentWindow);
//        driver.findElement(By.xpath("//input[@fdprocessedid='hsleq']")).sendKeys(name);
//
//
//    }
//
//}

package selinumFile;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Parent window
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        String parentWindow = driver.getWindowHandle();

        // Open new tab
        driver.switchTo().newWindow(WindowType.TAB);

        // Get all windows
        Set<String> windows = driver.getWindowHandles();
        String childWindow = "";

        for (String window : windows) {
            if (!window.equals(parentWindow)) {
                childWindow = window;
                break;
            }
        }

        // Switch to child window
        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/#/index");

        String name = driver.findElement(
                By.xpath("//h1[contains(text(),'An Academy')]")
        ).getText();

        // Switch back to parent
        driver.switchTo().window(parentWindow);

        WebElement wb=driver.findElement(By.name("name"));
        wb.sendKeys(name);
        File file=wb.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("logo.png"));

        System.out.println(wb.getRect().getDimension().getHeight());
        System.out.println(wb.getRect().getDimension().getWidth());

        driver.quit();
    }
}
