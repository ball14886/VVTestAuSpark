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
import verificationandvalidation.ausparktest.Models.mClassDetails;
import verificationandvalidation.ausparktest.Models.mClassSchedule;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T4_01_Schedule {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T4_01_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_4();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_classSchedule").click();
        func.threadSleep_5();

        String semesterYear = func.getElementByID(driver, "edu.au.auspark:id/semester").getText();
        Assert.assertTrue(func.stringComparision("2/2016", semesterYear));

        List<mClassSchedule> classScheduleList = getClassDetailsList();

        List<String> keep_checkedRowData_I = new ArrayList<String>();

        for (int i = 0 ; i < classScheduleList.size(); i++){
            MobileElement container_schedule = func.getElementByID(driver, "edu.au.auspark:id/ScheduleBlockHolder");
            List<MobileElement> schedule_courseList = container_schedule.findElements(By.id("edu.au.auspark:id/ScheduleListHeader"));

            for (int j = 0 ; j < schedule_courseList.size(); j++){
                String courseCode = func.getElementByID(driver, schedule_courseList.get(j), "edu.au.auspark:id/courseID").getText();
                String sectionNumber = func.getElementByID(driver, schedule_courseList.get(j), "edu.au.auspark:id/courseSection").getText();
                String courseTitle = func.getElementByID(driver, schedule_courseList.get(j), "edu.au.auspark:id/courseName").getText();
                String remark = func.getElementByID(driver, schedule_courseList.get(j), "edu.au.auspark:id/schedule_block_remark").getText();

                if (!keep_checkedRowData_I.contains(courseCode)){
                    keep_checkedRowData_I.add(courseCode);
                    System.out.println(courseCode + ";" + classScheduleList.get(i).getCourseCode());
                    Assert.assertTrue(func.stringComparision(courseCode,classScheduleList.get(i).getCourseCode()));  // *****
                    Assert.assertTrue(func.stringComparision(sectionNumber,classScheduleList.get(i).getSectionNumber()));  // *****
                    Assert.assertTrue(func.stringComparision(courseTitle,classScheduleList.get(i).getCourseName()));  // *****
                    Assert.assertTrue(func.stringComparision(remark,classScheduleList.get(i).getRemark()));  // *****
                    break;
                }
            }
            func.scrollTopToDown_3(driver);
        }
    }

    public List<mClassSchedule> getClassDetailsList(){
        List<mClassSchedule> classScheduleList = new ArrayList<mClassSchedule>();

        classScheduleList.add(Get_BG14038());
        classScheduleList.add(Get_BG2001());
        classScheduleList.add(Get_LA4606());
        classScheduleList.add(Get_MT4201());
        classScheduleList.add(Get_SC4299());
        classScheduleList.add(Get_SC4373());
        classScheduleList.add(Get_SC4374());
        classScheduleList.add(Get_SC4437());

        return classScheduleList;
    }

    public mClassSchedule Get_BG14038(){
        //----------------
        mClassSchedule classSchedule = new mClassSchedule();
        classSchedule.setCourseCode("BG14038");
        classSchedule.setSectionNumber("546");
        classSchedule.setCourseName("PROFESSIONAL ETHICS SEMINAR VIII");
        classSchedule.setRemark("REMARK: MARCH 31, 2017");
        //----------------
        List<mClassDetails> classDetailsList = new ArrayList<mClassDetails>();
        mClassDetails classDetails = new mClassDetails();
        classDetails.setDayName("FRIDAY (31/03/17  )");
        classDetails.setTime("12:00 - 15:00");
        classDetails.setRoomCode("SR416");
        classDetails.setInstructorName("A.Ratsame");
        classDetailsList.add(classDetails);
        //----------------
        classSchedule.setClassDetailsList(classDetailsList);
        return classSchedule;
    }

    public mClassSchedule Get_BG2001(){
        //----------------
        mClassSchedule classSchedule = new mClassSchedule();
        classSchedule.setCourseCode("BG2001");
        classSchedule.setSectionNumber("404");
        classSchedule.setCourseName("ENGLISH IV");
        classSchedule.setRemark("REMARK: ");
        //----------------
        List<mClassDetails> classDetailsList = new ArrayList<mClassDetails>();
        mClassDetails classDetails = new mClassDetails();
        classDetails.setDayName("WEDNESDAY");
        classDetails.setTime("12:00 - 13:30");
        classDetails.setRoomCode("SG407");
        classDetails.setInstructorName("ROBERT JOHN HADDEN III");
        classDetailsList.add(classDetails);
        //----------------
        classDetails = new mClassDetails();
        classDetails.setDayName("MONDAY");
        classDetails.setTime("10:30 - 13:30");
        classDetails.setRoomCode("SG407");
        classDetails.setInstructorName("VAUGHN BAXTER WARJRI");
        classDetailsList.add(classDetails);
        //----------------
        classDetails = new mClassDetails();
        classDetails.setDayName("WEDNESDAY");
        classDetails.setTime("10:30 - 12:00");
        classDetails.setRoomCode("SG407");
        classDetails.setInstructorName("VAUGHN BAXTER WARJRI");
        classDetailsList.add(classDetails);
        classSchedule.setClassDetailsList(classDetailsList);
        return classSchedule;
    }

    public mClassSchedule Get_LA4606(){
        //----------------
        mClassSchedule classSchedule = new mClassSchedule();
        classSchedule.setCourseCode("LA4606");
        classSchedule.setSectionNumber("541");
        classSchedule.setCourseName("INTELLECTUAL PROPERTY LAW");
        classSchedule.setRemark("REMARK: ");
        //----------------
        List<mClassDetails> classDetailsList = new ArrayList<mClassDetails>();
        mClassDetails classDetails = new mClassDetails();
        classDetails.setDayName("FRIDAY");
        classDetails.setTime("09:00 - 11:00");
        classDetails.setRoomCode("SR201");
        classDetails.setInstructorName("NATTAPONG SUWAN-IN");
        classDetailsList.add(classDetails);
        //----------------
        classDetails = new mClassDetails();
        classDetails.setDayName("FRIDAY");
        classDetails.setTime("11:00 - 12:00");
        classDetails.setRoomCode("SR201");
        classDetails.setInstructorName("PAKORN DAMRONGWATTANAPOKIN");
        classDetailsList.add(classDetails);
        //----------------
        classSchedule.setClassDetailsList(classDetailsList);
        return classSchedule;
    }

    public mClassSchedule Get_MT4201(){
        //----------------
        mClassSchedule classSchedule = new mClassSchedule();
        classSchedule.setCourseCode("MT4201");
        classSchedule.setSectionNumber("541");
        classSchedule.setCourseName("SOCIAL INTERESTS, GOVERNMENT POLICIES AND TECHNOLOGY");
        classSchedule.setRemark("REMARK: ");
        //----------------
        List<mClassDetails> classDetailsList = new ArrayList<mClassDetails>();
        mClassDetails classDetails = new mClassDetails();
        classDetails.setDayName("MONDAY");
        classDetails.setTime("13:30 - 16:30");
        classDetails.setRoomCode("VMS0402");
        classDetails.setInstructorName("TUN TUN AUNG");
        classDetailsList.add(classDetails);
        //----------------
        classSchedule.setClassDetailsList(classDetailsList);
        return classSchedule;
    }

    public mClassSchedule Get_SC4299(){
        //----------------
        mClassSchedule classSchedule = new mClassSchedule();
        classSchedule.setCourseCode("SC4299");
        classSchedule.setSectionNumber("541");
        classSchedule.setCourseName("SENIOR PROJECT");
        classSchedule.setRemark("REMARK: ");
        //----------------
        List<mClassDetails> classDetailsList = new ArrayList<mClassDetails>();
        //----------------
        classSchedule.setClassDetailsList(classDetailsList);
        return classSchedule;
    }

    public mClassSchedule Get_SC4373(){
        //----------------
        mClassSchedule classSchedule = new mClassSchedule();
        classSchedule.setCourseCode("SC4373");
        classSchedule.setSectionNumber("541");
        classSchedule.setCourseName("WEB APPLICATION DEVELOPMENT");
        classSchedule.setRemark("REMARK: ");
        //----------------
        List<mClassDetails> classDetailsList = new ArrayList<mClassDetails>();
        mClassDetails classDetails = new mClassDetails();
        classDetails.setDayName("TUESDAY");
        classDetails.setTime("09:00 - 12:00");
        classDetails.setRoomCode("VMS0204");
        classDetails.setInstructorName("KIRATIJUTA BHUMICHITR");
        classDetailsList.add(classDetails);
        //----------------
        classSchedule.setClassDetailsList(classDetailsList);
        return classSchedule;
    }

    public mClassSchedule Get_SC4374(){
        //----------------
        mClassSchedule classSchedule = new mClassSchedule();
        classSchedule.setCourseCode("SC4374");
        classSchedule.setSectionNumber("541");
        classSchedule.setCourseName("ENTERPRISE APPLICATION DEVELOPMENT");
        classSchedule.setRemark("REMARK: ");
        //----------------
        List<mClassDetails> classDetailsList = new ArrayList<mClassDetails>();
        mClassDetails classDetails = new mClassDetails();
        classDetails.setDayName("WEDNESDAY");
        classDetails.setTime("13:30 - 16:30");
        classDetails.setRoomCode("VMS0204");
        classDetails.setInstructorName("CHAYAPOL MOEMENG");
        classDetailsList.add(classDetails);
        //----------------
        classSchedule.setClassDetailsList(classDetailsList);
        return classSchedule;
    }

    public mClassSchedule Get_SC4437(){
        //----------------
        mClassSchedule classSchedule = new mClassSchedule();
        classSchedule.setCourseCode("SC4437");
        classSchedule.setSectionNumber("541");
        classSchedule.setCourseName("SELECTED TOPIC IN SOFTWARE VERIFICATION AND VALIDATION");
        classSchedule.setRemark("REMARK: ");
        //----------------
        List<mClassDetails> classDetailsList = new ArrayList<mClassDetails>();
        mClassDetails classDetails = new mClassDetails();
        classDetails.setDayName("TUESDAY");
        classDetails.setTime("13:30 - 16:30");
        classDetails.setRoomCode("VMS0202");
        classDetails.setInstructorName("KWANKAMOL NONGPONG");
        classDetailsList.add(classDetails);
        //----------------
        classSchedule.setClassDetailsList(classDetailsList);
        return classSchedule;
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
