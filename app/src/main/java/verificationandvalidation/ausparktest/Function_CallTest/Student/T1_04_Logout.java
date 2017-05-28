package verificationandvalidation.ausparktest.Function_CallTest.Student;

import org.junit.Assert;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T1_04_Logout {

    Functions func = new Functions();

    public void Test_T1_04_01(AppiumDriver driver) throws Exception {

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_logout").click();
        func.threadSleep_2();

        boolean isSuccess = !func.isAuthorization(driver);
        Assert.assertTrue(isSuccess);
    }

}
