package com.helpmeproductions.willus08.darkskychalange.data.remote;


import com.helpmeproductions.willus08.darkskychalange.model.WeatherInformation;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIProvider {
    private static final String BASE_URL = "https://api.darksky.net/";
    private static final String API_KEY ="2faed7851c5710ff4d010187fc00c0a9";
    private static Retrofit create(){

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static Call<WeatherInformation> getWeatherCall(double lat, double lng){
        Retrofit retrofit = create();
        APIService services = retrofit.create(APIService.class);
        return services.weatherCall(API_KEY,lat,lng);
    }
}
