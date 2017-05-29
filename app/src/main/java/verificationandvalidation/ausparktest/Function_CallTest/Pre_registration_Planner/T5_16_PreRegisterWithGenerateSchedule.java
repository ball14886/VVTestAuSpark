package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

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

public class T5_16_PreRegisterWithGenerateSchedule {

    Functions func = new Functions();
    
    @Test
    public void Test_T5_16_01(AppiumDriver driver) throws Exception {
        T5_10_AddCourseToNewPlan T5_10 = new T5_10_AddCourseToNewPlan();
        T5_10.AddNewPlan(driver,"ACT1600"); // Add New Course (ACT1600)
        T5_10.AddNewPlan(driver,"ACT3626"); // Add New Course (ACT1600)

        func.getElementByID(driver, "edu.au.auspark:id/showSchedule").click();
        func.threadSleep_5();

        MobileElement container_generateSchedule = func.getElementByID(driver, "edu.au.auspark:id/generatedScheduleList");
        List<MobileElement> generateScheduleList = container_generateSchedule.findElements(By.className("android.widget.LinearLayout"));

        func.getElementByID(driver, generateScheduleList.get(0), "edu.au.auspark:id/regisBtn").click();
        func.threadSleep_2();

        func.getElementByID(driver, "android:id/message");
        func.threadSleep_2();

        //func.getElementByID(driver, "android:id/button1"); // confirm
        //func.threadSleep_4();

        //func.getElementByID(driver, "android:id/button2"); // cancel
        //func.threadSleep_2();

        MobileElement toolbar = func.getElementByID(driver, "edu.au.auspark:id/toolbar");
        String titleToolbar = toolbar.findElements(By.className("android.widget.TextView")).get(0).getText();
        Assert.assertTrue(func.stringComparision(titleToolbar, "*************"));
    }
}
