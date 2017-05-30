package verificationandvalidation.ausparktest.Models;

import java.util.List;

/**
 * Created by supanattechasothon on 5/30/2017 AD.
 */

public class mSection extends mCourse{


    public String sectionNumber;
    public String seatNumber;
    public String remark;
    public String midDate;
    public String midTime;
    public String finalDate;
    public String finalTime;
    public List<mClassDetails> sectionDetailsList;

    public List<mClassDetails> getSectionDetailsList() {
        return sectionDetailsList;
    }

    public void setSectionDetailsList(List<mClassDetails> sectionDetailsList) {
        this.sectionDetailsList = sectionDetailsList;
    }




    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMidDate() {
        return midDate;
    }

    public void setMidDate(String midDate) {
        this.midDate = midDate;
    }

    public String getMidTime() {
        return midTime;
    }

    public void setMidTime(String midTime) {
        this.midTime = midTime;
    }

    public String getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(String finalDate) {
        this.finalDate = finalDate;
    }

    public String getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(String finalTime) {
        this.finalTime = finalTime;
    }
}
