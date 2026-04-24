package selinumFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        ChromeDriver drive= new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        drive.findElement(By.xpath("//input[@type='search']")).sendKeys("Rice");
        List<WebElement> vegies=drive.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> rows=vegies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
        Assert.assertEquals(vegies.size(),rows.size());

    }
}
