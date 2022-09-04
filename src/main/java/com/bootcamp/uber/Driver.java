package com.bootcamp.uber;

public class Driver extends Customer {
    private String driverID;
    private String vehicleType;

    public Driver(String name, String driverID, String vehicleType, String password, String email, int age) {
        super(name, email, password, age);
        this.driverID = driverID;
        this.vehicleType = vehicleType;
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
}
