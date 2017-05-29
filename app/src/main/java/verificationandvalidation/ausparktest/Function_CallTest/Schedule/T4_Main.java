package verificationandvalidation.ausparktest.Function_CallTest.Schedule;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Function_CallTest.Advisor.T2_01_AdvisorContact;
import verificationandvalidation.ausparktest.Function_CallTest.Advisor.T2_02_AdvisorInformation;

/**
 * Created by supanattechasothon on 5/29/2017 AD.
 */

public class T4_Main {


    public void Run(AppiumDriver driver) throws Exception {
        T4_01_Schedule(driver);
        T4_02_ExamSchedule(driver);

    }

    public void T4_01_Schedule(AppiumDriver driver) throws Exception {
        T4_01_Schedule T4_01 = new T4_01_Schedule();
        T4_01.Test_T4_01_01();
    }

    public void T4_02_ExamSchedule(AppiumDriver driver) throws Exception {
        T4_02_ExamSchedule T4_02 = new T4_02_ExamSchedule();
        T4_02.Test_T4_02_01();
    }

}
