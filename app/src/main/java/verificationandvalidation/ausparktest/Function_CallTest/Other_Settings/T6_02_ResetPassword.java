package verificationandvalidation.ausparktest.Function_CallTest.Other_Settings;

import org.junit.Assert;
import org.junit.Test;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T6_02_ResetPassword {

    Functions func = new Functions();
    
    @Test
    public void Test_T3_03_01(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_gradeList").click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_reset_password").click();
        func.threadSleep_2();

        String studentID = func.getElementByID(driver, "edu.au.auspark:id/transcript_studentID").getText();
        Assert.assertTrue(func.stringComparision(studentID,"5611779"));

    }

}
