package com.helpmeproductions.willus08.darkskychalange.view;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.helpmeproductions.willus08.darkskychalange.R;
import com.helpmeproductions.willus08.darkskychalange.model.DailyDataum;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {
   private List<DailyDataum> dailyDataums = new ArrayList<>();

    WeatherAdapter(List<DailyDataum> dailyDataums) {
        this.dailyDataums = dailyDataums;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final DailyDataum dataum = dailyDataums.get(position);

        String highText = "High: " + dataum.getTemperatureHigh();
        String lowText = "Low: " + dataum.getTemperatureLow();
        String humidText = "Humidity: " + dataum.getHumidity();
        String windText = "Wind: " + dataum.getWindSpeed();

        holder.high.setText(highText);
        holder.low.setText(lowText);
        holder.wind.setText(windText);
        holder.humidity.setText(humidText);

        if(dataum.getIcon()!=null){
            if(dataum.getIcon().toLowerCase().contains("part")){
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.partly_cloudy)
                        .into(holder.icon);
            }else if(dataum.getIcon().toLowerCase().contains("cloud")){
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.cloudy)
                        .into(holder.icon);
            }else if(dataum.getIcon().toLowerCase().contains("snow")){
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.snow)
                        .into(holder.icon);
            }else if(dataum.getIcon().toLowerCase().contains("rain")){
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.rainy)
                        .into(holder.icon);
            }else {
                Picasso.with(holder.itemView.getContext())
                        .load(R.mipmap.sunny)
                        .into(holder.icon);

            }
        }


        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailedWeather.class);
                Gson gson = new Gson();
                intent.putExtra("weather", gson.toJson(dataum));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dailyDataums.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
       ImageView icon;
       TextView high;
       TextView low;
       TextView wind;
       TextView humidity;
       RelativeLayout container;
        ViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.ivWeatherIcon);
            high = itemView.findViewById(R.id.tvHigh);
            low = itemView.findViewById(R.id.tvLow);
            wind = itemView.findViewById(R.id.tvWind);
            humidity = itemView.findViewById(R.id.tvHumidity);
            container = itemView.findViewById(R.id.rlItemContainer);
        }
    }
}
