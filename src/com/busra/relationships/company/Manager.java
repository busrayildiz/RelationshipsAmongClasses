package com.busra.relationships.company;

public class Manager extends Employee {
    private double m_salary;
    private String m_department;

    public Manager(String name, String surname, String citizenID, double m_salary, String m_department) {
        super(name, surname, citizenID);
        this.m_salary = m_salary;
        this.m_department = m_department;
    }

    public double getSalary() {
        return m_salary;
    }

    public void setSalary(double m_salary) {
        this.m_salary = m_salary;
    }

    public String getDepartment() {
        return m_department;
    }

    public void setDepartment(String m_department) {
        this.m_department = m_department;
    }

    @Override
    public double calculateInsurance() {
        return m_salary * 20;
    }
}
