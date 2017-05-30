package verificationandvalidation.ausparktest.Function_CallTest.Other_Settings;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T6_02_ResetPassword {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T6_02_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_reset_password").click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_mail_address").sendKeys("supanat@hotmail.com");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_phone_number").sendKeys("0908454505");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_current_password").sendKeys("supantoyy");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_new_password").sendKeys("supantoyy");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_confirm_new_password").sendKeys("supantoyy");
        func.threadSleep_2();

        func.hideKeyboard(driver);
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

//        String alertMessage = driver.findElement(By.linkText("222")).getText();
//        System.out.println("alert: " + alertMessage);
//        Assert.assertTrue(func.stringComparision("", alertMessage));

    }

    @Test
    public void Test_T6_02_02() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_reset_password").click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_mail_address").sendKeys("");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_phone_number").sendKeys("");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_current_password").sendKeys("supantoy");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_new_password").sendKeys("11779");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_confirm_new_password").sendKeys("11779");
        func.threadSleep_2();

        func.hideKeyboard(driver);
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

//        String alertMessage = func.getElementByID(driver, "Some fields are missing").getText();
//        Assert.assertTrue(func.stringComparision("", alertMessage));
    }

    @Test
    public void Test_T6_02_03() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_reset_password").click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_mail_address").sendKeys("supanat@hotmail.com");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_phone_number").sendKeys("0908454505");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_current_password").sendKeys("");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_new_password").sendKeys("");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_confirm_new_password").sendKeys("");
        func.threadSleep_2();

        func.hideKeyboard(driver);
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

//        String alertMessage = func.getElementByID(driver, "Some fields are missing").getText();
//        Assert.assertTrue(func.stringComparision("", alertMessage));
    }

    @Test
    public void Test_T6_02_04() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_reset_password").click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_mail_address").sendKeys("supanat@hotmail.com");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_phone_number").sendKeys("0908454505");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_current_password").sendKeys("xxxxxx");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_new_password").sendKeys("cccccc");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_confirm_new_password").sendKeys("ccccccc");
        func.threadSleep_2();

        func.hideKeyboard(driver);
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

//        String alertMessage = func.getElementByID(driver, "New Password not matched").getText();
//        Assert.assertTrue(func.stringComparision("", alertMessage));
    }

    @Test
    public void Test_T6_02_05() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_reset_password").click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_mail_address").sendKeys("supanat@hotmail.com");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_phone_number").sendKeys("0908454505");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_current_password").sendKeys("aaa");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_new_password").sendKeys("ccccccc");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_confirm_new_password").sendKeys("ccccccc");
        func.threadSleep_2();

        func.hideKeyboard(driver);
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

//        String alertMessage = func.getElementByID(driver, "Incorrect entered password").getText();
//        Assert.assertTrue(func.stringComparision("", alertMessage));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
