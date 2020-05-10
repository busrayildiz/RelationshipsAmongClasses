package com.busra.relationships.company;

public class HumanResources {

    public void payInsurance(Employee e){

        System.out.printf("Citizen ID:%s%n", e.getCitizenID());

        System.out.printf("Name:%s%nSurname:%s%n ", e.getName(), e.getSurname());

        System.out.printf("Payment:%f%n", e.calculateInsurance());
    }
}
