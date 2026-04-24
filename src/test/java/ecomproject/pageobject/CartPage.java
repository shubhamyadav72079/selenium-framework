package ecomproject.pageobject;

import ecomproject.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends AbstractComponents {
    WebDriver driver;
    public CartPage(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    // List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
    @FindBy(css=".totalRow button")
    WebElement checkoutEle;
    @FindBy(css=".cartSection h3")
    private List<WebElement> productTitles;

//    By productsBy=By.cssSelector(".mb-3");
//    By addToCart=By.cssSelector(".card-body button:last-of-type");
//    By toastMessage=By.cssSelector("#toast-container");


    public boolean verifyProductDisplay(String productName)
    {
        boolean match=productTitles.stream().anyMatch(a->a.getText().equalsIgnoreCase(productName));
        return match;
    }

    public CheckOutPage goCheckOut()
    {
     checkoutEle.click();
     return new CheckOutPage(driver);

    }

}
