package verificationandvalidation.ausparktest.Models;

import java.util.List;

/**
 * Created by supanattechasothon on 5/30/2017 AD.
 */

public class mPlan {

    public String planName;
    public String credit;

    public String getPlanNumber() {
        return planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
    }

    public String planNumber;
    public List<mCourse> coursePlanList;

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public List<mCourse> getCoursePlanList() {
        return coursePlanList;
    }

    public void setCoursePlanList(List<mCourse> coursePlanList) {
        this.coursePlanList = coursePlanList;
    }
}
