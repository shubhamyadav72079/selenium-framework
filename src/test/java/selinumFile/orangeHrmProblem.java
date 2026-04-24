package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrmProblem {
    public static void main(String[] args) throws InterruptedException {
        commonMethods cm=new commonMethods();
        cm.openDriver("https://www.orangehrm.com/");
        WebDriver driver=cm.driver;
        driver.findElement(By.linkText("Company")).click();
        Thread.sleep(3000);
        WebElement starter=driver.findElement(By.className("nav-link"));
        starter.click();
        System.out.println(starter);

        driver.findElement(By.linkText("Starter (Open Source)")).click();
        driver.findElement(By.linkText("Advanced (30 Day Free Trial)")).click();
        driver.findElement(By.linkText("About Us")).click();
        driver.findElement(By.linkText("Press Releases")).click();





    }

}
