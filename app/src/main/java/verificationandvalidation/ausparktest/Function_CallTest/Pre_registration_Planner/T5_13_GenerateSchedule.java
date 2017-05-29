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

public class T5_13_GenerateSchedule {

    Functions func = new Functions();
    
    @Test
    public void Test_T5_13_01(AppiumDriver driver) throws Exception {
        T5_10_AddCourseToNewPlan T5_10 = new T5_10_AddCourseToNewPlan();
        T5_10.AddNewPlan(driver,"ACT1600"); // Add New Course (ACT1600)
        T5_10.AddNewPlan(driver,"ACT3626"); // Add New Course (ACT1600)

        func.getElementByID(driver, "edu.au.auspark:id/showSchedule").click();
        func.threadSleep_5();

        MobileElement container_generateSchedule = func.getElementByID(driver, "edu.au.auspark:id/generatedScheduleList");
        List<MobileElement> generateScheduleList = container_generateSchedule.findElements(By.className("android.widget.LinearLayout"));

        for (MobileElement savedSchedule : generateScheduleList){
            String courseNumber = func.getElementByID(driver, savedSchedule, "edu.au.auspark:id/scheduleCount").getText();
            Assert.assertTrue(func.stringComparision(courseNumber, "*************"));

            Boolean isSelectedHeart = func.getElementByID(driver, savedSchedule, "edu.au.auspark:id/heart").isSelected();
            Assert.assertSame(isSelectedHeart, "*******************");

            MobileElement container_seatHolder = savedSchedule.findElement(By.id("edu.au.auspark:id/seatHolder"));
            List<MobileElement> seatCourseList = container_seatHolder.findElements(By.className("android.widget.LinearLayout"));

            for (MobileElement seatCourse : seatCourseList){
                String seatNumber = func.getElementByID(driver, savedSchedule, "edu.au.auspark:id/seat").getText();
                Assert.assertTrue(func.stringComparision(seatNumber, "*************"));
            }

            MobileElement container_savedCourse = savedSchedule.findElement(By.id("edu.au.auspark:id/schedule_block_remark"));
            List<MobileElement> savedCourseList = container_seatHolder.findElements(By.className("android.widget.LinearLayout"));

            for (MobileElement savedCourse : savedCourseList){
                String courseCode = func.getElementByID(driver, savedCourse, "edu.au.auspark:id/courseID").getText();
                Assert.assertTrue(func.stringComparision(courseCode, "*************"));

                String sectionNumber = func.getElementByID(driver, savedCourse, "edu.au.auspark:id/courseSection").getText();
                Assert.assertTrue(func.stringComparision(sectionNumber, "*************"));

                String courseName = func.getElementByID(driver, savedCourse, "edu.au.auspark:id/courseName").getText();
                Assert.assertTrue(func.stringComparision(courseName, "*************"));

                String remark = func.getElementByID(driver, savedCourse, "edu.au.auspark:id/schedule_block_remark").getText();
                Assert.assertTrue(func.stringComparision(remark, "*************"));

                MobileElement container_classDetails = savedSchedule.findElement(By.id("edu.au.auspark:id/ScheduleListDetail"));
                List<MobileElement> classDetailsList = container_classDetails.findElements(By.className("android.widget.FrameLayout"));

                for (MobileElement classDetails : classDetailsList){
                    String dayName = func.getElementByID(driver, classDetails, "edu.au.auspark:id/dayName").getText();
                    Assert.assertTrue(func.stringComparision(dayName, "*************"));

                    String courseTime = func.getElementByID(driver, classDetails, "edu.au.auspark:id/courseTime").getText();
                    Assert.assertTrue(func.stringComparision(courseTime, "*************"));

                    String roomCode = func.getElementByID(driver, classDetails, "edu.au.auspark:id/roomCode").getText();
                    Assert.assertTrue(func.stringComparision(roomCode, "*************"));

                    String instructorName = func.getElementByID(driver, classDetails, "edu.au.auspark:id/courseInstructor").getText();
                    Assert.assertTrue(func.stringComparision(instructorName, "*************"));
                }
            }

        }

    }
}