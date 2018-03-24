package com.helpmeproductions.willus08.darkskychalange;



public interface BasePresenter<V extends BaseView> {
    void addView(V view);
    void removeView();
}
