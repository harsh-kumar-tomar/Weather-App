package com.example.javaappversion14.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;

import com.example.javaappversion14.Adapters.HourlyAdapter;
import com.example.javaappversion14.Domains.Hourly;
import com.example.javaappversion14.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly ;
    private RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = getWindow();
        window.setStatusBarColor(Color.parseColor("#511CAE"));


        initRecyclerview();
    }

    private void initRecyclerview() {
        ArrayList <Hourly> items = new ArrayList<>() ;

        items.add(new Hourly("7 am" , 25 , "cloudy"));
        items.add(new Hourly("8 am" , 25 , "rainy"));
        items.add(new Hourly("9 am" , 27 , "sunny"));
        items.add(new Hourly("10 am" , 28 , "windy"));
        items.add(new Hourly("11 am" , 26 , "windy"));
        items.add(new Hourly("12 am" , 23 , "rainy"));
        items.add(new Hourly("1 pm" , 22 , "rainy"));
        items.add(new Hourly("2 pm" , 21 , "snowy"));
        items.add(new Hourly("3 pm" , 19 , "storm"));
        items.add(new Hourly("4 pm" , 15 , "sunny"));

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));

        adapterHourly = new HourlyAdapter(items) ;

        recyclerView.setAdapter(adapterHourly);



    }
}