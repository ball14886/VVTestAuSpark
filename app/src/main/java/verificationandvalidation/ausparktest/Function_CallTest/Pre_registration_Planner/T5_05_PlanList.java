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

public class T5_05_PlanList {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }
    @Test
    public void Test_T5_05_01() throws Exception {
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

        for (MobileElement planSchedule : planScheduleList){
            String courseNumber = func.getElementByID(driver, planSchedule, "edu.au.auspark:id/courseNum").getText();
            Assert.assertTrue(func.stringComparision(courseNumber, "*************"));

            String creditNumber = func.getElementByID(driver, planSchedule, "edu.au.auspark:id/creditNum").getText();
            Assert.assertTrue(func.stringComparision(creditNumber, "*************"));

            String heartAmount = func.getElementByID(driver, planSchedule, "edu.au.auspark:id/heart_amount").getText();
            Assert.assertTrue(func.stringComparision(heartAmount, "*************"));

            MobileElement container_coursePlanSchedule = planSchedule.findElement(By.id("edu.au.auspark:id/regisPlannerBlockDetailHolder"));
            List<MobileElement> coursePlanScheduleList = planSchedule.findElements(By.className("android.widget.LinearLayout"));

            for (MobileElement coursePlan : coursePlanScheduleList){
                String courseCode = func.getElementByID(driver, coursePlan, "edu.au.auspark:id/courseID").getText();
                Assert.assertTrue(func.stringComparision(courseCode, "*************"));

                String courseName = func.getElementByID(driver, coursePlan, "edu.au.auspark:id/subject").getText();
                Assert.assertTrue(func.stringComparision(courseName, "*************"));

            }
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
