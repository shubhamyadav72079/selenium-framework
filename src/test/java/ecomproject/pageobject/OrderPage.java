package ecomproject.pageobject;

import ecomproject.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends AbstractComponents {
    WebDriver driver;
    public OrderPage(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    // List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
    @FindBy(css=".totalRow button")
    WebElement checkoutEle;
    @FindBy(css="tr td:nth-child(3)")
    private List<WebElement> productNames;


    public boolean verifyOrderDisplay(String productName)
    {
        boolean match=productNames.stream().anyMatch(a->a.getText().equalsIgnoreCase(productName));
        return match;
    }

    public CheckOutPage goCheckOut()
    {
        checkoutEle.click();
        return new CheckOutPage(driver);

    }

}
