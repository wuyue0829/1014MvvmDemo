package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.homepage.model.CourseItem;
import com.example.myapplication.homepage.viewmodel.HomePageViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HomePageViewModel homePageViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(HomePageViewModel.class);
        ActivityMainBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        viewDataBinding.setRvData(homePageViewModel.getCourses().getValue());

        homePageViewModel.getCourses().observe(this, courseItems -> {
            if (viewDataBinding.rv.getAdapter() != null) {
                viewDataBinding.rv.getAdapter().notifyDataSetChanged();
            }
       });

        homePageViewModel.getCourseList();
    }
}