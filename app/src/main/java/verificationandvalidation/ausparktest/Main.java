package verificationandvalidation.ausparktest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import verificationandvalidation.ausparktest.Function_CallTest.Academic_Record.T3_Main;
import verificationandvalidation.ausparktest.Function_CallTest.Advisor.T2_Main;
import verificationandvalidation.ausparktest.Function_CallTest.Other_Settings.T6_Main;
import verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner.T5_Main;
import verificationandvalidation.ausparktest.Function_CallTest.Schedule.T4_Main;
import verificationandvalidation.ausparktest.Function_CallTest.Student.T1_01_Login;
import verificationandvalidation.ausparktest.Function_CallTest.Student.T1_Main;
import verificationandvalidation.ausparktest.Provider.Functions;
import verificationandvalidation.ausparktest.Provider.SecurityProvider;
import verificationandvalidation.ausparktest.Provider.SetupProvider;

/**
 * Created by supanattechasothon on 5/20/2017 AD.
 */

public class Main {
    AppiumDriver driver;
    SetupProvider setupProvider = new SetupProvider();

    @Before
    public void setUp() throws MalformedURLException {
        driver = new AndroidDriver(new URL(
                setupProvider.GetAndroidDriverURL()),
                setupProvider.GetDesiredCapabilities());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

//    @Test
//    public void RunTest() throws Exception {
//
//        if (!function.isAuthorization(driver)){
//            T1_01_Login loginTest = new T1_01_Login();
//            loginTest.testLogin(driver);
//        }
//
//        AcademicRecord_Test();
//    }

    @Test
    public void T1_Student() throws Exception {
        T1_Main main = new T1_Main();
        main.T1_01_Login(driver);
//        main.T1_02_ForgetPassword(driver);
//        main.T1_03_LoginFacebook(driver);
//        main.T1_04_Logout(driver);
    }


    public void T2_Schedule()  throws Exception {
        T2_Main main = new T2_Main();
        main.T2_01_AdvisorContact(driver);
        main.T2_02_AdvisorInformation(driver);
    }


    public void T3_AcademicRecord()  throws Exception {
        T3_Main main = new T3_Main();
        main.T3_01_GradeList(driver);
        main.T3_03_Transcript(driver);
    }


    public void T4_Schedule()  throws Exception {
        T4_Main main = new T4_Main();
        main.T4_01_Schedule(driver);
        main.T4_02_ExamSchedule(driver);
    }


    public void T5_PreRegistrationPlanner()  throws Exception {
        T5_Main main = new T5_Main();
        main.T5_05_PlanList(driver);
        main.T5_06_SavedScheduleAtPlan(driver);
        main.T5_07_PreRegisterWithSavedSchedule(driver);
        main.T5_08_CourseOfNewPlan(driver);
        main.T5_10_AddCourseToNewPlan(driver);
        main.T5_11_DeleteCourseOfNewPlan(driver);
        main.T5_13_GenerateSchedule(driver);
        main.T5_14_SaveWithGenerateSchedule(driver);
        main.T5_15_UnSaveWithGenerateSchedule(driver);
        main.T5_16_PreRegisterWithGenerateSchedule(driver);
        main.T5_17_ExamScheduleWithGeneratedSchedule(driver);
    }


    public void T6_OtherSettings()  throws Exception {
        T6_Main main = new T6_Main();
        main.T6_02_ResetPassword(driver);
    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
