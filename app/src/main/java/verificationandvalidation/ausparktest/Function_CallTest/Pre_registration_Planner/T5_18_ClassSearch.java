package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Models.mSection;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by USER on 5/29/2017.
 */

public class T5_18_ClassSearch {
    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T5_18_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSearch").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").sendKeys("A");
        func.threadSleep_2();

        MobileElement container_courseList = func.getElementByID(driver,"edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_courseList.findElements(By.className("android.widget.LinearLayout"));

        for(MobileElement course:courseList){
            char theChar = func.getElementByID(driver, "edu.au.auspark:id/courseID").getText().charAt(0);
            Assert.assertTrue(func.stringComparision(theChar + "","A"));
        }

    }

    @Test
    public void Test_T5_18_02() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSearch").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").sendKeys("ACT");
        func.threadSleep_2();

        MobileElement container_courseList = func.getElementByID(driver,"edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_courseList.findElements(By.className("android.widget.LinearLayout"));

        for(MobileElement course:courseList){
            char theChar = func.getElementByID(driver, "edu.au.auspark:id/courseID").getText().charAt(0);
            Assert.assertTrue(func.stringComparision(theChar + "","ACT"));
        }
    }

    @Test
    public void Test_T5_18_03() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSearch").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").sendKeys("ACT1600");
        func.threadSleep_1();

        MobileElement container_course = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_course.findElements(By.className("android.widget.LinearLayout"));

        courseList.get(0).click();
        func.threadSleep_2();

        MobileElement container_section = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> sectionList = container_course.findElements(By.className("android.widget.LinearLayout"));

        int index = 0;
        for (MobileElement section : sectionList){

            mSection theSection = new mSection();

            if(index == 0){
                theSection = getFirstSection();
                String sectionNumber = func.getElementByID(driver, section, "edu.au.auspark:id/section").getText();

                System.out.println("sectionNumber : " + sectionNumber);
                System.out.println("theSectionNumber : " + theSection.sectionNumber);

                Assert.assertTrue(func.stringComparision(theSection.sectionNumber,sectionNumber));

                String seat = func.getElementByID(driver, section, "edu.au.auspark:id/seat").getText().charAt(0) + "";
                Assert.assertTrue(func.stringComparision(theSection.seatNumber,seat));
            }

            index++;
        }

    }

    @Test
    public void Test_T5_18_04() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSearch").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/txtSearch").sendKeys("ACT1600");
        func.threadSleep_1();

        MobileElement container_course = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> courseList = container_course.findElements(By.className("android.widget.LinearLayout"));

        courseList.get(0).click();
        func.threadSleep_2();

        MobileElement container_section = func.getElementByID(driver, "edu.au.auspark:id/my_recycler_view");
        List<MobileElement> sectionList = container_course.findElements(By.className("android.widget.LinearLayout"));

        sectionList.get(0).click();
        func.threadSleep_2();

//        for (MobileElement section : sectionList){
//
//            String sectionNumber = func.getElementByID(driver, section, "edu.au.auspark:id/section").getText();
//            Assert.assertTrue(func.stringComparision("*********",sectionNumber));
//
//            String seat = func.getElementByID(driver, section, "edu.au.auspark:id/Academic_Grade").getText();
//            Assert.assertTrue(func.stringComparision("*********",seat));
//
//            if (func.stringComparision(sectionNumber, sectionNumberSelected)){
//                func.getElementByID(driver, section,"edu.au.auspark:id/goToNextPage").click();
//                break;
//            }
//        }
        //----- Section Details -----

        String courseCode = func.getElementByID(driver, "edu.au.auspark:id/courseIDHeader").getText();
        Assert.assertTrue(func.stringComparision("ACT1600",courseCode));

        String courseName = func.getElementByID(driver, "edu.au.auspark:id/courseNameHeader").getText();
        Assert.assertTrue(func.stringComparision("FUNDAMENTALS OF FINANCIAL ACCOUNTING",courseName));

        String seat = func.getElementByID(driver, "edu.au.auspark:id/sectionAvailableSeat").getText().charAt(0) + "";
        Assert.assertTrue(func.stringComparision("0",seat));

        String remark = func.getElementByID(driver, "edu.au.auspark:id/remark").getText();

        System.out.println("remark : " + remark);

        Assert.assertTrue(func.stringComparision("Remark: ** SUVARNABHUMI CAMPUS**",remark));

        String midDate = func.getElementByID(driver, "edu.au.auspark:id/midDate").getText();
        Assert.assertTrue(func.stringComparision("23/06/2017",midDate));

        String midTime = func.getElementByID(driver, "edu.au.auspark:id/timeMid").getText();
        Assert.assertTrue(func.stringComparision("(09:00-12:00)",midTime));

        String finalDate = func.getElementByID(driver, "edu.au.auspark:id/finalDate").getText();
        Assert.assertTrue(func.stringComparision("18/07/2017",finalDate));

        String finalTime = func.getElementByID(driver, "edu.au.auspark:id/timeFinal").getText();
        Assert.assertTrue(func.stringComparision("(13:00-16:00)",finalTime));

//        MobileElement container_class = func.getElementByID(driver, "edu.au.auspark:id/SectionDetailBlockHolder");
//        List<MobileElement> classList = container_class.findElements(By.className("android.widget.FrameLayout"));
//
//        for (MobileElement classDetails : classList){
//
//            String dayName = func.getElementByID(driver, classDetails, "edu.au.auspark:id/dayName").getText();
//            Assert.assertTrue(func.stringComparision("*********",dayName));
//
//            String time = func.getElementByID(driver, classDetails, "edu.au.auspark:id/courseTime").getText();
//            Assert.assertTrue(func.stringComparision("*********",time));
//
//            String roomCode = func.getElementByID(driver, classDetails, "edu.au.auspark:id/roomCode").getText();
//            Assert.assertTrue(func.stringComparision("*********",roomCode));
//
//            String instructorName = func.getElementByID(driver, classDetails, "edu.au.auspark:id/courseInstructor").getText();
//            Assert.assertTrue(func.stringComparision("*********",instructorName));
//        }
    }

    public mSection getFirstSection(){
        mSection section = new mSection();
        section.sectionNumber = "401";
        section.seatNumber = "1";
        return section;
    }

    public mSection getSecondSection(){
        mSection section = new mSection();
        section.sectionNumber = "402";
        section.seatNumber = "0";
        return section;
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
