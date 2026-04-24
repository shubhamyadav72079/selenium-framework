package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classAndTagNameLocater {
    public static void main(String[] args) {
        commonMethods cm=new commonMethods();
        cm.openDriver("https://www.orangehrm.com/");
        WebDriver driver=cm.driver;
//        cm.driver.get("https://www.orangehrm.com/");(not possible)
        driver.findElement(By.className("nav-link")).click();
    }
}
