package verificationandvalidation.ausparktest.Function_CallTest.Other_Settings;

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

public class T6_01_Calendar {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T6_01_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_calendar").click();
        func.threadSleep_2();

        MobileElement container_calendar = func.getElementByID(driver, "edu.au.auspark:id/au_calendar_block_holder");
        List<MobileElement> calendarMonthList = container_calendar.findElements(By.className("android.widget.LinearLayout"));


        for (MobileElement calendarMonth : calendarMonthList) {

            String monthName = func.getElementByID(driver, "edu.au.auspark:id/month").getText();
            Assert.assertTrue(func.stringComparision("***********", monthName));

            String yearNumber = func.getElementByID(driver, "edu.au.auspark:id/month").getText();
            Assert.assertTrue(func.stringComparision("***********", yearNumber));

            func.getElementByID(driver, "edu.au.auspark:id/more_info_btn").click();
            func.threadSleep_2();

            MobileElement container_day = func.getElementByID(driver, calendarMonth, "edu.au.auspark:id/au_calendar_detail_block");
            List<MobileElement> dayList = container_calendar.findElements(By.className("android.widget.LinearLayout"));

            for (MobileElement day : dayList) {
                String dayNumber = func.getElementByID(driver, "edu.au.auspark:id/date_act").getText();
                Assert.assertTrue(func.stringComparision("***********", dayNumber));

                String colorDot = func.getElementByID(driver, "edu.au.auspark:id/color_dot").getText();
                Assert.assertTrue(func.stringComparision("***********", colorDot));

                String dayName = func.getElementByID(driver, "edu.au.auspark:id/activity").getText();
                Assert.assertTrue(func.stringComparision("***********", dayName));
            }

        }
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
