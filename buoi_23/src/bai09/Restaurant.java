package bai09;

import java.util.ArrayList;

public class Restaurant extends ArrayList<Employee> {
    
    public void showAllEmployees() {
        for (Employee employee: this)
            System.out.println(employee);
    }

    public Employee searchEmployeeById(String id) {
        for (Employee employee: this)
            if (employee.getId().equals(id))
                return employee;

        return null;
    }

    public void addEmployee(Employee emp) {
        Employee exitedEmployee = searchEmployeeById(emp.getId());

        if (exitedEmployee != null)
            return;

        this.add(emp);
    }

    public void updateEmployee(Employee emp) {
        Employee exitedEmployee = searchEmployeeById(emp.getId());

        if (exitedEmployee == null)
            return;

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(exitedEmployee)) { 
                this.set(i, emp);
                return;
            }
        }
    }

    public void removeEmployeeById(String id) {
        Employee exitedEmployee = searchEmployeeById(id);

        if (exitedEmployee == null)
            return;

        this.remove(exitedEmployee);
    }

    public ArrayList<Employee> searchEmployeeWithHourOfTimeservingInRange(int min, int max) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        for (Employee employee: this) 
            if (employee.getHourOfTimeserving() >= min && employee.getHourOfTimeserving() <= max) 
                employeeList.add(employee);
            
        return employeeList;
    }

    public ArrayList<Employee> searchEmployeeWithActualSalaryInRange(double min, double max) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        for (Employee employee: this) 
            if (employee.calculateActualSalary() >= min && employee.calculateActualSalary() <= max) 
                employeeList.add(employee);
            
        return employeeList;
    }

    public ArrayList<Employee> searchEmployeeWithNumericInfoInRange(INumericAccess numericAccess, double min, double max) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        for (Employee employee: this) 
            if (numericAccess.getValue(employee) >= min && numericAccess.getValue(employee) <= max) 
                employeeList.add(employee);
            
        return employeeList;
    }

    public void sortByHourOfTimeservingAscending() {
        for (int i = 0; i < this.size(); i++) {
            int min = i;

            for (int j = i + 1; j < this.size(); j++) 
                if (this.get(min).getHourOfTimeserving() > this.get(j).getHourOfTimeserving())
                    min = j;

            Employee temp = this.get(i);
            this.set(i, this.get(min));
            this.set(min, temp);
        }
    }

    public void sortByActualSalaryDescending() {
        for (int i = 0; i < this.size(); i++) {
            int max = i;

            for (int j = i + 1; j < this.size(); j++) 
                if (this.get(max).calculateActualSalary() < this.get(j).calculateActualSalary())
                    max = j;

            Employee temp = this.get(i);
            this.set(i, this.get(max));
            this.set(max, temp);
        }
    }

    public void sortByNameAscending() {
        for (int i = 0; i < this.size(); i++) {
            int min = i;

            for (int j = i + 1; j < this.size(); j++) 
                if (this.get(min).getName().compareTo(this.get(j).getName()) > 0)
                    min = j;

            Employee temp = this.get(i);
            this.set(i, this.get(min));
            this.set(min, temp);
        }
    }
}