package com.arasu.vt.allcountries.adapters;

import android.databinding.BindingAdapter;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by kyros on 07-11-2017.
 */

public class CustomCountryBindingAdapter {
    @BindingAdapter({"app:countryName"})
    public static void loadCountryName(TextView view,String text){
        if(text!=null){
            view.setText(text);
        }
    }
    @BindingAdapter({"app:countryCode"})
    public static void loadCountryCode(TextView view,String text){
        if(text!=null){
            view.setText(text);
        }
    }
}
