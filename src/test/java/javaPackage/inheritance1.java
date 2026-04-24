package javaPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class inheritance1 {
    public void parent(){
        System.out.println("Shubham is you can do this");
    }
    @BeforeMethod
    public void ab(){
        System.out.println("i will execute first");
    }
    @AfterMethod
    public void ac(){
        System.out.println("i will execute last");
    }
}
