package verificationandvalidation.ausparktest.Function_CallTest.Advisor;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T2_02_AdvisorInformation {

    Functions func = new Functions();

    public void Test_T2_01_01(AppiumDriver driver) throws Exception {

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_advisor").click();
        func.threadSleep_1();

        String preResultStatus = func.getElementByID(driver, "edu.au.auspark:id/regis_time_status").getText();
        Assert.assertTrue(func.stringComparision(preResultStatus,"ALLOWED"));
        func.threadSleep_1();

        MobileElement container_advisingCourse = func.getElementByID(driver, "edu.au.auspark:id/containAcceptedCouses");
        List<MobileElement> advisingCourseList = container_advisingCourse.findElements(By.className("android.widget.RelativeLayout"));

        for (MobileElement advisingCourse : advisingCourseList){
            String courseID = func.getElementByID(driver, advisingCourse, "edu.au.auspark:id/courseID");
            Assert.assertTrue(func.stringComparision(courseID,""));  // *****

            String courseName = func.getElementByID(driver, advisingCourse, "edu.au.auspark:id/subject");
            Assert.assertTrue(func.stringComparision(courseName,""));  // *****

            String status = func.getElementByID(driver, advisingCourse, "edu.au.auspark:id/statusDescription");
            Assert.assertTrue(func.stringComparision(status,""));  // *****

        }
    }

}
