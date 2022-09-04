package com.bootcamp.uber;

public class Customer {
    private String name;
    private String email;
    private String password;

    private int age;

    public Customer(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
