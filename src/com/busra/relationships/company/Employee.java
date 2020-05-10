package com.busra.relationships.company;

public abstract class Employee {
    private String m_name;
    private String m_surname;
    private String m_citizenID;

    public Employee (String name, String surname, String citizenID){
        m_name = name ;
        m_surname = surname;
        m_citizenID = citizenID;

    }

    public String getName() {
        return m_name;
    }

    public void setName(String m_name) {
        this.m_name = m_name;
    }

    public String getSurname() {
        return m_surname;
    }

    public void setSurname(String m_surname) {
        this.m_surname = m_surname;
    }

    public String getCitizenID() {
        return m_citizenID;
    }

    public void setCitizenID(String m_citizenID) {
        this.m_citizenID = m_citizenID;
    }

    public abstract double calculateInsurance();

}
