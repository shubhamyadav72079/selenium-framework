package ecomproject.pageobject;

import ecomproject.testcomponents.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class ErrorValidation extends BaseTest {
    @Test(groups = {"ErrorHandling"})
    public void loginErrorValidation() throws IOException, InterruptedException {
        String productName="ZARA COAT 3";

       landingPage.loginApplication("shub1234@gmail.com","Mot@1099");
        Assert.assertEquals("Incorrect email or password.",landingPage.getErrorMessage());
    }

    @Test
    public void productErrorValidation() throws IOException, InterruptedException {
        String productName="ZARA COAT 3";

        ProductCatalog productCatalog=landingPage.loginApplication("shub1234@gmail.com","Mohit@1099");
        List<WebElement> products=productCatalog.getproductlist();
        productCatalog.addProductToCart(productName);
        CartPage cartPage=productCatalog.goToCartPage();
        boolean match=cartPage.verifyProductDisplay("ZARA COAT 33");
        Assert.assertFalse(match);
    }

}
