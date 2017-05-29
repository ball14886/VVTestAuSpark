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

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_mail_address").sendKeys("supanat@hotmail.com");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_phone_number").sendKeys("0908454505");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_current_password").sendKeys("supantoy");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_new_password").sendKeys("11779");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_confirm_new_password").sendKeys("11779");
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

        String alertMessage = func.getElementByID(driver, "").getText();
        Assert.assertTrue(func.stringComparision("", alertMessage));

    }

    @Test
    public void Test_T3_03_02(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_gradeList").click();
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

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

        String alertMessage = func.getElementByID(driver, "Some fields are missing").getText();
        Assert.assertTrue(func.stringComparision("", alertMessage));
    }

    @Test
    public void Test_T3_03_03(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_gradeList").click();
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

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

        String alertMessage = func.getElementByID(driver, "Some fields are missing").getText();
        Assert.assertTrue(func.stringComparision("", alertMessage));
    }

    @Test
    public void Test_T3_03_04(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_gradeList").click();
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

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

        String alertMessage = func.getElementByID(driver, "New Password not matched").getText();
        Assert.assertTrue(func.stringComparision("", alertMessage));
    }

    @Test
    public void Test_T3_03_05(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_gradeList").click();
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

        func.getElementByID(driver, "edu.au.auspark:id/add_secondary_submit").click();
        func.threadSleep_5();

        String alertMessage = func.getElementByID(driver, "Incorrect entered password").getText();
        Assert.assertTrue(func.stringComparision("", alertMessage));
    }

}
