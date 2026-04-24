package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown2 {
    public static void main(String[] args) {

        // Initialize commonMethods and open Facebook
        commonMethods cm = new commonMethods();
        cm.openDriver("https://www.facebook.com/");

        WebDriver driver = cm.driver;  // Use WebDriver instead of ChromeDriver

        // Open registration form
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        // Select day
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByValue("15");

        // Select month
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByIndex(0);

        // Select year
        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("2000");

        // Close the browser
        cm.closeDriver();
    }
}