package verificationandvalidation.ausparktest.Models;

import java.util.List;

/**
 * Created by supanattechasothon on 5/30/2017 AD.
 */

public class mGenerateSchedule {

    public String scheduleName;
    public boolean isFavorited;
    public List<mSection> courseSectionList;

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public boolean isFavorited() {
        return isFavorited;
    }

    public void setFavorited(boolean favorited) {
        isFavorited = favorited;
    }

    public List<mSection> getCourseSectionList() {
        return courseSectionList;
    }

    public void setCourseSectionList(List<mSection> courseSectionList) {
        this.courseSectionList = courseSectionList;
    }
}
