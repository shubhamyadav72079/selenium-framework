package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkbox {

    public static void main(String[] args) {

        // Initialize commonMethods and open Paytm Bus Tickets
        commonMethods cm = new commonMethods();
        cm.openDriver("https://tickets.paytm.com/bus/");

        WebDriver driver = cm.driver;  // Use WebDriver instead of ChromeDriver

        // Locate the checkbox image
        WebElement checkbox = driver.findElement(By.xpath("//img[@id='ac']"));

        // Check if the checkbox is already selected
        String checked = checkbox.getAttribute("alt");
        if ("checked".equals(checked)) {
            System.out.println("The checkbox is already selected.");
        } else {
            checkbox.click();
            checked = checkbox.getAttribute("alt");
            System.out.println("Checkbox clicked. Current state: " + checked);
        }

        // Close the browser
        cm.closeDriver();
    }
}
