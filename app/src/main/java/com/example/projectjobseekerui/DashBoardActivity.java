package com.example.projectjobseekerui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DashBoardActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
   List<SpecificJob> jobList;
   SpecificJobAdoptor adaptor;
    private RecyclerView suggestRecyclerViews;
    private RecyclerView specific_recycle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);




        specific_recycle=findViewById(R.id.recyclejob);
        specific_recycle.setLayoutManager(new LinearLayoutManager(this));
        specific_recycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        List<SpecificJob> job_name= new ArrayList<SpecificJob>();
        job_name.add(new SpecificJob(R.drawable.data_management,"48 Active Recruiters","Data Analyst","Hydrabad"));
        job_name.add(new SpecificJob((R.drawable.data_management),"52 Active Recruiters","Python Developer","Mumbai"));
        specific_recycle.setAdapter(new SpecificJobAdoptor(job_name));

    }
}