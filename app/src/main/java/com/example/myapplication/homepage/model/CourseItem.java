package com.example.myapplication.homepage.model;

public class CourseItem {

    private String courseTitle;

    private String courseID;

    private String courseTeacherHeadImg;

    private String courseTeacherName;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseTeacherHeadImg() {
        return courseTeacherHeadImg;
    }

    public void setCourseTeacherHeadImg(String courseTeacherHeadImg) {
        this.courseTeacherHeadImg = courseTeacherHeadImg;
    }

    public String getCourseTeacherName() {
        return courseTeacherName;
    }

    public void setCourseTeacherName(String courseTeacherName) {
        this.courseTeacherName = courseTeacherName;
    }
}
