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

public class T1_04_Logout {

    Functions func = new Functions();

    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T1_04_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_logout").click();
        func.threadSleep_2();

        boolean isSuccess = !func.isAuthorization(driver);
        Assert.assertTrue(isSuccess);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
