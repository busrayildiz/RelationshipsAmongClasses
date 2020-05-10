package com.busra.relationships.vehicles;

public class Car {
    private Engine m_engine;

    public Car() {
        m_engine = new Engine();
    }

    public void brake(){
        // brake
        m_engine.slowEngine();
    }

    public void run(){
        m_engine.startEngine();
        m_engine.accelerateEngine();

        brake();

        m_engine.stopEngine();
    }
}
