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

public class T5_08_CourseOfNewPlan {

    Functions func = new Functions();
    
    @Test
    public void Test_T5_08_01(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_planList").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/action_addplan").click();
        func.threadSleep_4();

        String txt_credit_limit = func.getElementByID(driver, "edu.au.auspark:id/txt_credit_limit").getText();
        Assert.assertTrue(func.stringComparision(txt_credit_limit, "*************"));

        String courseNumber = func.getElementByID(driver, "edu.au.auspark:id/courseNum").getText();
        Assert.assertTrue(func.stringComparision(courseNumber, "*************"));

        String creditNumber = func.getElementByID(driver, "edu.au.auspark:id/creditNum").getText();
        Assert.assertTrue(func.stringComparision(creditNumber, "*************"));

        String planner_status = func.getElementByID(driver, "edu.au.auspark:id/planner_status").getText();
        Assert.assertTrue(func.stringComparision(planner_status, "*************"));

        MobileElement container_newPlannerCourse = func.getElementByID(driver, "edu.au.auspark:id/newPlannerBlockDetailHolder");
        List<MobileElement> newPlannerCourseList = container_newPlannerCourse.findElements(By.className("android.widget.RelativeLayout"));

        for (MobileElement newPlannerCourse : newPlannerCourseList){
            String courseCode = func.getElementByID(driver, newPlannerCourse, "edu.au.auspark:id/courseID").getText();
            Assert.assertTrue(func.stringComparision(courseCode, "*************"));

            String courseName = func.getElementByID(driver, newPlannerCourse, "edu.au.auspark:id/subject").getText();
            Assert.assertTrue(func.stringComparision(courseName, "*************"));

            String sectionsSelected = func.getElementByID(driver, newPlannerCourse, "edu.au.auspark:id/sectionNum").getText();
            Assert.assertTrue(func.stringComparision(sectionsSelected, "*************"));


        }
    }





}
