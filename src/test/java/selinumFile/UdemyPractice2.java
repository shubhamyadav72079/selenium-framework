package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UdemyPractice2 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
        int j=0;

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        addItems(driver,itemsNeeded);
    }

    public static  void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {
//        System.out.println(driver.findElements(By.cssSelector("//h4[@class='product-name']")));
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        int j = 0;
        List<WebElement> items = driver.findElements(By.xpath("//h4[@class='product-name']"));


        for (int i = 0; i < items.size(); i++) {


            String[] name = items.get(i).getText().split("-");
            String Formattedname = name[0].trim();
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(Formattedname)) {

                j++;

            driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
            //div[@class='product-action']
                if(j==itemsNeeded.length){
                    break;
                }
             }
        }
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahulshettyacademy");
        WebElement promoCodeInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))
        );
        promoCodeInput.sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
        WebElement succusmessage=wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        System.out.println(succusmessage.getText());
        driver.quit();
  }
}
