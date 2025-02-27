package com.example.entity;

import java.util.LinkedHashMap;


public class Student {
    private  String firstName;
    private  String lastName;
    private String country;
    private String favoriteLanguage;

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    private LinkedHashMap<String,String> countryOptions;

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public  Student(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("USA","United States");
        countryOptions.put("BR","Brazil");
        countryOptions.put("JP","Japan");
        countryOptions.put("Ger","Germany");
        countryOptions.put("Fr","France");

    }
}
