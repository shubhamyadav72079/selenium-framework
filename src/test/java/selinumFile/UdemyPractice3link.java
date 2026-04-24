package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.Iterator;
import java.util.Set;


public class UdemyPractice3link {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        //limiting web driver
        WebElement footerDriver=driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //further limiting the web driver scope
        WebElement subFooter=footerDriver.findElement(By.xpath("//div/table/tbody/tr/td/ul"));
        System.out.println(subFooter.findElements(By.tagName("a")).size());
        for (int i=1;i<subFooter.findElements(By.tagName("a")).size();i++){
            String clickLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);

            subFooter.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab);
            Thread.sleep(5000);
        }
        Set<String> abc=driver.getWindowHandles();
        Iterator<String> it= abc.iterator();

        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


        driver.quit();
    }
}
