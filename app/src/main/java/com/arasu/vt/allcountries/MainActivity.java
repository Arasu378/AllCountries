package com.arasu.vt.allcountries;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.arasu.vt.allcountries.adapters.CountryListAdapter;
import com.arasu.vt.allcountries.application.MyApplication;
import com.arasu.vt.allcountries.databinding.ActivityMainBinding;
import com.arasu.vt.allcountries.models.RootObject;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class MainActivity extends AppCompatActivity {
    @Inject
    CountryViewModel viewModel;
    private CompositeSubscription subscription;
    private List<RootObject>countryList=new ArrayList<>();
    private ActivityMainBinding binding;
    private LinearLayoutManager layoutManager;
    private CountryListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        ((MyApplication)getApplication()).getApplicationComponent().inject(this);
            subscription=new CompositeSubscription();
    }

    @Override
    protected void onStart() {
        super.onStart();
        layoutManager=new LinearLayoutManager(this);
        binding.recyclerCountries.setLayoutManager(layoutManager);
        adapter=new CountryListAdapter(countryList);
        binding.recyclerCountries.setAdapter(adapter);
        initBindings();
        if(countryList.isEmpty()){
            loadCountries();
        }else{
            adapter.setCountryList(countryList);
        }
    }

    private void loadCountries() {
        subscription.add(viewModel.loadCountries()
        .subscribeOn(Schedulers.computation())
        .observeOn(AndroidSchedulers.mainThread())
        .doOnError(throwable -> Log.e("Error : ",""+throwable.getMessage()))
        .subscribe(country1 ->{
            binding.recyclerCountries.setVisibility(View.VISIBLE);
            binding.loading.setVisibility(View.GONE);
        }));
    }

    private void initBindings(){
        viewModel.getCountries()
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((items)->{
                this.countryList=items;
                adapter.setCountryList(items);
                });
        viewModel.getIsLoading().observeOn(AndroidSchedulers.mainThread()).subscribe(aBoolean -> {
            adapter.setShowLoadingMore(aBoolean);
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        subscription.clear();
    }
}
