package verificationandvalidation.ausparktest.Function_CallTest.Academic_Record;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T3_03_Transcript {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T3_03_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_gradeList").click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_printTransaction").click();
        func.threadSleep_2();

        String studentID = func.getElementByID(driver, "edu.au.auspark:id/transcript_studentID").getText();
        Assert.assertTrue(func.stringComparision(studentID,"5611779"));
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/transcript_confirm").click();
        func.threadSleep_2();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
