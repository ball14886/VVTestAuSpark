package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

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

public class T5_07_PreRegisterWithSavedSchedule {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T5_07_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_planList").click();
        func.threadSleep_4();

        MobileElement container_planSchedule = func.getElementByID(driver, "edu.au.auspark:id/regisPlannerHolder");
        List<MobileElement> planScheduleList = container_planSchedule.findElements(By.className("android.widget.LinearLayout"));

        planScheduleList.get(0).click();

        func.getElementByID(driver,planScheduleList.get(0), "edu.au.auspark:id/regisBtn").click();
        func.threadSleep_2();

        func.getElementByID(driver, "android:id/message");
        func.threadSleep_2();

        //func.getElementByID(driver, "android:id/button1"); // confirm
        //func.threadSleep_4();

        //func.getElementByID(driver, "android:id/button2"); // cancel
        //func.threadSleep_2();

        MobileElement toolbar = func.getElementByID(driver, "edu.au.auspark:id/toolbar");
        String titleToolbar = toolbar.findElements(By.className("android.widget.TextView")).get(0).getText();
        Assert.assertTrue(func.stringComparision(titleToolbar, "*************"));



    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
