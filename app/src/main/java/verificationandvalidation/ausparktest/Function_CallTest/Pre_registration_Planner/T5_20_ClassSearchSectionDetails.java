package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

import junit.framework.Assert;

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

public class T5_20_ClassSearchSectionDetails {
    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }
    @Test
    public void Test_T3_01_01() throws Exception {
        String sectionNumberSelected = "402";
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSearch").click();
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").sendKeys("ACT1600");
        func.threadSleep_1();

        MobileElement container_course = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_course.findElements(By.className("android.widget.LinearLayout"));

        courseList.get(0).click();
        func.threadSleep_2();

        MobileElement container_section = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> sectionList = container_course.findElements(By.className("android.widget.LinearLayout"));

        for (MobileElement section : sectionList){

            String sectionNumber = func.getElementByID(driver, section, "edu.au.auspark:id/section").getText();
            Assert.assertTrue(func.stringComparision("*********",sectionNumber));

            String seat = func.getElementByID(driver, section, "edu.au.auspark:id/Academic_Grade").getText();
            Assert.assertTrue(func.stringComparision("*********",seat));

            if (func.stringComparision(sectionNumber, sectionNumberSelected)){
                func.getElementByID(driver, section,"edu.au.auspark:id/goToNextPage").click();
                break;
            }
        }
        //----- Section Details -----

        String courseCode = func.getElementByID(driver, "edu.au.auspark:id/courseIDHeader").getText();
        Assert.assertTrue(func.stringComparision("*********",courseCode));

        String courseName = func.getElementByID(driver, "edu.au.auspark:id/courseNameHeader").getText();
        Assert.assertTrue(func.stringComparision("*********",courseName));

        String seat = func.getElementByID(driver, "edu.au.auspark:id/sectionAvailableSeat").getText();
        Assert.assertTrue(func.stringComparision("*********",seat));

        String remark = func.getElementByID(driver, "edu.au.auspark:id/remark").getText();
        Assert.assertTrue(func.stringComparision("*********",remark));

        String midDate = func.getElementByID(driver, "edu.au.auspark:id/midDate").getText();
        Assert.assertTrue(func.stringComparision("*********",midDate));

        String midTime = func.getElementByID(driver, "edu.au.auspark:id/timeMid").getText();
        Assert.assertTrue(func.stringComparision("*********",midTime));

        String finalDate = func.getElementByID(driver, "edu.au.auspark:id/finalDate").getText();
        Assert.assertTrue(func.stringComparision("*********",finalDate));

        String finalTime = func.getElementByID(driver, "edu.au.auspark:id/timeFinal").getText();
        Assert.assertTrue(func.stringComparision("*********",finalTime));

        MobileElement container_class = func.getElementByID(driver, "edu.au.auspark:id/SectionDetailBlockHolder");
        List<MobileElement> classList = container_class.findElements(By.className("android.widget.FrameLayout"));

        for (MobileElement classDetails : classList){

            String dayName = func.getElementByID(driver, classDetails, "edu.au.auspark:id/dayName").getText();
            Assert.assertTrue(func.stringComparision("*********",dayName));

            String time = func.getElementByID(driver, classDetails, "edu.au.auspark:id/courseTime").getText();
            Assert.assertTrue(func.stringComparision("*********",time));

            String roomCode = func.getElementByID(driver, classDetails, "edu.au.auspark:id/roomCode").getText();
            Assert.assertTrue(func.stringComparision("*********",roomCode));

            String instructorName = func.getElementByID(driver, classDetails, "edu.au.auspark:id/courseInstructor").getText();
            Assert.assertTrue(func.stringComparision("*********",instructorName));
        }
    }
}
