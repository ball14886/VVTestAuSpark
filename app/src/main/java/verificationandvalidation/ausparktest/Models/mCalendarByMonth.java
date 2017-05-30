package verificationandvalidation.ausparktest.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by supanattechasothon on 5/30/2017 AD.
 */

public class mCalendarByMonth {

    public String monthName;
    public String yearNumber;
    public List<mCalendar> calendarList;

    public mCalendarByMonth(){
        monthName = "";
        yearNumber = "";
        calendarList = new ArrayList<mCalendar>();
    }

    public mCalendarByMonth(String monthName, String yearNumber){
        this.monthName = monthName;
        this.yearNumber = yearNumber;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(String yearNumber) {
        this.yearNumber = yearNumber;
    }

    public List<mCalendar> getCalendarList() {
        return calendarList;
    }

    public void setCalendarList(List<mCalendar> calendarList) {
        this.calendarList = calendarList;
    }
}
