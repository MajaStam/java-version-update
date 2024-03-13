package com.cydeo.TASK;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("2030454654","2939405984")),
                new Employee(101,"Ozzy","ozzy@cydeo.com", Arrays.asList("203087654","293934435984")),
                new Employee(102,"Peter","peter@cydeo.com", Arrays.asList("2543234654","293940554334"))
        );

    }
}
