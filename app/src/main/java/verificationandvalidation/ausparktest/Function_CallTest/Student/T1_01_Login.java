package verificationandvalidation.ausparktest.Function_CallTest.Student;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import verificationandvalidation.ausparktest.Provider.Functions;
import verificationandvalidation.ausparktest.Provider.SecurityProvider;
import verificationandvalidation.ausparktest.Provider.SetupProvider;

/**
 * Created by USER on 5/5/2017.
 */

public class T1_01_Login {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T1_01_01() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("5611779");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("supantoyy");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_2();
    }

    @Test
    public void Test_T1_01_02() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_2();

        System.out.println("Test_T1_01_02()");
        boolean isLogin = func.isAuthorization(driver);
        Assert.assertFalse(isLogin);

    }

    @Test
    public void Test_T1_01_03() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("5611779");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("1");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_2();

        boolean isLogin = func.isAuthorization(driver);
        Assert.assertFalse(isLogin);

    }

    @Test
    public void Test_T1_01_04() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("1");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_2();

        boolean isLogin = func.isAuthorization(driver);
        Assert.assertFalse(isLogin);
    }

    @Test
    public void Test_T1_01_05() throws Exception {
        func.getElementByID(driver, "edu.au.auspark:id/edtID").sendKeys("");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/edtPass").sendKeys("1");
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/btnLogin").click();
        func.threadSleep_2();

        boolean isLogin = func.isAuthorization(driver);
        Assert.assertFalse(isLogin);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
