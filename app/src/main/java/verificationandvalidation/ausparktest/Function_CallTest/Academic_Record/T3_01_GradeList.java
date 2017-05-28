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
            String semesterYear = func.GetText_ElementByID(driver, container_GradeSemester, "edu.au.auspark:id/Academic_Semester");
            String GPA = func.GetText_ElementByID(driver, container_GradeSemester, "edu.au.auspark:id/Academic_Grade");
            String credit = func.GetText_ElementByID(driver, container_GradeSemester, "edu.au.auspark:id/Academic_Credit");

            MobileElement container_gradeList = container_GradeSemester.findElement(By.id("edu.au.auspark:id/AcademicDetailHolder"));
            List<MobileElement> gradeList = container_gradeList.findElements(By.className("android.widget.FrameLayout"));
            for (MobileElement courseGrade : gradeList){
                String courseCode = func.GetText_ElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Course_ID");
                Assert.assertTrue(func.stringComparision("*********",GPA));

                String courseName = func.GetText_ElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Subject");
                Assert.assertTrue(func.stringComparision("*********",GPA));

                String grade = func.GetText_ElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Sub_Grade");
                Assert.assertTrue(func.stringComparision("*********",GPA));

            }
        }

    }

}
