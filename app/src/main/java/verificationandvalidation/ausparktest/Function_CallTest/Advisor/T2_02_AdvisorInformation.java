package verificationandvalidation.ausparktest.Function_CallTest.Advisor;

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

public class T2_02_AdvisorInformation {

    Functions func = new Functions();

    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T2_01_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_advisinginformatoin").click();
        func.threadSleep_1();

        String preResultStatus = func.getElementByID(driver, "edu.au.auspark:id/regis_time_status").getText();
        Assert.assertTrue(func.stringComparision(preResultStatus,"ALLOWED"));
        func.threadSleep_1();

        MobileElement container_advisingCourse = func.getElementByID(driver, "edu.au.auspark:id/containAcceptedCouses");
        List<MobileElement> advisingCourseList = container_advisingCourse.findElements(By.className("android.widget.RelativeLayout"));

        for (MobileElement advisingCourse : advisingCourseList){
            String courseID = func.getElementByID(driver, advisingCourse, "edu.au.auspark:id/courseID").getText();
            Assert.assertTrue(func.stringComparision(courseID,"A&S100"));  // *****

            String courseName = func.getElementByID(driver, advisingCourse, "edu.au.auspark:id/subject").getText();
            Assert.assertTrue(func.stringComparision(courseName,"HISTORY OF SOUTHEAST ASIA"));  // *****

            String status = func.getElementByID(driver, advisingCourse, "edu.au.auspark:id/statusDescription").getText();
            Assert.assertTrue(func.stringComparision(status,"Required Course"));  // *****
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
