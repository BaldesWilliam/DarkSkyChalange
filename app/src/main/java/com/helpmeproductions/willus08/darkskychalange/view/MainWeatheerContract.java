package com.helpmeproductions.willus08.darkskychalange.view;


import com.helpmeproductions.willus08.darkskychalange.BasePresenter;
import com.helpmeproductions.willus08.darkskychalange.BaseView;
import com.helpmeproductions.willus08.darkskychalange.model.WeatherInformation;

public interface MainWeatheerContract {
    interface View extends BaseView{
        void initRecycler(WeatherInformation info);

    }
    interface Presenter extends BasePresenter<View>{

    }
}
