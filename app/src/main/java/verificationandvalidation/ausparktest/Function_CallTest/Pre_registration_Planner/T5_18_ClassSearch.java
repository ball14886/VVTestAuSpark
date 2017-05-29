package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by USER on 5/29/2017.
 */

public class T5_18_ClassSearch {
    Functions func = new Functions();

    @Test
    public void Test_T5_18_01(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSearch").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").sendKeys("A");
        func.threadSleep_2();

        MobileElement container_courseList = func.getElementByID(driver,"edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_courseList.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]"));

        for(MobileElement course:courseList){
            char theChar = func.getElementByID(driver, "edu.au.auspark:id/courseID").getText().charAt(0);
            Assert.assertTrue(func.stringComparision(theChar + "","A"));
        }

    }

    @Test
    public void Test_T5_18_02(AppiumDriver driver) throws Exception {
        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSearch").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").sendKeys("ACT");
        func.threadSleep_2();

        MobileElement container_courseList = func.getElementByID(driver,"edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_courseList.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]"));

        for(MobileElement course:courseList){
            char theChar = func.getElementByID(driver, "edu.au.auspark:id/courseID").getText().charAt(0);
            Assert.assertTrue(func.stringComparision(theChar + "","ACT"));
        }

    }
}
