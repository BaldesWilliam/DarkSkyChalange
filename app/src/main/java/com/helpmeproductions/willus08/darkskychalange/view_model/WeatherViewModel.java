package com.helpmeproductions.willus08.darkskychalange.view_model;


import android.databinding.ObservableField;
import android.support.annotation.NonNull;
import android.util.Log;

import com.helpmeproductions.willus08.darkskychalange.data.remote.APIProvider;
import com.helpmeproductions.willus08.darkskychalange.model.WeatherInformation;
import com.helpmeproductions.willus08.darkskychalange.view.MainWeatheerContract;
import com.helpmeproductions.willus08.darkskychalange.view.MainWeather;

import java.util.Observable;

import retrofit2.Call;
import retrofit2.Response;

public class WeatherViewModel implements MainWeatheerContract.Presenter {
    private MainWeatheerContract.View view;
    private final double DEFAULT_LAT = 32.7157;
    private final double DEFAULT_LNG = 117.1611;
//    public ObservableField<String> currentLat;
//    public ObservableField<String> currentLng;

    public WeatherViewModel() {
        getWeather();
    }

    public void getWeather() {


        retrofit2.Call<WeatherInformation> weatherInformationCall = APIProvider.getWeatherCall(DEFAULT_LAT, DEFAULT_LNG);
        weatherInformationCall.enqueue((new retrofit2.Callback<WeatherInformation>() {
            @Override
            public void onResponse(@NonNull Call<WeatherInformation> call, @NonNull Response<WeatherInformation> response) {
               // Log.d("test", "onResponse: " + response.body().getCurrently().getSummary());
                view.initRecycler(response.body());

            }

            @Override
            public void onFailure(@NonNull Call<WeatherInformation> call, @NonNull Throwable t) {
               view.showMessage(t.getMessage());
            }
        }));

    }

    @Override
    public void addView(MainWeatheerContract.View view) {
        this.view = view;
        getWeather();
    }

    @Override
    public void removeView() {
        this.view = null;
    }
}
