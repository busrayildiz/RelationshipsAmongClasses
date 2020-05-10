package com.busra.relationships.taxi;

public class Driver {

    private int driverId;
    private String driverName;

    public Driver(int driverId, String driverName) {
        this.driverId = driverId;
        this.driverName = driverName;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
