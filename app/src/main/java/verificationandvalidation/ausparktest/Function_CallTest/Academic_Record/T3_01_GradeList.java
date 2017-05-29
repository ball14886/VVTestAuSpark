package verificationandvalidation.ausparktest.Function_CallTest.Academic_Record;

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

public class T3_01_GradeList {

    Functions func = new Functions();

    @Test
    public void Test_T3_01_01(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_gradeList").click();
        func.threadSleep_1();

        MobileElement container_frame_GradeSemesterList = func.getElementByID(driver, "edu.au.auspark:id/academicSwipeRefresh");
        List<MobileElement> container_GradeSemesterList = container_frame_GradeSemesterList.findElements(By.className("android.widget.FrameLayout"));

        for (MobileElement container_GradeSemester : container_GradeSemesterList){
            String semesterYear = func.getElementByID(driver, container_GradeSemester, "edu.au.auspark:id/Academic_Semester").getText();
            String GPA = func.getElementByID(driver, container_GradeSemester, "edu.au.auspark:id/Academic_Grade").getText();
            String credit = func.getElementByID(driver, container_GradeSemester, "edu.au.auspark:id/Academic_Credit").getText();

            MobileElement container_gradeList = container_GradeSemester.findElement(By.id("edu.au.auspark:id/AcademicDetailHolder"));
            List<MobileElement> gradeList = container_gradeList.findElements(By.className("android.widget.FrameLayout"));
            for (MobileElement courseGrade : gradeList){
                String courseCode = func.getElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Course_ID").getText();
                Assert.assertTrue(func.stringComparision("*********",GPA));

                String courseName = func.getElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Subject").getText();
                Assert.assertTrue(func.stringComparision("*********",GPA));

                String grade = func.getElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Sub_Grade").getText();
                Assert.assertTrue(func.stringComparision("*********",GPA));

            }
        }

    }

}
