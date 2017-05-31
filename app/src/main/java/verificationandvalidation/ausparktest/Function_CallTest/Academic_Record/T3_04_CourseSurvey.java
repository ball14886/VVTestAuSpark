package verificationandvalidation.ausparktest.Function_CallTest.Academic_Record;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by USER on 5/29/2017.
 */

public class T3_04_CourseSurvey {
    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }



    @Test
    public void Test_T3_04_01() throws Exception {

        func.loginWith5611779(driver);
        func.threadSleep_4();

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

                String grade = func.getElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Sub_Grade").getText();
                System.out.println(grade + " : " + grade);
                Assert.assertTrue(func.stringComparision("Show",grade));

                func.getElementByID(driver,"edu.au.auspark:id/Academic_Sub_Grade").click();
                break;
            }
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
