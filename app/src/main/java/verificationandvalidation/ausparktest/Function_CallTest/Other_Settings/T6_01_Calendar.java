package verificationandvalidation.ausparktest.Function_CallTest.Other_Settings;

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
import verificationandvalidation.ausparktest.Models.mCalendar;
import verificationandvalidation.ausparktest.Models.mCalendarByMonth;
import verificationandvalidation.ausparktest.Provider.Functions;

/**
 * Created by supanattechasothon on 5/27/2017 AD.
 */

public class T6_01_Calendar {

    Functions func = new Functions();
    AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        driver = func.SetupDriver();
    }

    @Test
    public void Test_T6_01_01() throws Exception {
        func.loginWith5611779(driver);
        func.threadSleep_5();

        func.SwipeToOpenNavigationBar(driver);
        func.threadSleep_2();

        func.SwipeMenuSidebarTopToDown(driver);
        func.threadSleep_2();

        func.getElementByID(driver, "edu.au.auspark:id/item_calendar").click();
        func.threadSleep_2();

        MobileElement container_calendar = func.getElementByID(driver, "edu.au.auspark:id/au_calendar_block_holder");
        List<MobileElement> calendarMonthList = container_calendar.findElements(By.className("android.widget.LinearLayout"));

        List<mCalendarByMonth> calendarByMonthList = getCalendarByMonthList();
        int index = 0;
        for (MobileElement calendarMonth : calendarMonthList) {

            String monthName = func.getElementByID(driver, calendarMonth, "edu.au.auspark:id/month").getText();
            Assert.assertTrue(func.stringComparision(calendarByMonthList.get(index).getMonthName(), monthName));

            String yearNumber = func.getElementByID(driver, calendarMonth, "edu.au.auspark:id/year").getText();
            Assert.assertTrue(func.stringComparision(calendarByMonthList.get(index).getYearNumber(), yearNumber));

            func.getElementByID(driver, calendarMonth,"edu.au.auspark:id/more_info_btn").click();
            func.threadSleep_2();

            MobileElement container_day = func.getElementByID(driver, calendarMonth, "edu.au.auspark:id/au_calendar_detail_block");
            List<MobileElement> dayList = container_day.findElements(By.className("android.widget.LinearLayout"));

            List<mCalendar> calendar = calendarByMonthList.get(index).getCalendarList();
            int j_index = 0;
            for (MobileElement day : dayList) {
                String dayNumber = func.getElementByID(driver, day,"edu.au.auspark:id/date_act").getText();
                Assert.assertTrue(func.stringComparision(calendar.get(j_index).getDayNumber(), dayNumber));

//                String colorDot = func.getElementByID(driver, "edu.au.auspark:id/color_dot").getText();
//                Assert.assertTrue(func.stringComparision(calendar.get(j_index).get, colorDot));

                String dayName = func.getElementByID(driver, day,"edu.au.auspark:id/activity").getText();
                Assert.assertTrue(func.stringComparision(calendar.get(j_index).getDayName(), dayName));
                j_index++;
            }
            index++;

        }
    }

    public List<mCalendarByMonth> getCalendarByMonthList(){
        List<mCalendarByMonth> calendarByMonthList = new ArrayList<mCalendarByMonth>();

        mCalendarByMonth calendarByMonth = new mCalendarByMonth();
        calendarByMonth.setMonthName("May");
        calendarByMonth.setYearNumber("2017");
        calendarByMonth.setCalendarList(getCalendarList_May2017());

        calendarByMonthList.add(calendarByMonth);
        calendarByMonthList.add(new mCalendarByMonth("June", "2017"));
        calendarByMonthList.add(new mCalendarByMonth("July", "2017"));
        calendarByMonthList.add(new mCalendarByMonth("August", "2017"));
        calendarByMonthList.add(new mCalendarByMonth("September", "2017"));
        calendarByMonthList.add(new mCalendarByMonth("October", "2017"));
        calendarByMonthList.add(new mCalendarByMonth("November", "2017"));
        calendarByMonthList.add(new mCalendarByMonth("December", "2017"));
        calendarByMonthList.add(new mCalendarByMonth("January", "2018"));

        return calendarByMonthList;
    }

    public List<mCalendar> getCalendarList_May2017(){
        List<mCalendar> calendarList = new ArrayList<mCalendar>();

        mCalendar calendar = new mCalendar();
        calendar.setDayName("Last day to withdraw with 'W' via internet");
        calendar.setDayNumber("4");
        calendar.setDayStatus("Gray");
        calendarList.add(calendar);

        calendar = new mCalendar();
        calendar.setDayName("Retrieve and download registered student namelists via internet for eGrading");
        calendar.setDayNumber("8");
        calendar.setDayStatus("Gray");
        calendarList.add(calendar);

        calendar = new mCalendar();
        calendar.setDayName("Wisakha Bhucha Day(Holiday - no classes)");
        calendar.setDayNumber("10");
        calendar.setDayStatus("Green");
        calendarList.add(calendar);

        calendar = new mCalendar();
        calendar.setDayName("Last day of classes");
        calendar.setDayNumber("13");
        calendar.setDayStatus("Gray");
        calendarList.add(calendar);

        calendar = new mCalendar();
        calendar.setDayName("Final Examination");
        calendar.setDayNumber("15");
        calendar.setDayStatus("Red");
        calendarList.add(calendar);

        calendar.setDayNumber("16");
        calendarList.add(calendar);

        calendar.setDayNumber("17");
        calendarList.add(calendar);

        calendar.setDayNumber("18");
        calendarList.add(calendar);

        calendar.setDayNumber("19");
        calendarList.add(calendar);

        calendar.setDayNumber("22");
        calendarList.add(calendar);

        calendar.setDayNumber("23");
        calendarList.add(calendar);

        calendar.setDayNumber("24");
        calendarList.add(calendar);

        calendar.setDayNumber("25");
        calendarList.add(calendar);

        calendar.setDayNumber("26");
        calendarList.add(calendar);

        calendar.setDayNumber("27");
        calendarList.add(calendar);

        calendar.setDayNumber("28");
        calendarList.add(calendar);

        calendar = new mCalendar();
        calendar.setDayName("Ascension of Jesus");
        calendar.setDayNumber("28");
        calendar.setDayStatus("Gray");
        calendarList.add(calendar);

        calendar = new mCalendar();
        calendar.setDayName("Final Examination");
        calendar.setDayNumber("29");
        calendar.setDayStatus("Red");
        calendarList.add(calendar);

        calendar = new mCalendar();
        calendar.setDayName("Semester ends");
        calendar.setDayNumber("31");
        calendar.setDayStatus("Yellow");
        calendarList.add(calendar);

        return calendarList;
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
