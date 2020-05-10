package com.busra.relationships.taxi;

public class Taxi {

    private Driver m_driver;

    public Taxi(Driver driver){
        m_driver = driver;
    }

    public Driver getDriver() {
        return m_driver;
    }

    public void setDriver(Driver m_driver) {
        this.m_driver = m_driver;
    }

    public void take (Client client){
        /*
        ...
        ...
         */
    }
}
