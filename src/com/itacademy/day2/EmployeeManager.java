package com.itacademy.day2;

import java.time.LocalDate;

public class EmployeeManager {
    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println("asdasdsa");
        System.out.println("asdsadsadsaa");
        employee.setContractStartDate(LocalDate.now());
        employee.setPosition("Developer");
        employee.setContractType(ContractType.FULL_TIME);
        employee.setSalary(2000);

        System.out.println(employee.toString());

    }
}
