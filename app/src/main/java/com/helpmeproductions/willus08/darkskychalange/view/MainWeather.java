package com.helpmeproductions.willus08.darkskychalange.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.helpmeproductions.willus08.darkskychalange.R;
import com.helpmeproductions.willus08.darkskychalange.databinding.ActivityMainWeatherBinding;
import com.helpmeproductions.willus08.darkskychalange.model.DailyDataum;
import com.helpmeproductions.willus08.darkskychalange.model.WeatherInformation;
import com.helpmeproductions.willus08.darkskychalange.view_model.WeatherViewModel;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.inject.Inject;


public class MainWeather extends AppCompatActivity implements MainWeatheerContract.View {

    @Inject WeatherViewModel presenter;
    RecyclerView recyclerView;
    WeatherAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    DefaultItemAnimator animator;
    WeatherViewModel weatherViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainWeatherBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main_weather);
        weatherViewModel = new WeatherViewModel();
        binding.setWeather(weatherViewModel);
        recyclerView = findViewById(R.id.rvRecyclerView);
        weatherViewModel.addView(this);
    }





    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setupDagger() {

    }

    @Override
    public void initRecycler(WeatherInformation info) {
        adapter = new WeatherAdapter(info.getDaily().getData());
        layoutManager= new LinearLayoutManager(this);
        animator = new DefaultItemAnimator();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(animator);
    }
}
