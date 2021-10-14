package com.example.myapplication.homepage;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.homepage.model.CourseItem;

import java.util.ArrayList;

public class RvAdapter {

    @BindingAdapter("bindData")
    public static void bindAdapter(RecyclerView recyclerView, ArrayList<CourseItem> datas) {
        recyclerView.setAdapter(new HomePageAdapter(recyclerView.getContext(), datas));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }
}
