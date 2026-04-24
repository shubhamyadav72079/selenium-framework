package ecomproject.AbstractComponents;

import ecomproject.pageobject.CartPage;
import ecomproject.pageobject.OrderPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractComponents {
    WebDriver driver;
    public AbstractComponents(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    //cart page
    @FindBy(css="[routerlink*='cart']")
    WebElement cartHeader;
    //orders page
    @FindBy(css="[routerlink*='myorders']")
    WebElement orderHeader;

    public void waitForElementToAppear(By findby)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
    }
    public void waitForWebElementToAppear(WebElement findby)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(findby));
    }

    public CartPage goToCartPage()
    {
        cartHeader.click();
        CartPage cartPage= new CartPage(driver);
        return cartPage;
    }

    public OrderPage goToOrderPage()
    {
        orderHeader.click();
        OrderPage orderPage=new OrderPage(driver);
        return orderPage;
    }

    public void waitForElementToDisapear(WebElement ele) throws InterruptedException
    {
        Thread.sleep(1000);
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.invisibilityOf(ele));
    }


}
