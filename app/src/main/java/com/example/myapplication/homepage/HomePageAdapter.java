package com.example.myapplication.homepage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.databinding.HomeItemBinding;
import com.example.myapplication.homepage.model.CourseItem;

import java.util.List;

public class HomePageAdapter extends RecyclerView.Adapter<HomePageAdapter.CourseViewHolder> {

    private List<CourseItem> datas;

    private Context mContext;

    public HomePageAdapter(Context context, List<CourseItem> datas) {
        this.mContext = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        HomeItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.home_item, parent,false);
        return new CourseViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        HomeItemBinding binding = DataBindingUtil.bind(holder.itemView);
        binding.setCourseItem(datas.get(position));
        binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    protected class CourseViewHolder extends RecyclerView.ViewHolder{

        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
