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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_country_detail);
        try{
            Bundle bundle=getIntent().getExtras();
            if(bundle!=null){
                RootObject object =bundle.getParcelable("value");

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
