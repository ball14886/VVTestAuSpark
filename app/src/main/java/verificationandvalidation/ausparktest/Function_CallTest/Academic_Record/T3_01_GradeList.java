package verificationandvalidation.ausparktest.Function_CallTest.Academic_Record;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import verificationandvalidation.ausparktest.Models.mAcademicBySemester;
import verificationandvalidation.ausparktest.Models.mGradeList;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T3_01_GradeList {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T3_01_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_gradeList").click();
        func.threadSleep_1();

        MobileElement container_frame_GradeSemesterList = func.getElementByID(driver, "edu.au.auspark:id/academicSwipeRefresh");
        List<MobileElement> container_GradeSemesterList = container_frame_GradeSemesterList.findElements(By.className("android.widget.FrameLayout"));

        int index = 0;
        for (MobileElement container_GradeSemester : container_GradeSemesterList) {
            mAcademicBySemester theSem = new mAcademicBySemester();
            if (index == 0) {
                theSem = getFirstSemester();
                String semesterYear = func.getElementByID(driver, container_GradeSemester, "edu.au.auspark:id/Academic_Semester").getText();
                Assert.assertTrue(func.stringComparision(theSem.semesterYear, semesterYear));

                String GPA = func.getElementByID(driver, container_GradeSemester, "edu.au.auspark:id/Academic_Grade").getText();
                Assert.assertTrue(func.stringComparision(theSem.GPA, GPA));

                String credit = func.getElementByID(driver, container_GradeSemester, "edu.au.auspark:id/Academic_Credit").getText();
                //System.out.println(theSem.credit + " : " + credit);
                Assert.assertTrue(func.stringComparision(theSem.credit, credit.charAt(0) + ""));

                if (index == 0) {

                    int anotherIndex = 0;
                    System.out.println("index: " + anotherIndex);
                    MobileElement container_gradeList = container_GradeSemester.findElement(By.id("edu.au.auspark:id/AcademicDetailHolder"));
                    List<MobileElement> gradeList = container_gradeList.findElements(By.className("android.widget.FrameLayout"));
                    for (MobileElement courseGrade : gradeList) {

                        if (anotherIndex < 6) {
                            String courseCode = func.getElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Course_ID").getText();
                            System.out.println(courseCode + " : " + theSem.mGradeList.get(anotherIndex).courseCode);
                            Assert.assertTrue(func.stringComparision(theSem.mGradeList.get(anotherIndex).courseCode, courseCode));

                            String courseName = func.getElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Subject").getText();

                            Assert.assertTrue(func.stringComparision(theSem.mGradeList.get(anotherIndex).courseName, courseName));

                            String grade = func.getElementByID(driver, courseGrade, "edu.au.auspark:id/Academic_Sub_Grade").getText();
                            Assert.assertTrue(func.stringComparision(theSem.mGradeList.get(anotherIndex).finalGrade, grade));

                            anotherIndex++;
                        } else {
                            break;
                        }
                    }
                }
                index++;
            }
        }

    }

    public mGradeList getBG14038() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "BG14038";
        mgl.courseName = "PROFESSIONAL ETHICS SEMINAR VIII";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getBG2001() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "BG2001";
        mgl.courseName = "ENGLISH IV";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getLA4606() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "LA4606";
        mgl.courseName = "INTELLECTUAL PROPERTY LAW";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getMT4201() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "MT4201";
        mgl.courseName = "SOCIAL INTERESTS, GOVERNMENT POLICIES AND TECHNOLOGY";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getSC4299() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "SC4299";
        mgl.courseName = "SENIOR PROJECT";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getSC4373() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "SC4373";
        mgl.courseName = "WEB APPLICATION DEVELOPMENT";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getSC4374() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "SC4374";
        mgl.courseName = "ENTERPRISE APPLICATION DEVELOPMENT";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getSC4437() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "SC4437";
        mgl.courseName = "SELECTED TOPIC IN SOFTWARE VERIFICATION AND VALIDATION";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public List<mGradeList> firstSemester() {
        List<mGradeList> firstSemester = new ArrayList<mGradeList>();
        firstSemester.add(getBG14038());
        firstSemester.add(getBG2001());
        firstSemester.add(getLA4606());
        firstSemester.add(getMT4201());
        firstSemester.add(getSC4299());
        firstSemester.add(getSC4373());
        firstSemester.add(getSC4374());
        firstSemester.add(getSC4437());
        return firstSemester;
    }

    public mGradeList getBG14037() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "BG14037";
        mgl.courseName = "PROFESSIONAL ETHICS SEMINAR VII";
        mgl.finalGrade = "Show";
        return mgl;
    }

//    public mGradeList getBG2001(){
//        mGradeList mgl = new mGradeList();
//        mgl.courseCode = "BG2001";
//        mgl.courseName = "ENGLISH IV";
//        mgl.finalGrade = "Show";
//        return mgl;
//    }

    public mGradeList getDA4301() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "DA4301";
        mgl.courseName = "OPERATION RESEARCH I";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getSC3351() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "SC3351";
        mgl.courseName = "COMPUTER NETWORKS";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getSC4418() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "SC4418";
        mgl.courseName = "SELECTED TOPICS IN DATA WAREHOUSING";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getSC4423() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "SC4423";
        mgl.courseName = "SELECTED TOPICS IN INTRODUCTION TO RECOMMENDER SYSTEMS";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public mGradeList getSC4425() {
        mGradeList mgl = new mGradeList();
        mgl.courseCode = "SC4425";
        mgl.courseName = "ST IN IPHONE/IPAD MOBILE APPLICATION DEVELOPMENT";
        mgl.finalGrade = "Show";
        return mgl;
    }

    public List<mGradeList> secondSemester() {
        List<mGradeList> firstSemester = new ArrayList<mGradeList>();
        firstSemester.add(getBG14037());
        firstSemester.add(getBG2001());
        firstSemester.add(getDA4301());
        firstSemester.add(getSC3351());
        firstSemester.add(getSC4418());
        firstSemester.add(getSC4423());
        firstSemester.add(getSC4425());
        return firstSemester;
    }

    public mAcademicBySemester getFirstSemester() {
        mAcademicBySemester theSemester = new mAcademicBySemester();
        theSemester.semesterYear = "2/2016";
        theSemester.credit = "0";
        theSemester.GPA = "0.00";
        theSemester.mGradeList = firstSemester();
        return theSemester;
    }

    public mAcademicBySemester getSecondSemester() {
        mAcademicBySemester theSemester = new mAcademicBySemester();
        theSemester.semesterYear = "1/2016";
        theSemester.credit = "15";
        theSemester.GPA = "3.30";
        theSemester.mGradeList = secondSemester();
        return theSemester;
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
