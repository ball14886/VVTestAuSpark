package verificationandvalidation.ausparktest.Models;

import java.util.List;

/**
 * Created by supanattechasothon on 5/30/2017 AD.
 */

public class mClassSchedule {

    public String courseCode;
    public String sectionNumber;
    public String courseName;
    public String remark;
    public List<mClassDetails> classDetailsList;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<mClassDetails> getClassDetailsList() {
        return classDetailsList;
    }

    public void setClassDetailsList(List<mClassDetails> classDetailsList) {
        this.classDetailsList = classDetailsList;
    }
}


