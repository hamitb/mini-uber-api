package com.bootcamp.uber;

public class User {
    private String name;
    private int age;
    private String email;
    private String password;
    private String dateOfBirth;
    private String country;
    private boolean allowMarketingEmail;
    private boolean akPartiliMi;

    public User(String name, int age, String email, String password, String dateOfBirth, String country, boolean allowMarketingEmail, boolean akPartiliMi) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.allowMarketingEmail = allowMarketingEmail;
        this.akPartiliMi = akPartiliMi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
