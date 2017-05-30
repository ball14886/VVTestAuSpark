package verificationandvalidation.ausparktest.Models;

import java.util.List;

/**
 * Created by supanattechasothon on 5/30/2017 AD.
 */

public class mClassExam {

    public String dayNumber;
    public String dayName;
    public List<mClassExamDetails> examDetailsList;

    public List<mClassExamDetails> getExamDetailsList() {
        return examDetailsList;
    }

    public void setExamDetailsList(List<mClassExamDetails> examDetailsList) {
        this.examDetailsList = examDetailsList;
    }

    public String getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(String dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }


}
