package bai3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int salary;
    private double coefficientsSalary;

    public Employee(String id, String firstName, String middleName, String lastName, int age, int salary, int coefficientsSalary){
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary*this.coefficientsSalary;
    }
    public double getCoefficientsSalary(){
        return this.coefficientsSalary;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAge(String dob){
        try {
            // int birthYear = Integer.parseInt(dob.substring(dob.length() - 4));
            // int currentYear = LocalDate.now().getYear();
            // this.age = currentYear - birthYear;

            String pattern = "dd/MM/yyyy";
            // 1. Define the expected date format (e.g., "dd/MM/yyyy")
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            // 2. Parse the input date string into a LocalDate object
            LocalDate birthDate = LocalDate.parse(dob, formatter);
            // 3. Get the current date
            LocalDate currentDate = LocalDate.now();
            // 4. Calculate student age
            this.age = Period.between(birthDate, currentDate).getYears();
        } catch (Exception e) {
            System.out.println("Lỗi: Định dạng chuỗi ngày sinh (dob)...");
            throw new RuntimeException(e);
        }
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }
    public String getInfo() {
        return "Employee [id=" + id +
                ", firstName=" + firstName +
                ", middleName=" + middleName +
                ", lastName=" + lastName +
                ", age=" + age +
                ", salary=" + salary +
                ", coefficientsSalary=" + coefficientsSalary + "]";
    }
}
