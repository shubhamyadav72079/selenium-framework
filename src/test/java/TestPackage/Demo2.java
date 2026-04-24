package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
    @Parameters({"URL"})
    @Test
    public void practice2(String urlname){
        System.out.println("hey Shubham");
        System.out.println(urlname);
    }
    @Test
    public void practice4() {
        System.out.println("hey Shubham");
        Assert.assertTrue(false);
    }

}
