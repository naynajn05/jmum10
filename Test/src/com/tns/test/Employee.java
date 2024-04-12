package com.tns.test;
class Employee {
    private static int totalEmployees = 0; // static variable to track total employees
    private final int employeeID; // final variable for employee ID
    private double salary; // instance variable for salary

    // Constructor to initialize employee ID, salary, and increment total employees
    public Employee(int employeeID, double initialSalary) {
        this.employeeID = employeeID;
        this.salary = initialSalary;
        totalEmployees++; // Increment total employees on creation
    }

    // Static method to get total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Getter method for employee ID
    public int getEmployeeID() {
        return employeeID;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        // Creating three employees
        Employee emp1 = new Employee(1001, 50000);
        Employee emp2 = new Employee(1002, 60000);
        Employee emp3 = new Employee(1003, 70000);

        // Displaying employee information
        System.out.println("Employee ID: " + emp1.getEmployeeID() + ", Salary: $" + emp1.getSalary());
        System.out.println("Employee ID: " + emp2.getEmployeeID() + ", Salary: $" + emp2.getSalary());
        System.out.println("Employee ID: " + emp3.getEmployeeID() + ", Salary: $" + emp3.getSalary());

        // Displaying total number of employees
        System.out.println("Total employees: " + Employee.getTotalEmployees());
    }
}
