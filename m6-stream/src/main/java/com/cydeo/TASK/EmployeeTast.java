package com.cydeo.TASK;

public class EmployeeTast {
    public static void main(String[] args) {


        System.out.println("Print all emails");
        EmployeeData.readAll()
                //.map(employee -> employee.getEmpEmail())
                .map(Employee :: getEmpEmail)
                .forEach(System.out :: println);

        System.out.println("Print all phone numbers");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);





    }
}
