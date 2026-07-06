package bai09;

public class Chef extends Employee {
    
    private int numberOfDishes;
    private double coefficientsBonusPerDishes;
    
    public Chef(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving, int hourOfOvertime, double bonusSalaryPerHourOfOvertime, int numberOfDishes, double coefficientsBonusPerDishes) {
        super(id, name, hourOfTimeserving, salaryPerHourOfTimeserving, hourOfOvertime, bonusSalaryPerHourOfOvertime);
        this.numberOfDishes = numberOfDishes;
        this.coefficientsBonusPerDishes = coefficientsBonusPerDishes;
    }

    public int getNumberOfDishes() {
        return numberOfDishes;
    }

    public void setNumberOfDishes(int numberOfDishes) {
        this.numberOfDishes = numberOfDishes;
    }

    public double getCoefficientsBonusPerDishes() {
        return coefficientsBonusPerDishes;
    }

    public void setCoefficientsBonusPerDishes(double coefficientsBonusPerDishes) {
        this.coefficientsBonusPerDishes = coefficientsBonusPerDishes;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + super.calculateActualSalary() * numberOfDishes * coefficientsBonusPerDishes;
    }

    @Override
    public String toString() {
        return String.format("Chef [id=%s, name=%s, hourOfTimeserving=%d, salaryPerHourOfTimeserving=%f, hourOfOvertime=%d, bonusSalaryPerHourOfOvertime=%f, numberOfDishes=%d, coefficientsBonusPerDishes=%f] => Actual salary: %f",
            getId(), getName(), getHourOfTimeserving(), getSalaryPerHourOfTimeserving(), getHourOfOvertime(), 
            getBonusSalaryPerHourOfOvertime(), this.numberOfDishes, this.coefficientsBonusPerDishes, 
            calculateActualSalary()
        );
    }
}