package com.bootcamp.uber;

import java.util.List;

public class TripDTO {
    private String name;
    private String status;
    private List<Address> waypoints;
    private String beginTripTime;
    private String dropOffTime;
    private boolean isDiscounted;
    private String driverID;
    private String vehicleType;
    private String fare;

    public TripDTO(Trip trip) {
        name = trip.getUser().getName();
        status = trip.getStatus();
        waypoints = trip.getWaypoints();
        beginTripTime = trip.getBeginTripTime();
        dropOffTime = trip.getDropOffTime();
        isDiscounted = trip.isDiscounted();
        driverID = trip.getDriver().getDriverID();
        vehicleType = trip.getVehicleType();
        fare = trip.getFare();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }
}
