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

public class T5_06_SavedScheduleAtPlan {

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

        planScheduleList.get(0).click(); // Select first plan schedule

        MobileElement container_savedSchedule = func.getElementByID(driver, "edu.au.auspark:id/generatedScheduleList");
        List<MobileElement> savedScheduleList = container_savedSchedule.findElements(By.className("android.widget.LinearLayout"));

        for (MobileElement savedSchedule : savedScheduleList){
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

    @After
    public void tearDown(){
        driver.quit();
    }

}
