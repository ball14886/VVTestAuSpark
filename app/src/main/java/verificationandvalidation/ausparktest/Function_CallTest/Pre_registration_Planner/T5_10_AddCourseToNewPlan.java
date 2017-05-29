package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T5_10_AddCourseToNewPlan {

    Functions func = new Functions();
    
    @Test
    public void Test_T5_08_01(AppiumDriver driver) throws Exception {
        String courseCodeTest = "ACT1600";
        AddNewPlan(driver, courseCodeTest);
    }

    public void AddNewPlan(AppiumDriver driver, String newCourseCode) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_planList").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/action_addplan").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/addCourse").click();
        func.threadSleep_3();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").setValue(newCourseCode);
        func.threadSleep_2();

        MobileElement container_course = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_course.findElements(By.className("android.widget.LinearLayout"));

        courseList.get(0).click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/selectAllSection").click();
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/action_confirm").click();
        func.threadSleep_2();

        MobileElement container_newPlannerCourse = func.getElementByID(driver, "edu.au.auspark:id/newPlannerBlockDetailHolder");
        List<MobileElement> newPlannerCourseList = container_newPlannerCourse.findElements(By.className("android.widget.RelativeLayout"));

        Boolean isFound = false;
        for (MobileElement newPlannerCourse : newPlannerCourseList){
            String courseCode = func.getElementByID(driver, newPlannerCourse, "edu.au.auspark:id/courseID").getText();
//            Assert.assertTrue(func.stringComparision(courseCode, "*************"));

            if (func.stringComparision(newCourseCode, courseCode)){
                isFound = true;
                Assert.assertTrue(true);
            }
        }

        if (!isFound){
            Assert.assertTrue(false);
        }
        func.threadSleep_2();
    }



}
