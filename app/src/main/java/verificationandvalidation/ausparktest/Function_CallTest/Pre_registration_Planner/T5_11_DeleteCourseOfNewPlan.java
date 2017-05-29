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

public class T5_11_DeleteCourseOfNewPlan {

    Functions func = new Functions();
    
    @Test
    public void Test_T5_11_01(AppiumDriver driver) throws Exception {
        T5_10_AddCourseToNewPlan T5_10 = new T5_10_AddCourseToNewPlan();
        String courseCodeTest = "ACT1600";
        T5_10.AddNewPlan(driver,courseCodeTest); // Add New Course (ACT1600)

        MobileElement container_newPlannerCourse = func.getElementByID(driver, "edu.au.auspark:id/newPlannerBlockDetailHolder");
        List<MobileElement> newPlannerCourseList = container_newPlannerCourse.findElements(By.className("android.widget.RelativeLayout"));

        Boolean isFound = false;
        for (MobileElement newPlannerCourse : newPlannerCourseList){
            String courseCode = func.getElementByID(driver, newPlannerCourse, "edu.au.auspark:id/courseID").getText();
//            Assert.assertTrue(func.stringComparision(courseCode, "*************"));

            if (func.stringComparision(courseCodeTest, courseCode)){
                isFound = true;
                func.getElementByID(driver, newPlannerCourse, "edu.au.auspark:id/btnBin").click();
                func.threadSleep_3();

                Assert.assertTrue(true);
            }
        }

        if (!isFound){
            Assert.assertTrue(false);
        }
    }



}
