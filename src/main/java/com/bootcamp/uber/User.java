package com.bootcamp.uber;

public class User extends Customer {
    private String dateOfBirth;
    private String country;
    private boolean allowMarketingEmail;
    private boolean akPartiliMi;

    public User(String name, int age, String email, String password, String dateOfBirth, String country, boolean allowMarketingEmail, boolean akPartiliMi) {
        super(name, email, password, age);
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.allowMarketingEmail = allowMarketingEmail;
        this.akPartiliMi = akPartiliMi;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isAllowMarketingEmail() {
        return allowMarketingEmail;
    }

    public void setAllowMarketingEmail(boolean allowMarketingEmail) {
        this.allowMarketingEmail = allowMarketingEmail;
    }

    public boolean isAkPartiliMi() {
        return akPartiliMi;
    }

    public void setAkPartiliMi(boolean akPartiliMi) {
        this.akPartiliMi = akPartiliMi;
    }
}
