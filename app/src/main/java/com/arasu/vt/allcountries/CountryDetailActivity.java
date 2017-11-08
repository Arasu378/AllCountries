package com.arasu.vt.allcountries;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.arasu.vt.allcountries.application.MyApplication;
import com.arasu.vt.allcountries.databinding.ActivityCountryDetailBinding;
import com.arasu.vt.allcountries.models.RootObject;
import com.google.gson.annotations.Expose;

import javax.inject.Inject;

public class CountryDetailActivity extends AppCompatActivity {
    ActivityCountryDetailBinding binding;
    private String name=null;
    private String alphaCode=null;
    private String capital=null;
    private String callingCodes=null;
    private String region=null;
    private String subRegion=null;
    private String population=null;
    private String latLng=null;
    private String timeZone=null;
    private String currencyName=null;
    private String languages=null;
    private String flagImage=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_country_detail);
        try{
            Bundle bundle=getIntent().getExtras();
            if(bundle!=null){
                RootObject object =bundle.getParcelable("value");
                name=object.getName();
                binding.setValues(object);
                binding.executePendingBindings();
                Log.d("Values : ",""+object.getFlag());

            }
        }catch (Exception e){
            e.printStackTrace();
        }



    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
