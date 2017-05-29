package verificationandvalidation.ausparktest.Function_CallTest.Advisor;

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

public class T2_01_AdvisorContact {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T2_01_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_advisor").click();
        func.threadSleep_1();

        String advisorName = func.getElementByID(driver, "edu.au.auspark:id/advisorName").getText();
        Assert.assertTrue(func.stringComparision(advisorName,"SONGSAK CHANNARUKUL"));
        func.threadSleep_1();

        String advisorFaculty = func.getElementByID(driver, "edu.au.auspark:id/advisorFaculty").getText();
        Assert.assertTrue(func.stringComparision(advisorFaculty,"SCIENCE AND TECHNOLOGY"));
        func.threadSleep_1();

        String advisorDepartment = func.getElementByID(driver, "edu.au.auspark:id/advisorDepartment").getText();
        Assert.assertTrue(func.stringComparision(advisorDepartment,"COMPUTER SCIENCE"));
        func.threadSleep_1();

        String advisorEmail = func.getElementByID(driver, "edu.au.auspark:id/advisorEmail").getText();
        Assert.assertTrue(func.stringComparision(advisorEmail,"songsakchn@au.edu"));
        func.threadSleep_1();

        String advisorOfficeRoom = func.getElementByID(driver, "edu.au.auspark:id/advisorOfficeRoom").getText();
        Assert.assertTrue(func.stringComparision(advisorOfficeRoom,"VMS 0608"));
        func.threadSleep_1();

        String advisorOfficePhone = func.getElementByID(driver, "edu.au.auspark:id/advisorOfficePhone").getText();
        Assert.assertTrue(func.stringComparision(advisorOfficePhone,"027232380"));
        func.threadSleep_1();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
