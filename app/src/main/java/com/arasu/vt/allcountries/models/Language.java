package com.arasu.vt.allcountries.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kyros on 07-11-2017.
 */

public class Language{
    @SerializedName("iso639_1")
    @Expose
    private String iso639_1;

    public String getIso6391() { return this.iso639_1; }

    public void setIso6391(String iso639_1) { this.iso639_1 = iso639_1; }
    @SerializedName("iso639_2")
    @Expose
    private String iso639_2;

    public String getIso6392() { return this.iso639_2; }

    public void setIso6392(String iso639_2) { this.iso639_2 = iso639_2; }
    @SerializedName("name")
    @Expose
    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }
    @SerializedName("nativeName")
    @Expose
    private String nativeName;

    public String getNativeName() { return this.nativeName; }

    public void setNativeName(String nativeName) { this.nativeName = nativeName; }
}
