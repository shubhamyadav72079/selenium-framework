//package ecomproject.pageobject;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.beans.PropertyChangeListener;
//import java.time.Duration;
//import java.util.List;
//
//public class StandAloneTest {
//    public static void main(String[] args) throws InterruptedException {
//        String productName="ZARA COAT 3";
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        LandingPage landingPage=new LandingPage(driver);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://rahulshettyacademy.com/client/#/auth/login");
//        driver.findElement(By.id("userEmail")).sendKeys("shub1234@gmail.com");
//        driver.findElement(By.id("userPassword")).sendKeys("Mohit@1099");
//        driver.findElement(By.id("login")).click();
//
//        List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
//        WebElement prod=products.stream().filter(product-> product.findElement(By.cssSelector("b"))
//                .getText().equals(productName)).findFirst().orElse(null);
//        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
//        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
//
//        List<WebElement> cartProduct=driver.findElements(By.cssSelector(".cartSection h3"));
//        boolean match=cartProduct.stream().anyMatch(a->a.getText().equals(productName));
//        Assert.assertTrue(match);
//        driver.findElement(By.cssSelector(".totalRow button")).click();
//        Actions a = new Actions(driver);
//        a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "India").build().perform();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
//        driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
//
//        driver.findElement(By.cssSelector(".action_submit")).click();
//        String confirmmsg=driver.findElement(By.cssSelector(".hero-primary")).getText();
//        Assert.assertTrue(confirmmsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
//        driver.quit();
//
//    }
//}
