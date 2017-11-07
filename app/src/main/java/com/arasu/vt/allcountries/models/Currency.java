package com.arasu.vt.allcountries.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kyros on 07-11-2017.
 */

public class Currency{

    @SerializedName("code")
    @Expose
    private String code;

    public String getCode() { return this.code; }

    public void setCode(String code) { this.code = code; }
    @SerializedName("name")
    @Expose
    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }
    @SerializedName("symbol")
    @Expose
    private String symbol;

    public String getSymbol() { return this.symbol; }

    public void setSymbol(String symbol) { this.symbol = symbol; }
}

