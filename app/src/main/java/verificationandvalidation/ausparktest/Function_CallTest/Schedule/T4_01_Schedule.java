package verificationandvalidation.ausparktest.Function_CallTest.Schedule;

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

public class T4_01_Schedule {

    Functions func = new Functions();
    
    @Test
    public void Test_T4_01_01(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSchedule").click();
        func.threadSleep_4();

        String semesterYear = func.getElementByID(driver, "edu.au.auspark:id/semester").getText();


        MobileElement container_schedule = func.getElementByID(driver, "edu.au.auspark:id/ScheduleBlockHolder");
        List<MobileElement> schedule_courseList = container_schedule.findElements(By.className("android.widget.LinearLayout"));

        for (MobileElement course : schedule_courseList){
            String courseCode = func.getElementByID(driver, course, "edu.au.auspark:id/courseID");
            Assert.assertTrue(func.stringComparision(courseCode,""));  // *****

            String sectionNumber = func.getElementByID(driver, course, "edu.au.auspark:id/courseSection");
            Assert.assertTrue(func.stringComparision(sectionNumber,""));  // *****

            String courseTitle = func.getElementByID(driver, course, "edu.au.auspark:id/courseName");
            Assert.assertTrue(func.stringComparision(courseTitle,""));  // *****

            String remark = func.getElementByID(driver, course, "edu.au.auspark:id/schedule_block_remark");
            Assert.assertTrue(func.stringComparision(remark,""));  // *****

            MobileElement container_sectionClass = course.findElement(By.id("edu.au.auspark:id/ScheduleListDetail"));
            List<MobileElement> sectionClassList = container_sectionClass.findElements(By.className("android.widget.FrameLayout"));

            for (MobileElement sectionClass : sectionClassList){
                String dayName = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/dayName");
                Assert.assertTrue(func.stringComparision(dayName,""));  // *****

                String time = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/courseTime");
                Assert.assertTrue(func.stringComparision(time,""));  // *****

                String room = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/roomCode");
                Assert.assertTrue(func.stringComparision(room,""));  // *****

                String instructorName = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/courseInstructor");
                Assert.assertTrue(func.stringComparision(instructorName,""));  // *****
            }
        }


        String studentID = func.getElementByID(driver, "edu.au.auspark:id/transcript_studentID").getText();
        Assert.assertTrue(func.stringComparision(studentID,"5611779"));

    }

}
