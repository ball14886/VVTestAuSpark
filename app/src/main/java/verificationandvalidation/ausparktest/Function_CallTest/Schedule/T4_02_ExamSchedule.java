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

        List<String> keep_checkedRowData_1 = new ArrayList<String>();
        List<String> keep_checkedRowData_2 = new ArrayList<String>();

        for(int i = 0 ; i < classExamList.size(); i++){
            MobileElement container_midterm = func.getElementByID(driver, "edu.au.auspark:id/examMidtermLayout");
            MobileElement container_examSchedule = func.getElementByID(driver,container_midterm ,"edu.au.auspark:id/ExamBlockHolderMidterm");
            List<MobileElement> examSchedule_Header_courseList = container_examSchedule.findElements(By.id("edu.au.auspark:id/ExamListHeader"));
            List<MobileElement> examSchedule_Bottom_courseList = container_examSchedule.findElements(By.id("edu.au.auspark:id/examListDetail"));

            for (int j = 0 ; j < examSchedule_Header_courseList.size(); j++){
                String examDate = func.getElementByID(driver, examSchedule_Header_courseList.get(j), "edu.au.auspark:id/examDate").getText();
                String examDayName = func.getElementByID(driver, examSchedule_Header_courseList.get(j), "edu.au.auspark:id/examDayName").getText();

                if (!keep_checkedRowData_1.contains(examDate+";"+examDayName)){
                    keep_checkedRowData_1.add(examDate+";"+examDayName);
                    Assert.assertTrue(func.stringComparision(examDate,classExamList.get(i).getDayNumber()));  // *****
                    Assert.assertTrue(func.stringComparision(examDayName, classExamList.get(i).getDayName()));  // *****
                    break;
                }


            }
            for (int j = 0 ; j < examSchedule_Bottom_courseList.size(); j++){
                String startTime = func.getElementByID(driver, examSchedule_Bottom_courseList.get(j), "edu.au.auspark:id/startTime").getText();
                String endTime = func.getElementByID(driver, examSchedule_Bottom_courseList.get(j), "edu.au.auspark:id/endTime").getText();
                String courseTitle = func.getElementByID(driver, examSchedule_Bottom_courseList.get(j), "edu.au.auspark:id/subject").getText();
                String room = func.getElementByID(driver, examSchedule_Bottom_courseList.get(j), "edu.au.auspark:id/room").getText();

                if (!keep_checkedRowData_2.contains(courseTitle)){
                    keep_checkedRowData_2.add(courseTitle);
                    for (int k = 0 ; k < classExamList.get(i).getExamDetailsList().size(); k++){
                        if (func.stringComparision(classExamList.get(i).getExamDetailsList().get(k).getCourseName(), courseTitle)){
                            Assert.assertTrue(func.stringComparision(startTime, classExamList.get(i).getExamDetailsList().get(k).getStartTime()));  // *****
                            Assert.assertTrue(func.stringComparision(endTime, classExamList.get(i).getExamDetailsList().get(k).getEndTime()));  // *****
                            Assert.assertTrue(func.stringComparision(courseTitle, classExamList.get(i).getExamDetailsList().get(k).getCourseName()));  // *****
                            Assert.assertTrue(func.stringComparision(room, classExamList.get(i).getExamDetailsList().get(k).getExamRoom()));  // *****
                        }
                    }
                    break;
                }
            }
            func.scrollTopToDown_2(driver);
        }

        //---------------------------------------------------------------------------
        func.SwipeMenuSidebarDownToTop(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/fin").click();
        func.threadSleep_1();


        classExamList = getFinalExamList();

        keep_checkedRowData_1 = new ArrayList<String>();
        keep_checkedRowData_2 = new ArrayList<String>();

        for(int i = 0 ; i < classExamList.size(); i++){
            MobileElement container_final = func.getElementByID(driver, "edu.au.auspark:id/examFinalLayout");
            MobileElement container_examSchedule = func.getElementByID(driver,container_final ,"edu.au.auspark:id/ExamBlockHolderFinal");
            List<MobileElement> examSchedule_Header_courseList = container_examSchedule.findElements(By.id("edu.au.auspark:id/ExamListHeader"));
            List<MobileElement> examSchedule_Bottom_courseList = container_examSchedule.findElements(By.id("edu.au.auspark:id/examListDetail"));

            for (int j = 0 ; j < examSchedule_Header_courseList.size(); j++){
                String examDate = func.getElementByID(driver, examSchedule_Header_courseList.get(j), "edu.au.auspark:id/examDate").getText();
                String examDayName = func.getElementByID(driver, examSchedule_Header_courseList.get(j), "edu.au.auspark:id/examDayName").getText();

                if (!keep_checkedRowData_1.contains(examDate+";"+examDayName)){
                    keep_checkedRowData_1.add(examDate+";"+examDayName);
                    Assert.assertTrue(func.stringComparision(examDate,classExamList.get(i).getDayNumber()));  // *****
                    Assert.assertTrue(func.stringComparision(examDayName, classExamList.get(i).getDayName()));  // *****
                    break;
                }


            }
            for (int j = 0 ; j < examSchedule_Bottom_courseList.size(); j++){
                String startTime = func.getElementByID(driver, examSchedule_Bottom_courseList.get(j), "edu.au.auspark:id/startTime").getText();
                String endTime = func.getElementByID(driver, examSchedule_Bottom_courseList.get(j), "edu.au.auspark:id/endTime").getText();
                String courseTitle = func.getElementByID(driver, examSchedule_Bottom_courseList.get(j), "edu.au.auspark:id/subject").getText();
                //String room = func.getElementByID(driver, examSchedule_Bottom_courseList.get(j), "edu.au.auspark:id/room").getText();

                if (!keep_checkedRowData_2.contains(courseTitle)){
                    keep_checkedRowData_2.add(courseTitle);
                    for (int k = 0 ; k < classExamList.get(i).getExamDetailsList().size(); k++){
                        if (func.stringComparision(classExamList.get(i).getExamDetailsList().get(k).getCourseName(), courseTitle)){
                            Assert.assertTrue(func.stringComparision(startTime, classExamList.get(i).getExamDetailsList().get(k).getStartTime()));  // *****
                            Assert.assertTrue(func.stringComparision(endTime, classExamList.get(i).getExamDetailsList().get(k).getEndTime()));  // *****
                            Assert.assertTrue(func.stringComparision(courseTitle, classExamList.get(i).getExamDetailsList().get(k).getCourseName()));  // *****
                            //Assert.assertTrue(func.stringComparision(room, classExamList.get(i).getExamDetailsList().get(k).getExamRoom()));  // *****
                        }
                    }
                    break;
                }
            }
            func.scrollTopToDown_3(driver);
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
        classExamDetails.setExamRoom("SR307");

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
