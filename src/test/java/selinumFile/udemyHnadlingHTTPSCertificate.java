package selinumFile;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class udemyHnadlingHTTPSCertificate {
    public static void main(String[] args) throws Exception {
        ChromeOptions options= new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());

        Thread.sleep(4000);
        driver.quit();

    }
}
