package verificationandvalidation.ausparktest.Function_CallTest.Academic_Record;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T3_03_Transcript {

    Functions func = new Functions();
    
    @Test
    public void Test_T3_03_01(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_gradeList").click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_printTransaction").click();
        func.threadSleep_2();

        String studentID = func.getElementByID(driver, "edu.au.auspark:id/transcript_studentID").getText();
        Assert.assertTrue(func.stringComparision(studentID,"5611779"));

    }

}
