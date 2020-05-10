package com.busra.relationships.vehicles;

public class Ship {
    private Engine m_engine;

    public Ship (){
        m_engine = new Engine();

    }

    private void startEngine(){
        // start
    }

    private void accelerateEngine(){
        // accelerate
    }

    private void slowEngine(){
        // slow
    }

    private void stopEngine(){
        // stop
    }

    public void swim(){
        startEngine();
        accelerateEngine();
        slowEngine();
        stopEngine();
    }


}
