package com.arasu.vt.allcountries;

import com.arasu.vt.allcountries.interfaces.POJOInterface;
import com.arasu.vt.allcountries.models.RootObject;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import rx.Observable;
import rx.subjects.BehaviorSubject;

/**
 * Created by kyros on 07-11-2017.
 */

public class CountryViewModel {
    private BehaviorSubject<List<RootObject>>countryList=BehaviorSubject.create(new ArrayList<RootObject>());
    private BehaviorSubject<Boolean>isLoading=BehaviorSubject.create(false);
    private POJOInterface pojoInterface;
    @Inject
    public CountryViewModel(POJOInterface pojoInterface){
        this.pojoInterface=pojoInterface;
    }
    public Observable<List<RootObject>>loadCountries(){
        if(isLoading.getValue()){
            return Observable.empty();
        }
        isLoading.onNext(true);
        return pojoInterface
                .getCountries()
                .doOnNext(country ->{
                    List<RootObject>fullList=new ArrayList<>(countryList.getValue());
                    fullList.addAll(country);
                    countryList.onNext(fullList);
                })
                .doOnTerminate(()->isLoading.onNext(false));


    }
    public BehaviorSubject<Boolean>getIsLoading(){
        return isLoading;
    }
    public Observable<List<RootObject>>getCountries(){
        return countryList.asObservable();
    }
}
