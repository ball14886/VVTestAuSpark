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

public class T5_15_UnSaveWithGenerateSchedule {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T5_14_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        T5_10_AddCourseToNewPlan T5_10 = new T5_10_AddCourseToNewPlan();
        T5_10.AddNewPlan(driver,"ACT1600"); // Add New Course (ACT1600)
        T5_10.AddNewPlan(driver,"ACT3626"); // Add New Course (ACT1600)

        func.getElementByID(driver, "edu.au.auspark:id/showSchedule").click();
        func.threadSleep_5();

        MobileElement container_generateSchedule = func.getElementByID(driver, "edu.au.auspark:id/generatedScheduleList");
        List<MobileElement> generateScheduleList = container_generateSchedule.findElements(By.className("android.widget.LinearLayout"));

        func.getElementByID(driver, generateScheduleList.get(0), "edu.au.auspark:id/heart").click();
        func.threadSleep_2();

        // Check isSelected
        Boolean isSelected = func.getElementByID(driver, generateScheduleList.get(0), "edu.au.auspark:id/heart").isSelected();
        Assert.assertSame(isSelected, false);
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
