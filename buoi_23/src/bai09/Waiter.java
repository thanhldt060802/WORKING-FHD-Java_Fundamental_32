package bai09;

public class Waiter extends Employee {

    private double rating;
    private double bonusSalary;

    public Waiter(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving, int hourOfOvertime, double bonusSalaryPerHourOfOvertime, double rating, double bonusSalary) {
        super(id, name, hourOfTimeserving, salaryPerHourOfTimeserving, hourOfOvertime, bonusSalaryPerHourOfOvertime);
        this.rating = rating;
        this.bonusSalary = bonusSalary;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + bonusSalary * (rating / 5);
    }

    @Override
    public String toString() {
        return String.format("Waiter [id=%s, name=%s, hourOfTimeserving=%d, salaryPerHourOfTimeserving=%f, hourOfOvertime=%d, bonusSalaryPerHourOfOvertime=%f, rating=%f, bonusSalary=%f] => Actual salary: %f",
            getId(), getName(), getHourOfTimeserving(), getSalaryPerHourOfTimeserving(), getHourOfOvertime(), 
            getBonusSalaryPerHourOfOvertime(), this.rating, this.bonusSalary, 
            calculateActualSalary()
        );
    }
}