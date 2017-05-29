package verificationandvalidation.ausparktest.Function_CallTest.Schedule;

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

public class T4_01_Schedule {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T4_01_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSchedule").click();
        func.threadSleep_4();

        String semesterYear = func.getElementByID(driver, "edu.au.auspark:id/semester").getText();


        MobileElement container_schedule = func.getElementByID(driver, "edu.au.auspark:id/ScheduleBlockHolder");
        List<MobileElement> schedule_courseList = container_schedule.findElements(By.className("android.widget.LinearLayout"));

        for (MobileElement course : schedule_courseList){
            String courseCode = func.getElementByID(driver, course, "edu.au.auspark:id/courseID").getText();
            Assert.assertTrue(func.stringComparision(courseCode,""));  // *****

            String sectionNumber = func.getElementByID(driver, course, "edu.au.auspark:id/courseSection").getText();
            Assert.assertTrue(func.stringComparision(sectionNumber,""));  // *****

            String courseTitle = func.getElementByID(driver, course, "edu.au.auspark:id/courseName").getText();
            Assert.assertTrue(func.stringComparision(courseTitle,""));  // *****

            String remark = func.getElementByID(driver, course, "edu.au.auspark:id/schedule_block_remark").getText();
            Assert.assertTrue(func.stringComparision(remark,""));  // *****

            MobileElement container_sectionClass = course.findElement(By.id("edu.au.auspark:id/ScheduleListDetail"));
            List<MobileElement> sectionClassList = container_sectionClass.findElements(By.className("android.widget.FrameLayout"));

            for (MobileElement sectionClass : sectionClassList){
                String dayName = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/dayName").getText();
                Assert.assertTrue(func.stringComparision(dayName,""));  // *****

                String time = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/courseTime").getText();
                Assert.assertTrue(func.stringComparision(time,""));  // *****

                String room = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/roomCode").getText();
                Assert.assertTrue(func.stringComparision(room,""));  // *****

                String instructorName = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/courseInstructor").getText();
                Assert.assertTrue(func.stringComparision(instructorName,""));  // *****
            }
        }


        String studentID = func.getElementByID(driver, "edu.au.auspark:id/transcript_studentID").getText();
        Assert.assertTrue(func.stringComparision(studentID,"5611779"));

    }


    @After
    public void tearDown(){
        driver.quit();
    }

}
