package com.busra.relationships.company;

public class SalesManager extends Manager {
    private double m_extra;

    public SalesManager(String name, String surname, String citizenID, double m_salary, String m_department, double m_extra) {
        super(name, surname, citizenID, m_salary, m_department);
        this.m_extra = m_extra;
    }

    public double getExtra() {
        return m_extra;
    }

    public void setExtra(double m_extra) {
        this.m_extra = m_extra;
    }


    @Override
    public double calculateInsurance() {
        return getSalary() * 30 + m_extra;
    }
}
