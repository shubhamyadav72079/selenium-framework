package ecomproject.testcomponents;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ecomproject.pageobject.LandingPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

public class BaseTest {
    public static WebDriver driver;
    public static LandingPage landingPage;

    public static WebDriver intiliazeDriver() throws IOException
    {
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\ecomproject\\resources\\GloabalData.properties");
        prop.load(fis);
        String browserName=prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();

        }
        else if (browserName.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
            //firefoxcode code
        }
        else if (browserName.equalsIgnoreCase("eadge"))
        {
            driver = new EdgeDriver();
            //eadgebrowser code
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
    public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException {
        //read json to string
        String jasoncontent= FileUtils.readFileToString(new File(filePath)
                , StandardCharsets.UTF_8);
        //convert sstring to hasm map
        ObjectMapper mapper=new ObjectMapper();
        List<HashMap<String,String>> data=mapper.readValue(jasoncontent, new TypeReference<List<HashMap<String,String>>>() {
        });
        return data;
    }

    public String getScreenShot(String testCaseName,WebDriver driver) throws IOException {
        TakesScreenshot ts= (TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File file=new File(System.getProperty("user.dir")+"//reports//"+ testCaseName + ".png");
        FileUtils.copyFile(source, file);
        return System.getProperty("user.dir")+"//reports//"+ testCaseName + ".png";
    }

    @BeforeMethod(alwaysRun = true)
        public static LandingPage launchApplication() throws IOException {
        driver = intiliazeDriver();
        landingPage = new LandingPage(driver);
        landingPage.goTo();
        return landingPage;


    }
    @AfterMethod(alwaysRun = true)
    public void tearDown()
    {
        driver.close();
    }

}

