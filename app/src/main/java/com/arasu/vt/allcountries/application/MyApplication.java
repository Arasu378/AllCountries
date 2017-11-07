package com.arasu.vt.allcountries.application;

import android.app.Application;

import com.arasu.vt.allcountries.dependencyinjection.ApplicationComponent;
import com.arasu.vt.allcountries.dependencyinjection.DaggerApplicationComponent;

/**
 * Created by kyros on 07-11-2017.
 */

public class MyApplication extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent= DaggerApplicationComponent.create();
    }

    public ApplicationComponent getApplicationComponent() {
       return this.applicationComponent = applicationComponent;
    }
}
