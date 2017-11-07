package com.arasu.vt.allcountries.dependencyinjection;

import com.arasu.vt.allcountries.MainActivity;
import com.arasu.vt.allcountries.dependencyinjection.modules.RetrofitClient;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by kyros on 07-11-2017.
 */
@Singleton
@Component(modules = {RetrofitClient.class})
public interface ApplicationComponent {
    void inject(MainActivity mainActivity);
}
