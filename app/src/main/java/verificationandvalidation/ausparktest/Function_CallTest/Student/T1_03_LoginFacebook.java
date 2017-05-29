package verificationandvalidation.ausparktest.Function_CallTest.Student;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T1_03_LoginFacebook {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T1_03_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/facebook_backgroundLoginButton").click();
        func.threadSleep_2();

        String btn_facebook_text = func.getElementByID(driver, "edu.au.auspark:id/facebook_backgroundLoginButton").getText();

        boolean isSuccess = !func.stringComparision("Connect to Facebook", btn_facebook_text);
        Assert.assertTrue(isSuccess);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
