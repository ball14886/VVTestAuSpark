package verificationandvalidation.ausparktest.Function_CallTest.Student;

import org.junit.After;
import org.junit.Test;

import io.appium.java_client.AppiumDriver;
import verificationandvalidation.ausparktest.Function_CallTest.Advisor.T2_01_AdvisorContact;
import verificationandvalidation.ausparktest.Function_CallTest.Advisor.T2_02_AdvisorInformation;
import verificationandvalidation.ausparktest.Main;

/**
 * Created by supanattechasothon on 5/29/2017 AD.
 */

public class T1_Main {

    public void Run(AppiumDriver driver) throws Exception {
        T1_01_Login(driver);
        T1_02_ForgetPassword(driver);
    }

    @Test
    public void T1_01_Login(AppiumDriver driver) throws Exception {
        T1_01_Login T1_01 = new T1_01_Login();
        T1_01.Test_T1_01_01();
        T1_01.Test_T1_01_02();
        T1_01.Test_T1_01_03();
        T1_01.Test_T1_01_04();
        T1_01.Test_T1_01_05();
    }

    public void T1_02_ForgetPassword(AppiumDriver driver) throws Exception {
        T1_02_ForgetPassword T1_02 = new T1_02_ForgetPassword();
        T1_02.Test_T1_02_01();
        T1_02.Test_T1_02_02();
        T1_02.Test_T1_02_03();
        T1_02.Test_T1_02_04();
    }

    public void T1_03_LoginFacebook(AppiumDriver driver) throws Exception {
        T1_03_LoginFacebook T1_03 = new T1_03_LoginFacebook();
        T1_03.Test_T1_03_01();
    }

    public void T1_04_Logout(AppiumDriver driver) throws Exception {
        T1_04_Logout T1_04 = new T1_04_Logout();
        T1_04.Test_T1_04_01();
    }
}
