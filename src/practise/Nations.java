package practise;

import java.util.ArrayList;

public class Nations {
    private String name;
    private String nativeName;
    private ArrayList<String> topLevelDomain;
    private String alpha2Code;
    private String numericCode;
    private String alpha3Code;
    private ArrayList<String> currencies;
    private ArrayList<String> callingCodes;
    private String capital;
    private ArrayList<String> altSpellings;
    private String relevance;
    private String region;
    private String subregion;
    private ArrayList<String> language;
    private ArrayList<String> languages;
    private Translations translations;
    private int population;
    private ArrayList<Integer> latlng;
    private String demonym;
    private ArrayList<String> borders;
    private int area;
    private ArrayList<String> timezones;
    private double gini;

    public Nations() {
    }

    public Nations(String name, String nativeName, ArrayList<String> topLevelDomain, String alpha2Code, String numericCode, String alpha3Code, ArrayList<String> currencies, ArrayList<String> callingCodes, String capital, ArrayList<String> altSpellings, String relevance, String region, String subregion, ArrayList<String> language, ArrayList<String> languages, Translations translations, int population, ArrayList<Integer> latlng, String demonym, ArrayList<String> borders, int area, ArrayList<String> timezones, double gini) {
        this.name = name;
        this.nativeName = nativeName;
        this.topLevelDomain = topLevelDomain;
        this.alpha2Code = alpha2Code;
        this.numericCode = numericCode;
        this.alpha3Code = alpha3Code;
        this.currencies = currencies;
        this.callingCodes = callingCodes;
        this.capital = capital;
        this.altSpellings = altSpellings;
        this.relevance = relevance;
        this.region = region;
        this.subregion = subregion;
        this.language = language;
        this.languages = languages;
        this.translations = translations;
        this.population = population;
        this.latlng = latlng;
        this.demonym = demonym;
        this.borders = borders;
        this.area = area;
        this.timezones = timezones;
        this.gini = gini;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public ArrayList<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(ArrayList<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public ArrayList<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(ArrayList<String> currencies) {
        this.currencies = currencies;
    }

    public ArrayList<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(ArrayList<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ArrayList<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(ArrayList<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public ArrayList<String> getLanguage() {
        return language;
    }

    public void setLanguage(ArrayList<String> language) {
        this.language = language;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public ArrayList<Integer> getLatlng() {
        return latlng;
    }

    public void setLatlng(ArrayList<Integer> latlng) {
        this.latlng = latlng;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public ArrayList<String> getBorders() {
        return borders;
    }

    public void setBorders(ArrayList<String> borders) {
        this.borders = borders;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public ArrayList<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(ArrayList<String> timezones) {
        this.timezones = timezones;
    }

    public double getGini() {
        return gini;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    @Override
    public String toString() {
        return "Nations{" +
                "name='" + name + '\'' +
                ", nativeName='" + nativeName + '\'' +
                ", topLevelDomain=" + topLevelDomain +
                ", alpha2Code='" + alpha2Code + '\'' +
                ", numericCode='" + numericCode + '\'' +
                ", alpha3Code='" + alpha3Code + '\'' +
                ", currencies=" + currencies +
                ", callingCodes=" + callingCodes +
                ", capital='" + capital + '\'' +
                ", altSpellings=" + altSpellings +
                ", relevance='" + relevance + '\'' +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", language=" + language +
                ", languages=" + languages +
                ", translations=" + translations +
                ", population=" + population +
                ", latlng=" + latlng +
                ", demonym='" + demonym + '\'' +
                ", borders=" + borders +
                ", area=" + area +
                ", timezones=" + timezones +
                ", gini=" + gini +
                '}';
    }
}