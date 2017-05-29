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

public class T1_02_ForgetPassword {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T1_02_01() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/forgetPassword").click();
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/forget_password_studentcode").sendKeys("5611779");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/forget_password_email").sendKeys("supanat@hotmail.com");
        func.threadSleep_1();

        func.getElementByID(driver, "android:id/button1").click();
        func.threadSleep_4();

    }

    @Test
    public void Test_T1_02_02() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/forgetPassword").click();
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/forget_password_studentcode").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/forget_password_email").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "android:id/button1").click();
        func.threadSleep_4();

    }

    @Test
    public void Test_T1_02_03() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/forgetPassword").click();
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/forget_password_studentcode").sendKeys("5611779");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/forget_password_email").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "android:id/button1").click();
        func.threadSleep_4();

    }

    @Test
    public void Test_T1_02_04() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/forgetPassword").click();
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/forget_password_studentcode").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/forget_password_email").sendKeys("supanat@hotmail.com");
        func.threadSleep_1();

        func.getElementByID(driver, "android:id/button1").click();
        func.threadSleep_4();

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
