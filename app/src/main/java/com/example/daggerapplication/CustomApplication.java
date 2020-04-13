package com.example.daggerapplication;

import android.app.Application;

import com.example.daggerapplication.dagger.AppComponent;
import com.example.daggerapplication.dagger.DaggerAppComponent;

public class CustomApplication extends Application implements AppComponent.ComponentProvider {

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Reference to the application graph that is used across the whole app
        appComponent = DaggerAppComponent.create();
    }
    
    @Override
    public AppComponent getInjector() {
        return appComponent;
    }
}
