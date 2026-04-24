package ecomproject.pageobject;

import ecomproject.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponents {
    WebDriver driver;
    public LandingPage(WebDriver driver){
        super(driver);
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }
   //WebElement userEmail=driver.findElement(By.id("userEmail"));
    @FindBy(id = "userEmail")
    WebElement userEmail;

//driver.findElement(By.id("userPassword"))
    @FindBy(id = "userPassword")
    WebElement userPassword;

//driver.findElement(By.id("login"))
    @FindBy(id = "login")
    WebElement submit;
    @FindBy(css = "[class*='flyInOut']")
    WebElement errorMessage;

    public ProductCatalog loginApplication(String email, String pasword){
        userEmail.sendKeys(email);
        userPassword.sendKeys(pasword);
        submit.click();
        ProductCatalog productCatalog=new ProductCatalog(driver);
        return productCatalog;
    }

    public String getErrorMessage()
    {
        waitForWebElementToAppear(errorMessage);
        errorMessage.getText();
        return errorMessage.getText();
    }
    public void goTo(){
        driver.get("https://rahulshettyacademy.com/client/#/auth/login");
    }

}
