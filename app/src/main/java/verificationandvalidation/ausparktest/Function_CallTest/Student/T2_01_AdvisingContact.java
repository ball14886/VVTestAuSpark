package verificationandvalidation.ausparktest.Function_CallTest.Student;

import org.junit.Assert;
import org.junit.Test;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by USER on 5/28/2017.
 */

public class T2_01_AdvisingContact {

    Functions func = new Functions();

    @Test
    public void Test_T2_01_01(AppiumDriver driver) throws Exception {

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/title_advisor").click();
        func.threadSleep_2();

        Assert.assertEquals(func.getElementByID(driver, "edu.au.auspark:id/advisorName").getText(),"SONGSAK CHANNARUKUL");
        Assert.assertEquals(func.getElementByID(driver, "edu.au.auspark:id/advisorFaculty").getText(),"SCIENCE AND TECHNOLOGY");
        Assert.assertEquals(func.getElementByID(driver, "edu.au.auspark:id/advisorDepartment").getText(),"COMPUTER SCIENCE");
        Assert.assertEquals(func.getElementByID(driver, "edu.au.auspark:id/advisorEmail").getText(),"songsak@gmail.com");
        Assert.assertEquals(func.getElementByID(driver, "edu.au.auspark:id/advisorOfficeRoom").getText(),"VMS 0608");
        Assert.assertEquals(func.getElementByID(driver, "edu.au.auspark:id/advisorOfficePhone").getText(),"027232380");

    }
}
