package verificationandvalidation.ausparktest.Function_CallTest.Pre_registration_Planner;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Function_CallTest.Schedule.T4_01_Schedule;
import verificationandvalidation.ausparktest.Function_CallTest.Schedule.T4_02_ExamSchedule;

/**
 * Created by supanattechasothon on 5/29/2017 AD.
 */

public class T5_Main {


    public void Run(AppiumDriver driver) throws Exception {
        T5_05_PlanList(driver);
        T5_06_SavedScheduleAtPlan(driver);

    }

    public void T5_05_PlanList(AppiumDriver driver) throws Exception {
        T5_05_PlanList T5_01 = new T5_05_PlanList();
        T5_01.Test_T5_05_01(driver);
    }

    public void T5_06_SavedScheduleAtPlan(AppiumDriver driver) throws Exception {
        T5_06_SavedScheduleAtPlan T5_06 = new T5_06_SavedScheduleAtPlan();
        T5_06.Test_T5_05_01(driver);
    }

    public void T5_07_PreRegisterWithSavedSchedule(AppiumDriver driver) throws Exception {
        T5_07_PreRegisterWithSavedSchedule T5_07 = new T5_07_PreRegisterWithSavedSchedule();
        T5_07.Test_T5_07_01(driver);
    }

    public void T5_08_CourseOfNewPlan(AppiumDriver driver) throws Exception {
        T5_08_CourseOfNewPlan T5 = new T5_08_CourseOfNewPlan();
        T5.Test_T5_08_01(driver);
    }

    public void T5_10_AddCourseToNewPlan(AppiumDriver driver) throws Exception {
        T5_06_SavedScheduleAtPlan T5 = new T5_06_SavedScheduleAtPlan();
        T5.Test_T5_05_01(driver);
    }

    public void T5_11_DeleteCourseOfNewPlan(AppiumDriver driver) throws Exception {
        T5_06_SavedScheduleAtPlan T5 = new T5_06_SavedScheduleAtPlan();
        T5.Test_T5_05_01(driver);
    }

    public void T5_13_GenerateSchedule(AppiumDriver driver) throws Exception {
        T5_13_GenerateSchedule T5 = new T5_13_GenerateSchedule();
        T5.Test_T5_13_01(driver);
    }

    public void T5_14_SaveWithGenerateSchedule(AppiumDriver driver) throws Exception {
        T5_14_SaveWithGenerateSchedule T5 = new T5_14_SaveWithGenerateSchedule();
        T5.Test_T5_14_01(driver);
    }

    public void T5_15_UnSaveWithGenerateSchedule(AppiumDriver driver) throws Exception {
        T5_15_UnSaveWithGenerateSchedule T5 = new T5_15_UnSaveWithGenerateSchedule();
        T5.Test_T5_14_01(driver);
    }

    public void T5_16_PreRegisterWithGenerateSchedule(AppiumDriver driver) throws Exception {
        T5_16_PreRegisterWithGenerateSchedule T5 = new T5_16_PreRegisterWithGenerateSchedule();
        T5.Test_T5_16_01(driver);
    }

    public void T5_17_ExamScheduleWithGeneratedSchedule(AppiumDriver driver) throws Exception {
        T5_17_ExamScheduleWithGeneratedSchedule T5 = new T5_17_ExamScheduleWithGeneratedSchedule();
        T5.Test_T5_17_01(driver);
    }
}
