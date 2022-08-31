package com.bootcamp.uber;

public class Driver {
    private String name;
    private String driverID;
    private String vehicleType;
    private String password;
    private String email;

    public Driver(String name, String driverID, String vehicleType, String password, String email) {
        this.name = name;
        this.driverID = driverID;
        this.vehicleType = vehicleType;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
