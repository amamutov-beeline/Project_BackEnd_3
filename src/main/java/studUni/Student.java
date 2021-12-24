package studUni;

import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("studentName") private String fullName;
    @SerializedName("universityId") private String universityId;
    @SerializedName("course") private int currentCourseNumber;
    @SerializedName("avgScore") private float avgExamScore;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    @Override
    public String toString() {
        return "fullName = '" + fullName + '\'' +
                ", universityId = '" + universityId + '\'' +
                ", currentCourseNumber = " + currentCourseNumber +
                ", avgExamScore = " + avgExamScore;
    }
}
