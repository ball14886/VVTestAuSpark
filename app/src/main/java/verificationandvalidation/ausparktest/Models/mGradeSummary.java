package verificationandvalidation.ausparktest.Models;

import java.util.List;

/**
 * Created by supanattechasothon on 5/30/2017 AD.
 */

public class mGradeSummary {

    public String grade;
    public String courseNumber;
    public List<mGradeList> mMGradeList;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public List<mGradeList> getMGradeList() {
        return mMGradeList;
    }

    public void setMGradeList(List<mGradeList> MGradeList) {
        this.mMGradeList = MGradeList;
    }
}
