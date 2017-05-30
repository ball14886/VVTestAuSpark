package verificationandvalidation.ausparktest.Models;

/**
 * Created by supanattechasothon on 5/30/2017 AD.
 */

public class mClassExamDetails extends mClassExam {

    public String startTime;
    public String endTime;
    public String courseName;
    public String examRoom;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getExamRoom() {
        return examRoom;
    }

    public void setExamRoom(String examRoom) {
        this.examRoom = examRoom;
    }

}
