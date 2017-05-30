package verificationandvalidation.ausparktest.Models;

import java.util.List;

/**
 * Created by supanattechasothon on 5/30/2017 AD.
 */

public class mAcademicBySemester {

    public String semesterYear;
    public String GPA;
    public String credit;
    public List<mGradeList> mMGradeList;

    public String getSemesterYear() {
        return semesterYear;
    }

    public void setSemesterYear(String semesterYear) {
        this.semesterYear = semesterYear;
    }


    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public List<mGradeList> getGradeList() {
        return mMGradeList;
    }

    public void setGradeList(List<mGradeList> mGradeList) {
        this.mMGradeList = mGradeList;
    }



}

