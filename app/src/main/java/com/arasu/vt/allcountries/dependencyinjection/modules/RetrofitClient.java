package com.arasu.vt.allcountries.dependencyinjection.modules;

import com.arasu.vt.allcountries.BuildConfig;
import com.arasu.vt.allcountries.interfaces.POJOInterface;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kyros on 07-11-2017.
 */
@Module
public class RetrofitClient {
@Provides
@Singleton
    public POJOInterface pojoInterface(){
    Retrofit retrofit =new Retrofit.Builder()
            .baseUrl(BuildConfig.END_POINT)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build();
    return retrofit.create(POJOInterface.class);
}
}
