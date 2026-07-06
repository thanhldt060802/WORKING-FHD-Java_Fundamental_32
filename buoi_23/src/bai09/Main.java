package bai09;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("1111", "duc", 8, 5.5, 1, 4.5);
        Employee e2 = new Chef("9999", "hung", 5, 3.4, 1, 2.3, 10, 1.23); // Object -> Employee -> Chef
        Employee e3 = new Waiter("3618", "kien", 7, 4.34, 5, 3.14, 4, 2.72);
        Employee e4 = new Manager("5555", "dat", 4, 7.3, 1, 2.1, 3.5, 9.14, 10);

        // Employee e5 = new Chef("5555", "linh", 6, 6, 2, 5, 12, 1.5);

        // e2.calculateActualSalary();

        Restaurant res = new Restaurant();

        res.addEmployee(e1);  
        res.addEmployee(e2);    
        res.addEmployee(e3);    
        res.addEmployee(e4);    

        res.showAllEmployees();
        System.out.println();

        // res.removeEmployeeById("1111");
        // res.showAllEmployees();

        // res.updateEmployee(e5);
        // res.showAllEmployees();
        // System.out.println();

        // System.out.println(res.searchEmployeeWithNumericInfoInRange(new NumericAccessHourOfTimeserving(), 4, 6));
        // System.out.println(res.searchEmployeeWithNumericInfoInRange(new NumericAccessActualSalary(), 100, 200));
        System.out.println(res.searchEmployeeWithNumericInfoInRange((Employee e) -> e.calculateActualSalary(), 100, 200));

        // System.out.println(res.searchEmployeeWithHourOfTimeservingInRange(4, 6));
        // System.out.println();
        // System.out.println(res.searchEmployeeWithActualSalaryInRange(30, 40));
        // System.out.println();

        // System.out.println("-- sort by hour --");
        // res.sortByHourOfTimeservingAscending();
        // res.showAllEmployees();
        // System.out.println();

        // System.out.println("-- sort by salary --");
        // res.sortByActualSalaryDescending();
        // res.showAllEmployees();
        // System.out.println();
    }
}