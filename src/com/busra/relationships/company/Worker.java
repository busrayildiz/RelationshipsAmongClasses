package com.busra.relationships.company;

public class Worker extends Employee {
    private int m_hourPerDay;
    private double m_feePerHour;

    public Worker(String name, String surname, String citizenID, int m_hourPerDay, double m_feePerHour) {
        super(name, surname, citizenID);
        this.m_hourPerDay = m_hourPerDay;
        this.m_feePerHour = m_feePerHour;
    }

    public int getHourPerDay() {
        return m_hourPerDay;
    }

    public void setHourPerDay(int m_hourPerDay) {
        this.m_hourPerDay = m_hourPerDay;
    }

    public double getFeePerHour() {
        return m_feePerHour;
    }

    public void setFeePerHour(double m_feePerHour) {
        this.m_feePerHour = m_feePerHour;
    }

    @Override
    public double calculateInsurance() {
        return m_feePerHour * m_hourPerDay * 20;
    }
}
