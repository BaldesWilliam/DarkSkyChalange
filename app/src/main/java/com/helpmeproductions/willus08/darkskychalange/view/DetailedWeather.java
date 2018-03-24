package com.helpmeproductions.willus08.darkskychalange.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.helpmeproductions.willus08.darkskychalange.R;
import com.helpmeproductions.willus08.darkskychalange.model.DailyDataum;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailedWeather extends AppCompatActivity {

    @BindView(R.id.tvHigh)TextView high;
    @BindView(R.id.tvLow)TextView low;
    @BindView(R.id.tvHumid)TextView humid;
    @BindView(R.id.tvWind)TextView wind;
    @BindView(R.id.tvDew)TextView dew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_weather);
        ButterKnife.bind(this);
        Gson gson = new Gson();
        DailyDataum data = gson.fromJson(getIntent().getStringExtra("weather"), DailyDataum.class);
        setupView(data);
    }

    private void setupView(DailyDataum data) {
        String hightText = "High: " + data.getApparentTemperatureHigh();
        String lowText = "Low: " + data.getApparentTemperatureLow();
        String dewText = "DewPoint: " + data.getDewPoint();
        String humidText = "Humididty: " + data.getHumidity();
        String windText = "Wind speed: " + data.getWindSpeed();

        wind.setText(windText);
        high.setText(hightText);
        humid.setText(humidText);
        low.setText(lowText);
        dew.setText(dewText);
    }
}
