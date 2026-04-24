package TestPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
    @Parameters({"URL"})
    @Test
    public void practice(String urlname){
        System.out.println("Shubham yadav is Best Software Tester");
        System.out.println(urlname);
    }
}
