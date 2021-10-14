package com.example.myapplication.homepage.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication.homepage.model.CourseItem;

import java.util.ArrayList;

public class HomePageViewModel extends ViewModel {

    private MutableLiveData<ArrayList<CourseItem>> courses;

    public MutableLiveData<ArrayList<CourseItem>> getCourses() {
        if (courses == null) {
            courses = new MutableLiveData<>();
            courses.setValue(new ArrayList<>());
        }
        return courses;
    }

    public void getCourseList() {
        ArrayList<CourseItem> courseItems = new ArrayList<>();
        CourseItem courseItem = new CourseItem();
        courseItem.setCourseTitle("语文课");


        CourseItem courseItem1 = new CourseItem();
        courseItem1.setCourseTitle("数学课");

        courseItems.add(courseItem);
        courseItems.add(courseItem1);
        courses.getValue().addAll(courseItems);
    }
}
