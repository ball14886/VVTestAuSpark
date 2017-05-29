package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by USER on 5/29/2017.
 */

public class T5_19_ClassSearchSection {
    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }
    @Test
    public void Test_T3_01_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSearch").click();
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").sendKeys("ACT1600");
        func.threadSleep_1();

        MobileElement container_course = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_course.findElements(By.className("android.widget.LinearLayout"));

        courseList.get(0).click();
        func.threadSleep_2();

        MobileElement container_section = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> sectionList = container_course.findElements(By.className("android.widget.LinearLayout"));

        for (MobileElement section : sectionList){

            String sectionNumber = func.getElementByID(driver, section, "edu.au.auspark:id/section").getText();
            Assert.assertTrue(func.stringComparision("*********",sectionNumber));

            String seat = func.getElementByID(driver, section, "edu.au.auspark:id/Academic_Grade").getText();
            Assert.assertTrue(func.stringComparision("*********",seat));
        }

    }
}
