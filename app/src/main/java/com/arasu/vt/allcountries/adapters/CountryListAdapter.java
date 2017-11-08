package com.arasu.vt.allcountries.adapters;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arasu.vt.allcountries.CountryDetailActivity;
import com.arasu.vt.allcountries.R;
import com.arasu.vt.allcountries.databinding.AdapterListItemBinding;
import com.arasu.vt.allcountries.databinding.InfiniteLoaderBinding;
import com.arasu.vt.allcountries.models.RootObject;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import retrofit2.http.PUT;

/**
 * Created by kyros on 07-11-2017.
 */

public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.MyViewHolder> {
   private List<RootObject>countryList;
   private static final int LIST_ITEM=0;
   private static final int LOAD_MORE=1;

   private boolean showLoadingMore=false;
    abstract class MyViewHolder extends RecyclerView.ViewHolder{
        MyViewHolder(View view){super(view);}
        abstract void bindTo(RootObject rootObject);
    }
    public void setCountryList(List<RootObject>countryList){
        if(countryList==null){
            return;
        }
        this.countryList=new ArrayList<>(countryList);
        notifyDataSetChanged();
    }
public CountryListAdapter(List<RootObject>countryList){
        this.countryList=countryList;
}

    public void setShowLoadingMore(boolean isLoading){
        showLoadingMore=isLoading;
    }
    public class CountryViewHolderBackdrop extends MyViewHolder{
        AdapterListItemBinding binding;

        CountryViewHolderBackdrop(AdapterListItemBinding view) {
            super(view.getRoot());
            this.binding=view;
        }

        @Override
        void bindTo(RootObject rootObject) {
            binding.setText(rootObject);
            binding.executePendingBindings();
        }
    }
    public class LoadingMoreHolder extends MyViewHolder{

        LoadingMoreHolder(InfiniteLoaderBinding view) {
            super(view.getRoot());
        }

        @Override
        void bindTo(RootObject rootObject) {

        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        if(viewType==LOAD_MORE){
                    InfiniteLoaderBinding binding=DataBindingUtil.inflate(layoutInflater,R.layout.infinite_loader,parent,false);
                    return new LoadingMoreHolder(binding);
        }else {
            AdapterListItemBinding binding= DataBindingUtil.inflate(layoutInflater, R.layout.adapter_list_item,parent,false);
            return new CountryViewHolderBackdrop(binding);
        }

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            switch (getItemViewType(position)){
                case LIST_ITEM:
                    holder.bindTo(countryList.get(position));
                   holder.itemView.setOnClickListener(v->{
                       Context context=holder.itemView.getContext();
                       Bundle bundle=new Bundle();
                       Intent intent=new Intent(context, CountryDetailActivity.class);
                       RootObject object=countryList.get(position);
                       bundle.putParcelable("value",object);
                       intent.putExtras(bundle);
                       context.startActivity(intent);
                   });
                    break;
                case LOAD_MORE:
                    break;
            }
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}
