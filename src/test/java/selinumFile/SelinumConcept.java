package selinumFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelinumConcept {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\mohit\\IdeaProjects\\dummy4\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver Driver =new ChromeDriver();
        Driver.get("https://www.facebook.com/");
        Driver.navigate().refresh();
        Driver.manage().window().maximize();
        WebElement email =Driver.findElement(By.name("email"));
        email.sendKeys("Shubham");
        WebElement password =Driver.findElement(By.id("pass"));
        password.sendKeys("01234567891");
        Driver.findElement(By.name("login")).click();
////        Driver.quit();
//        Driver.navigate().to("https://www.google.com/?zx=1758110487703&no_sw_cr=1");
//        Driver.navigate().back();
//        Driver.navigate().forward();
//        String Url=Driver.getCurrentUrl();
//        String tiele=Driver.getTitle();
//        System.out.println(Url);
//        System.out.println(tiele);


    }

}


