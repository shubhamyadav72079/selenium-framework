package selinumFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class commonMethods {

    public WebDriver driver;  // kept public as in your original code

    // Open Chrome browser and navigate to URL
    public void openDriver(String url) {
        // Automatically setup the correct ChromeDriver version
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    // Close browser
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}