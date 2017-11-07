package com.arasu.vt.allcountries.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kyros on 07-11-2017.
 */

public class Translations{
    @SerializedName("de")
    @Expose
    private String de;

    public String getDe() { return this.de; }

    public void setDe(String de) { this.de = de; }
    @SerializedName("es")
    @Expose
    private String es;

    public String getEs() { return this.es; }

    public void setEs(String es) { this.es = es; }
    @SerializedName("fr")
    @Expose
    private String fr;

    public String getFr() { return this.fr; }

    public void setFr(String fr) { this.fr = fr; }
    @SerializedName("ja")
    @Expose
    private String ja;

    public String getJa() { return this.ja; }

    public void setJa(String ja) { this.ja = ja; }
    @SerializedName("it")
    @Expose
    private String it;

    public String getIt() { return this.it; }

    public void setIt(String it) { this.it = it; }
    @SerializedName("br")
    @Expose
    private String br;

    public String getBr() { return this.br; }

    public void setBr(String br) { this.br = br; }
    @SerializedName("pt")
    @Expose
    private String pt;

    public String getPt() { return this.pt; }

    public void setPt(String pt) { this.pt = pt; }
    @SerializedName("nl")
    @Expose
    private String nl;

    public String getNl() { return this.nl; }

    public void setNl(String nl) { this.nl = nl; }
    @SerializedName("hr")
    @Expose
    private String hr;

    public String getHr() { return this.hr; }

    public void setHr(String hr) { this.hr = hr; }
    @SerializedName("fa")
    @Expose
    private String fa;

    public String getFa() { return this.fa; }

    public void setFa(String fa) { this.fa = fa; }
}
