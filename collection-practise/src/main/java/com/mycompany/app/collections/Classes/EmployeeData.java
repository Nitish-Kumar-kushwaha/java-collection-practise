package com.mycompany.app.collections.Classes;

import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return List.of(
            new Employee(101, "Nitish", "IT", 85000, true),
            new Employee(102, "Ravi", "HR", 50000, true),
            new Employee(103, "Priya", "Finance", 75000, false),
            new Employee(104, "Kiran", "IT", 95000, true),
            new Employee(105, "Amit", "HR", 48000, false),
            new Employee(106, "Sneha", "Finance", 88000, true)
        );
    }
}