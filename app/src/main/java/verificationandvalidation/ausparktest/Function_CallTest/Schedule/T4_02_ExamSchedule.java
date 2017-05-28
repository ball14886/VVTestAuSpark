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

public class T4_02_ExamSchedule {

    Functions func = new Functions();
    
    @Test
    public void Test_T4_02_01(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSchedule").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/scheduleExam").click();
        func.threadSleep_1();

        MobileElement container_examSchedule = func.getElementByID(driver, "edu.au.auspark:id/ExamBlockHolderFinal");
        List<MobileElement> examSchedule_courseList = container_examSchedule.findElements(By.className("android.widget.LinearLayout"));

        for (MobileElement course : examSchedule_courseList){
            String examDate = func.GetText_ElementByID(driver, course, "edu.au.auspark:id/examDate");
            Assert.assertTrue(func.stringComparision(examDate,""));  // *****

            String examDayName = func.GetText_ElementByID(driver, course, "edu.au.auspark:id/examDayName");
            Assert.assertTrue(func.stringComparision(examDayName,""));  // *****

            MobileElement container_sectionClass = course.findElement(By.id("edu.au.auspark:id/examListDetail"));
            List<MobileElement> sectionClassList = container_sectionClass.findElements(By.className("android.widget.LinearLayout"));

            for (MobileElement sectionClass : sectionClassList){
                String startTime = func.GetText_ElementByID(driver, sectionClass, "edu.au.auspark:id/startTime");
                Assert.assertTrue(func.stringComparision(startTime,""));  // *****

                String endTime = func.GetText_ElementByID(driver, sectionClass, "edu.au.auspark:id/endTime");
                Assert.assertTrue(func.stringComparision(endTime,""));  // *****

                String courseTitle = func.GetText_ElementByID(driver, sectionClass, "edu.au.auspark:id/subject");
                Assert.assertTrue(func.stringComparision(courseTitle,""));  // *****

                String room = func.GetText_ElementByID(driver, sectionClass, "edu.au.auspark:id/room");
                Assert.assertTrue(func.stringComparision(room,""));  // *****
            }
        }


        String studentID = func.getElementByID(driver, "edu.au.auspark:id/transcript_studentID").getText();
        Assert.assertTrue(func.stringComparision(studentID,"5611779"));

    }

}
