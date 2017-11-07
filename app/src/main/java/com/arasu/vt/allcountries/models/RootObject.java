package com.arasu.vt.allcountries.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by kyros on 07-11-2017.
 */

public class RootObject{
    @SerializedName("name")
    @Expose
    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }
    @SerializedName("topLevelDomain")
    @Expose
    private ArrayList<String> topLevelDomain;

    public ArrayList<String> getTopLevelDomain() { return this.topLevelDomain; }

    public void setTopLevelDomain(ArrayList<String> topLevelDomain) { this.topLevelDomain = topLevelDomain; }
    @SerializedName("alpha2Code")
    @Expose
    private String alpha2Code;

    public String getAlpha2Code() { return this.alpha2Code; }

    public void setAlpha2Code(String alpha2Code) { this.alpha2Code = alpha2Code; }
    @SerializedName("alpha3Code")
    @Expose
    private String alpha3Code;

    public String getAlpha3Code() { return this.alpha3Code; }

    public void setAlpha3Code(String alpha3Code) { this.alpha3Code = alpha3Code; }
    @SerializedName("callingCodes")
    @Expose
    private ArrayList<String> callingCodes;

    public ArrayList<String> getCallingCodes() { return this.callingCodes; }

    public void setCallingCodes(ArrayList<String> callingCodes) { this.callingCodes = callingCodes; }
    @SerializedName("capital")
    @Expose
    private String capital;

    public String getCapital() { return this.capital; }

    public void setCapital(String capital) { this.capital = capital; }
    @SerializedName("altSpellings")
    @Expose
    private ArrayList<String> altSpellings;

    public ArrayList<String> getAltSpellings() { return this.altSpellings; }

    public void setAltSpellings(ArrayList<String> altSpellings) { this.altSpellings = altSpellings; }
    @SerializedName("region")
    @Expose
    private String region;

    public String getRegion() { return this.region; }

    public void setRegion(String region) { this.region = region; }
    @SerializedName("subregion")
    @Expose
    private String subregion;

    public String getSubregion() { return this.subregion; }

    public void setSubregion(String subregion) { this.subregion = subregion; }
    @SerializedName("population")
    @Expose
    private int population;

    public int getPopulation() { return this.population; }

    public void setPopulation(int population) { this.population = population; }
    @SerializedName("latlng")
    @Expose
    private ArrayList<Double> latlng;

    public ArrayList<Double> getLatlng() { return this.latlng; }

    public void setLatlng(ArrayList<Double> latlng) { this.latlng = latlng; }
    @SerializedName("demonym")
    @Expose
    private String demonym;

    public String getDemonym() { return this.demonym; }

    public void setDemonym(String demonym) { this.demonym = demonym; }
    @SerializedName("area")
    @Expose
    private Double area;

    public Double getArea() { return this.area; }

    public void setArea(Double area) { this.area = area; }
    @SerializedName("gini")
    @Expose
    private Double gini;

    public Double getGini() { return this.gini; }

    public void setGini(Double gini) { this.gini = gini; }
    @SerializedName("timezones")
    @Expose
    private ArrayList<String> timezones;

    public ArrayList<String> getTimezones() { return this.timezones; }

    public void setTimezones(ArrayList<String> timezones) { this.timezones = timezones; }
    @SerializedName("borders")
    @Expose
    private ArrayList<String> borders;

    public ArrayList<String> getBorders() { return this.borders; }

    public void setBorders(ArrayList<String> borders) { this.borders = borders; }
    @SerializedName("nativeName")
    @Expose
    private String nativeName;

    public String getNativeName() { return this.nativeName; }

    public void setNativeName(String nativeName) { this.nativeName = nativeName; }
    @SerializedName("numericCode")
    @Expose
    private String numericCode;

    public String getNumericCode() { return this.numericCode; }

    public void setNumericCode(String numericCode) { this.numericCode = numericCode; }
    @SerializedName("currencies")
    @Expose
    private ArrayList<Currency> currencies;

    public ArrayList<Currency> getCurrencies() { return this.currencies; }

    public void setCurrencies(ArrayList<Currency> currencies) { this.currencies = currencies; }
    @SerializedName("languages")
    @Expose
    private ArrayList<Language> languages;

    public ArrayList<Language> getLanguages() { return this.languages; }

    public void setLanguages(ArrayList<Language> languages) { this.languages = languages; }
    @SerializedName("translations")
    @Expose
    private Translations translations;

    public Translations getTranslations() { return this.translations; }

    public void setTranslations(Translations translations) { this.translations = translations; }
    @SerializedName("flag")
    @Expose
    private String flag;

    public String getFlag() { return this.flag; }

    public void setFlag(String flag) { this.flag = flag; }
    @SerializedName("regionalBlocs")
    @Expose
    private ArrayList<RegionalBloc> regionalBlocs;

    public ArrayList<RegionalBloc> getRegionalBlocs() { return this.regionalBlocs; }

    public void setRegionalBlocs(ArrayList<RegionalBloc> regionalBlocs) { this.regionalBlocs = regionalBlocs; }
    @SerializedName("cioc")
    @Expose
    private String cioc;

    public String getCioc() { return this.cioc; }

    public void setCioc(String cioc) { this.cioc = cioc; }
}