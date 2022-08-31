package com.bootcamp.uber;

import java.util.List;

public class Trip {
    private User user;
    private String status;
    private List<Address> waypoints;
    private String beginTripTime;
    private String dropOffTime;
    private boolean isDiscounted;
    private Driver driver;
    private String vehicleType;
    private String fare;

    public Trip(User user, String status, List<Address> waypoints, String beginTripTime, String dropOffTime, boolean isDiscounted, Driver driver, String vehicleType, String fare) {
        this.user = user;
        this.status = status;
        this.waypoints = waypoints;
        this.beginTripTime = beginTripTime;
        this.dropOffTime = dropOffTime;
        this.isDiscounted = isDiscounted;
        this.driver = driver;
        this.vehicleType = vehicleType;
        this.fare = fare;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Address> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<Address> waypoints) {
        this.waypoints = waypoints;
    }

    public String getBeginTripTime() {
        return beginTripTime;
    }

    public void setBeginTripTime(String beginTripTime) {
        this.beginTripTime = beginTripTime;
    }

    public String getDropOffTime() {
        return dropOffTime;
    }

    public void setDropOffTime(String dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public boolean isDiscounted() {
        return isDiscounted;
    }

    public void setDiscounted(boolean discounted) {
        isDiscounted = discounted;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }
}


