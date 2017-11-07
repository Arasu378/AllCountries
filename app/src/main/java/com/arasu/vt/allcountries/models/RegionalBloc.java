package com.arasu.vt.allcountries.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by kyros on 07-11-2017.
 */

public class RegionalBloc{
    @SerializedName("acronym")
    @Expose
    private String acronym;

    public String getAcronym() { return this.acronym; }

    public void setAcronym(String acronym) { this.acronym = acronym; }
    @SerializedName("name")
    @Expose
    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }
    @SerializedName("otherAcronyms")
    @Expose
    private ArrayList<String> otherAcronyms;

    public ArrayList<String> getOtherAcronyms() { return this.otherAcronyms; }

    public void setOtherAcronyms(ArrayList<String> otherAcronyms) { this.otherAcronyms = otherAcronyms; }
    @SerializedName("otherNames")
    @Expose
    private ArrayList<String> otherNames;

    public ArrayList<String> getOtherNames() { return this.otherNames; }

    public void setOtherNames(ArrayList<String> otherNames) { this.otherNames = otherNames; }
}

