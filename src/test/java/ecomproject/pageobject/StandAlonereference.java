package ecomproject.pageobject;
import ecomproject.testcomponents.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class StandAlonereference extends BaseTest {
    String productName="ZARA COAT 3";
  @Test(dataProvider = "getData",groups = {"Purchase"})
          public void submitOrder(HashMap<String,String> Input) throws IOException, InterruptedException {

        ProductCatalog productCatalog=landingPage.loginApplication(Input.get("email"),Input.get("password"));
        List<WebElement> products=productCatalog.getproductlist();
        productCatalog.addProductToCart(Input.get("product"));
        CartPage cartPage=productCatalog.goToCartPage();
        boolean match=cartPage.verifyProductDisplay(Input.get("product"));
        Assert.assertTrue(match);
        CheckOutPage checkOutPage=cartPage.goCheckOut();
        checkOutPage.selectCountry("India");
        ConfirmationPage confirmationPage=checkOutPage.submitOrder();
        String confirmMessage=confirmationPage.getConfirmationMessage();
        Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
    }

    @Test(dependsOnMethods = {"submitOrder"})
    public void orderHistoryTest()
    {
        ProductCatalog productCatalog=landingPage.loginApplication("shub1234@gmail.com","Mohit@1099");
        OrderPage orderPage=productCatalog.goToOrderPage();
        Assert.assertTrue(orderPage.verifyOrderDisplay(productName));
    }



    @DataProvider
    public Object[][] getData() throws IOException {
//        HashMap<String,String> map=new HashMap<String,String>();
//        map.put("email","shub1234@gmail.com");
//        map.put("password","Mohit@1099");
//        map.put("product","ZARA COAT 3");
//
//        HashMap<String,String> map1=new HashMap<String,String>();
//        map1.put("email","anshika@gmail.com");
//        map1.put("password","Iamking@000");
//        map1.put("product","ADIDAS ORIGINAL");
        List<HashMap<String,String>>data=getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\ecomproject\\data\\Purchaserder.json");


       return new  Object[][]  { {data.get(0)} , {data.get(1)}};
    }

}
