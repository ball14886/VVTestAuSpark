package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T5_10_AddCourseToNewPlan {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T5_08_01() throws Exception {
        String courseCodeTest = "ACT1600";
        AddNewPlan(driver, courseCodeTest);
    }

    public void AddNewPlan(AppiumDriver driver, String newCourseCode) throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_planList").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/action_addplan").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/addCourse").click();
        func.threadSleep_3();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").setValue(newCourseCode);
        func.threadSleep_2();

        MobileElement container_course = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_course.findElements(By.className("android.widget.LinearLayout"));

        courseList.get(0).click();
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/selectAllSection").click();
        func.threadSleep_1();

        func.getElementByID(driver, "edu.au.auspark:id/action_confirm").click();
        func.threadSleep_2();

        MobileElement container_newPlannerCourse = func.getElementByID(driver, "edu.au.auspark:id/newPlannerBlockDetailHolder");
        List<MobileElement> newPlannerCourseList = container_newPlannerCourse.findElements(By.className("android.widget.RelativeLayout"));

        Boolean isFound = false;
        for (MobileElement newPlannerCourse : newPlannerCourseList){
            String courseCode = func.getElementByID(driver, newPlannerCourse, "edu.au.auspark:id/courseID").getText();
//            Assert.assertTrue(func.stringComparision(courseCode, "*************"));

            if (func.stringComparision(newCourseCode, courseCode)){
                isFound = true;
                Assert.assertTrue(true);
            }
        }

        if (!isFound){
            Assert.assertTrue(false);
        }
        func.threadSleep_2();
    }


    @After
    public void tearDown(){
        driver.quit();
    }

}
