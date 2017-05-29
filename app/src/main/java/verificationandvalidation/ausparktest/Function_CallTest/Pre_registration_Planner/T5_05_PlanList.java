package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T5_05_PlanList {

    Functions func = new Functions();
    
    @Test
    public void Test_T5_05_01(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_planList").click();
        func.threadSleep_4();

        MobileElement container_planSchedule = func.getElementByID(driver, "edu.au.auspark:id/regisPlannerHolder");
        List<MobileElement> planScheduleList = container_planSchedule.findElements(By.className("android.widget.LinearLayout"));

        for (MobileElement planSchedule : planScheduleList){
            String courseNumber = func.GetText_ElementByID(driver, planSchedule, "edu.au.auspark:id/courseNum");
            Assert.assertTrue(func.stringComparision(courseNumber, "*************"));

            String creditNumber = func.GetText_ElementByID(driver, planSchedule, "edu.au.auspark:id/creditNum");
            Assert.assertTrue(func.stringComparision(creditNumber, "*************"));

            String heartAmount = func.GetText_ElementByID(driver, planSchedule, "edu.au.auspark:id/heart_amount");
            Assert.assertTrue(func.stringComparision(heartAmount, "*************"));

            MobileElement container_coursePlanSchedule = planSchedule.findElement(By.id("edu.au.auspark:id/regisPlannerBlockDetailHolder"));
            List<MobileElement> coursePlanScheduleList = planSchedule.findElements(By.className("android.widget.LinearLayout"));

            for (MobileElement coursePlan : coursePlanScheduleList){
                String courseCode = func.GetText_ElementByID(driver, coursePlan, "edu.au.auspark:id/courseID");
                Assert.assertTrue(func.stringComparision(courseCode, "*************"));

                String courseName = func.GetText_ElementByID(driver, coursePlan, "edu.au.auspark:id/subject");
                Assert.assertTrue(func.stringComparision(courseName, "*************"));

            }
        }

    }

}
