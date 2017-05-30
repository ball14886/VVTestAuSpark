package verificationandvalidation.ausparktest.Function_CallTest.Schedule;

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
import verificationandvalidation.ausparktest.Models.mClassExam;
import verificationandvalidation.ausparktest.Models.mClassExamDetails;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T4_02_ExamSchedule {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T4_02_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSchedule").click();
        func.threadSleep_4();

        func.getElementByID(driver, "edu.au.auspark:id/scheduleExam").click();
        func.threadSleep_1();

        //---------------------------------------------------------------------------
        func.getElementByID(driver, "edu.au.auspark:id/mid").click();
        func.threadSleep_1();


        List<mClassExam> classExamList = getMidtermExamList();

        MobileElement container_midterm = func.getElementByID(driver, "edu.au.auspark:id/examMidtermLayout");

        MobileElement container_examSchedule = func.getElementByID(driver,container_midterm ,"edu.au.auspark:id/ExamBlockHolderFinal");
        List<MobileElement> examSchedule_courseList = container_examSchedule.findElements(By.className("android.widget.LinearLayout"));

        int index = 0;
        for (MobileElement course : examSchedule_courseList){
            String examDate = func.getElementByID(driver, course, "edu.au.auspark:id/examDate").getText();
            Assert.assertTrue(func.stringComparision(examDate,classExamList.get(index).getDayNumber()));  // *****

            String examDayName = func.getElementByID(driver, course, "edu.au.auspark:id/examDayName").getText();
            Assert.assertTrue(func.stringComparision(examDayName, classExamList.get(index).getDayName()));  // *****

            MobileElement container_sectionClass = course.findElement(By.id("edu.au.auspark:id/examListDetail"));
            List<MobileElement> sectionClassList = container_sectionClass.findElements(By.className("android.widget.LinearLayout"));

            int j_index = 0;
            List<mClassExamDetails> classExamDetailsList = classExamList.get(index).getExamDetailsList();
            for (MobileElement sectionClass : sectionClassList){
                String startTime = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/startTime").getText();
                Assert.assertTrue(func.stringComparision(startTime, classExamDetailsList.get(j_index).getStartTime()));  // *****

                String endTime = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/endTime").getText();
                Assert.assertTrue(func.stringComparision(endTime, classExamDetailsList.get(j_index).getEndTime()));  // *****

                String courseTitle = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/subject").getText();
                Assert.assertTrue(func.stringComparision(courseTitle, classExamDetailsList.get(j_index).getCourseName()));  // *****

                String room = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/room").getText();
                Assert.assertTrue(func.stringComparision(room, classExamDetailsList.get(j_index).getExamRoom()));  // *****
            }
            index++;
        }

        //---------------------------------------------------------------------------

        func.getElementByID(driver, "edu.au.auspark:id/fin").click();
        func.threadSleep_1();

        MobileElement container_final = func.getElementByID(driver, "edu.au.auspark:id/examFinalLayout");

        container_examSchedule = func.getElementByID(driver, container_final,"edu.au.auspark:id/ExamBlockHolderFinal");
        examSchedule_courseList = container_examSchedule.findElements(By.className("android.widget.LinearLayout"));

        index = 0;
        for (MobileElement course : examSchedule_courseList){
            String examDate = func.getElementByID(driver, course, "edu.au.auspark:id/examDate").getText();
            Assert.assertTrue(func.stringComparision(examDate,classExamList.get(index).getDayNumber()));  // *****

            String examDayName = func.getElementByID(driver, course, "edu.au.auspark:id/examDayName").getText();
            Assert.assertTrue(func.stringComparision(examDayName, classExamList.get(index).getDayName()));  // *****

            MobileElement container_sectionClass = course.findElement(By.id("edu.au.auspark:id/examListDetail"));
            List<MobileElement> sectionClassList = container_sectionClass.findElements(By.className("android.widget.LinearLayout"));

            int j_index = 0;
            List<mClassExamDetails> classExamDetailsList = classExamList.get(index).getExamDetailsList();
            for (MobileElement sectionClass : sectionClassList){
                String startTime = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/startTime").getText();
                Assert.assertTrue(func.stringComparision(startTime, classExamDetailsList.get(j_index).getStartTime()));  // *****

                String endTime = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/endTime").getText();
                Assert.assertTrue(func.stringComparision(endTime, classExamDetailsList.get(j_index).getEndTime()));  // *****

                String courseTitle = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/subject").getText();
                Assert.assertTrue(func.stringComparision(courseTitle, classExamDetailsList.get(j_index).getCourseName()));  // *****

                String room = func.getElementByID(driver, sectionClass, "edu.au.auspark:id/room").getText();
                Assert.assertTrue(func.stringComparision(room, classExamDetailsList.get(j_index).getExamRoom()));  // *****
            }
            index++;
        }

    }

    public List<mClassExam> getMidtermExamList(){
        List<mClassExam> classExamList = new ArrayList<mClassExam>();

        classExamList.add(get_mid_06());
        classExamList.add(get_mid_09());
        classExamList.add(get_mid_10());
        classExamList.add(get_mid_13());

        return classExamList;
    }

    public mClassExam get_mid_06(){
        mClassExam classExam = new mClassExam();
        classExam.setDayNumber("06");
        classExam.setDayName("MONDAY");

        List<mClassExamDetails> classExamDetailsList = new ArrayList<mClassExamDetails>();
        mClassExamDetails classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("09:00");
        classExamDetails.setEndTime("11:00");
        classExamDetails.setCourseName("ENGLISH IV");
        classExamDetails.setExamRoom("N/A");

        classExamDetailsList.add(classExamDetails);
        classExam.setExamDetailsList(classExamDetailsList);

        return classExam;
    }

    public mClassExam get_mid_09(){
        mClassExam classExam = new mClassExam();
        classExam.setDayNumber("09");
        classExam.setDayName("THURSDAY");

        List<mClassExamDetails> classExamDetailsList = new ArrayList<mClassExamDetails>();
        mClassExamDetails classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("09:00");
        classExamDetails.setEndTime("11:00");
        classExamDetails.setCourseName("SOCIAL INTERESTS, GOVERNMENT POLICIES AND TECHNOLOGY");
        classExamDetails.setExamRoom("N/A");

        classExamDetailsList.add(classExamDetails);
        classExam.setExamDetailsList(classExamDetailsList);

        return classExam;
    }

    public mClassExam get_mid_10(){
        mClassExam classExam = new mClassExam();
        classExam.setDayNumber("10");
        classExam.setDayName("FRIDAY");

        List<mClassExamDetails> classExamDetailsList = new ArrayList<mClassExamDetails>();
        mClassExamDetails classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("15:00");
        classExamDetails.setEndTime("17:00");
        classExamDetails.setCourseName("WEB APPLICATION DEVELOPMENT");
        classExamDetails.setExamRoom("N/A");

        classExamDetailsList.add(classExamDetails);
        classExam.setExamDetailsList(classExamDetailsList);

        return classExam;
    }

    public mClassExam get_mid_13(){
        mClassExam classExam = new mClassExam();
        classExam.setDayNumber("13");
        classExam.setDayName("MONDAY");

        List<mClassExamDetails> classExamDetailsList = new ArrayList<mClassExamDetails>();
        mClassExamDetails classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("12:00");
        classExamDetails.setEndTime("14:00");
        classExamDetails.setCourseName("ENTERPRISE APPLICATION DEVELOPMENT");
        classExamDetails.setExamRoom("N/A");
        classExamDetailsList.add(classExamDetails);
        //----------------------
        classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("09:00");
        classExamDetails.setEndTime("11:00");
        classExamDetails.setCourseName("SELECTED TOPIC IN SOFTWARE VERIFICATION AND VALIDATION");
        classExamDetails.setExamRoom("N/A");
        classExamDetailsList.add(classExamDetails);
        classExam.setExamDetailsList(classExamDetailsList);

        return classExam;
    }


    public List<mClassExam> getFinalExamList(){
        List<mClassExam> classExamList = new ArrayList<mClassExam>();

        classExamList.add(get_final_15());
        classExamList.add(get_final_19());
        classExamList.add(get_final_23());
        classExamList.add(get_final_24());
        classExamList.add(get_final_25());

        return classExamList;
    }

    public mClassExam get_final_15(){
        mClassExam classExam = new mClassExam();
        classExam.setDayNumber("15");
        classExam.setDayName("MONDAY");

        List<mClassExamDetails> classExamDetailsList = new ArrayList<mClassExamDetails>();
        mClassExamDetails classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("09:00");
        classExamDetails.setEndTime("12:00");
        classExamDetails.setCourseName("ENGLISH IV");
        classExamDetails.setExamRoom("SM509");

        classExamDetailsList.add(classExamDetails);
        classExam.setExamDetailsList(classExamDetailsList);

        return classExam;
    }

    public mClassExam get_final_19(){
        mClassExam classExam = new mClassExam();
        classExam.setDayNumber("19");
        classExam.setDayName("FRIDAY");

        List<mClassExamDetails> classExamDetailsList = new ArrayList<mClassExamDetails>();
        mClassExamDetails classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("13:00");
        classExamDetails.setEndTime("16:00");
        classExamDetails.setCourseName("SOCIAL INTERESTS, GOVERNMENT POLICIES AND TECHNOLOGY");
        classExamDetails.setExamRoom("SR305");

        classExamDetailsList.add(classExamDetails);
        classExam.setExamDetailsList(classExamDetailsList);

        return classExam;
    }

    public mClassExam get_final_23(){
        mClassExam classExam = new mClassExam();
        classExam.setDayNumber("23");
        classExam.setDayName("TUESDAY");

        List<mClassExamDetails> classExamDetailsList = new ArrayList<mClassExamDetails>();
        mClassExamDetails classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("13:00");
        classExamDetails.setEndTime("15:30");
        classExamDetails.setCourseName("INTELLECTUAL PROPERTY LAW");
        classExamDetails.setExamRoom("SR305");

        classExamDetailsList.add(classExamDetails);
        classExam.setExamDetailsList(classExamDetailsList);

        return classExam;
    }

    public mClassExam get_final_24(){
        mClassExam classExam = new mClassExam();
        classExam.setDayNumber("13");
        classExam.setDayName("WEDNESDAY");

        List<mClassExamDetails> classExamDetailsList = new ArrayList<mClassExamDetails>();
        mClassExamDetails classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("09:00");
        classExamDetails.setEndTime("12:00");
        classExamDetails.setCourseName("WEB APPLICATION DEVELOPMENT");
        classExamDetails.setExamRoom("SR331");
        classExamDetailsList.add(classExamDetails);
        //----------------------
        classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("13:00");
        classExamDetails.setEndTime("16:00");
        classExamDetails.setCourseName("SELECTED TOPIC IN SOFTWARE VERIFICATION AND VALIDATION");
        classExamDetails.setExamRoom("N/A");
        classExamDetailsList.add(classExamDetails);
        classExam.setExamDetailsList(classExamDetailsList);

        return classExam;
    }

    public mClassExam get_final_25(){
        mClassExam classExam = new mClassExam();
        classExam.setDayNumber("25");
        classExam.setDayName("THURSDAY");

        List<mClassExamDetails> classExamDetailsList = new ArrayList<mClassExamDetails>();
        mClassExamDetails classExamDetails = new mClassExamDetails();
        classExamDetails.setStartTime("09:00");
        classExamDetails.setEndTime("12:00");
        classExamDetails.setCourseName("ENTERPRISE APPLICATION DEVELOPMENT");
        classExamDetails.setExamRoom("SR304");
        classExamDetailsList.add(classExamDetails);

        classExam.setExamDetailsList(classExamDetailsList);

        return classExam;
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
