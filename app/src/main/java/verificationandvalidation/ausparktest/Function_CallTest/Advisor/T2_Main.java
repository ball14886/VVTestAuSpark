package verificationandvalidation.ausparktest.Function_CallTest.Advisor;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Function_CallTest.Academic_Record.T3_01_GradeList;
import verificationandvalidation.ausparktest.Function_CallTest.Academic_Record.T3_03_Transcript;

/**
 * Created by supanattechasothon on 5/29/2017 AD.
 */

public class T2_Main {


    public void Run(AppiumDriver driver) throws Exception {
        T2_01_AdvisorContact(driver);
        T2_02_AdvisorInformation(driver);

    }

    public void T2_01_AdvisorContact(AppiumDriver driver) throws Exception {
        T2_01_AdvisorContact T2_01 = new T2_01_AdvisorContact();
        T2_01.Test_T2_01_01();
    }

    public void T2_02_AdvisorInformation(AppiumDriver driver) throws Exception {
        T2_02_AdvisorInformation T2_02 = new T2_02_AdvisorInformation();
        T2_02.Test_T2_01_01();
    }

}
