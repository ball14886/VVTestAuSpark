package verificationandvalidation.ausparktest.Function_CallTest.Student;

import org.junit.Assert;
import org.junit.Test;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by USER on 5/28/2017.
 */

public class T2_02_AdvisingInformation {

    Functions func = new Functions();

    @Test
    public void Test_T2_02_01(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/facebook_backgroundLoginButton").click();
        func.threadSleep_2();

        Assert.assertEquals(func.getElementByID(driver, "edu.au.auspark:id/regis_time_status").getText(),"Allowed");
    }

}
