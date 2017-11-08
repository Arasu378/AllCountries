package com.arasu.vt.allcountries.adapters;

import android.databinding.BindingAdapter;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.arasu.vt.allcountries.R;
import com.pixplicity.sharp.Sharp;
import com.squareup.picasso.Picasso;

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
    @BindingAdapter({"app:flagImage"})
    public static void loadFlagImage(ImageView view,String url){
        if(url!=null){
//            try{
//                Sharp.loadString(url)
//                        .into(view);
//            }catch (Exception e){
//                e.printStackTrace();
//            }

            Picasso.with(view.getContext())
                    .load(url)
                    .placeholder(R.color.colorAccent)
                    .into(view);
        }
    }
    @BindingAdapter({"app:capital"})
    public static void loadCapital(TextView view,String text){
        if(text!=null){
            view.setText(text);
        }
    }
    @BindingAdapter({"app:region"})
    public static void loadRegion(TextView view,String text){
        if(text!=null){
            view.setText(text);
        }
    }
    @BindingAdapter({"app:subRegion"})
    public static void loadSubRegion(TextView view,String text){
        if(text!=null){
            view.setText(text);
        }
    }
    @BindingAdapter({"app:population"})
    public static void loadPopulation(TextView view,int text){
        if(text!=0){
            String value=""+text;
            view.setText(value);
        }
    }
}
