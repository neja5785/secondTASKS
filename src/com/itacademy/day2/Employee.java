package com.itacademy.day2;

import java.time.LocalDate;

public class Employee {
    private String firstName;
    private String lastName;
    private ContractType contractType;
    private LocalDate contractStartDate;
    private double salary;
    private String position;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(LocalDate contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "com.itacademy.day2.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contractType=" + contractType +
                ", contractStartDate=" + contractStartDate +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
