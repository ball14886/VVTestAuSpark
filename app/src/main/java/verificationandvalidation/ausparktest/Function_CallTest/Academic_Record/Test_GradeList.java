package verificationandvalidation.ausparktest.Function_CallTest.Academic_Record;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;
import verificationandvalidation.ausparktest.Provider.SecurityProvider;
import verificationandvalidation.ausparktest.Provider.SetupProvider;

/**
 * Created by USER on 5/5/2017.
 */

public class Test_GradeList {

    SetupProvider setupProvider = new SetupProvider();
    Functions generalProvider = new Functions();
    SecurityProvider securityProvider = new SecurityProvider();

    @Test
    public void Test_GradeList(AppiumDriver driver) throws Exception {

        MobileElement box_frame_GradeSemesterList = generalProvider.getElementByID(
                driver,
                "edu.au.auspark:id/academicSwipeRefresh");
        List<MobileElement> frame_GradeSemesterList =
                box_frame_GradeSemesterList.findElements(By.className("android.widget.FrameLayout"));

        for (MobileElement frame_GradeSemester: frame_GradeSemesterList) {
            String GPA = generalProvider.GetText_ElementByID(
                    driver,
                    frame_GradeSemester,
                    "edu.au.auspark:id/Academic_Grade");

            Assert.assertTrue(generalProvider.stringComparision("3.01",GPA));


            System.out.println("GPA: " + GPA);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }

    }




}
