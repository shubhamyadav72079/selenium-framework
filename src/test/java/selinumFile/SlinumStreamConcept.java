package selinumFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class SlinumStreamConcept {
    public static void main(String[] args) {


        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
        List<WebElement> elementList =driver.findElements(By.xpath("//tr/td[1]"));
        List<String> orginal=elementList.stream().map(s->s.getText()).collect(Collectors.toList());
        System.out.println(orginal);
        List<String> sortedList=orginal.stream().sorted().collect(Collectors.toList());
        Assert.assertTrue(orginal.equals(sortedList));

        List<String> price;
        do {

            List<WebElement> elementList1 =driver.findElements(By.xpath("//tr/td[1]"));

              price=elementList1.stream().filter(s -> s.getText().contains("Mango"))
                    .map(s -> getPriceOfVegie(s)).collect(Collectors.toList());
            price.forEach(a -> System.out.println(a));
            if (price.size() < 1) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }

        }while (price.size()<1);

        driver.quit();
    }

    private static String getPriceOfVegie(WebElement s) {
        String priceValue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }

}
