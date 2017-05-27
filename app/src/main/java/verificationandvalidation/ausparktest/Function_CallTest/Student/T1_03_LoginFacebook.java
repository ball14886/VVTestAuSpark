package verificationandvalidation.ausparktest.Function_CallTest.Student;

import org.junit.Assert;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T1_03_LoginFacebook {

    Functions func = new Functions();

    public void Test_T1_03_01(AppiumDriver driver) throws Exception {

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/facebook_backgroundLoginButton").click();
        func.threadSleep_2();

        String btn_facebook_text = func.getElementByID(driver, "edu.au.auspark:id/facebook_backgroundLoginButton").getText();

        boolean isSuccess = !func.stringComparision("Connect to Facebook", btn_facebook_text);
        Assert.assertTrue(isSuccess);
    }

}
