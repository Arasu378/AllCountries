package com.arasu.vt.allcountries.interfaces;


import com.arasu.vt.allcountries.models.RootObject;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by kyros on 07-11-2017.
 */

public interface POJOInterface {
    @GET("all")
    Observable<List<RootObject>> getCountries();
}
