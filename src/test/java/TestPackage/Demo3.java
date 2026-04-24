package TestPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
//    @Parameters({"URL","api"})
    @Test(dataProvider = "data")
    public void practice3(String username,String pasword){
        System.out.println("Shubham You can do this ");
        System.out.println(username);
        System.out.println(pasword);

    }
    @DataProvider
    @Test
    public Object[][] data(){
        Object[][] data =new Object[3][2];
        data[0][0]="00";
        data[0][1]="01";

        data[1][0]="10";
        data[1][1]="11";

        data[2][0]="20";
        data[2][1]="21";
        return data;


    }
}
