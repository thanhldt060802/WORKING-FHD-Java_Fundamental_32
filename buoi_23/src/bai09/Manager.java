package bai09;

public class Manager extends Employee {

    private double bonusRate;
    private double kpiPoint;
    private double kpiThreshold;

    public Manager(String id, String name, int hourOfTimeserving, double salaryPerHourOfTimeserving, int hourOfOvertime, double bonusSalaryPerHourOfOvertime, double bonusRate, double kpiPoint, double kpiThreshold) {
        super(id, name, hourOfTimeserving, salaryPerHourOfTimeserving, hourOfOvertime, bonusSalaryPerHourOfOvertime);
        this.bonusRate = bonusRate;
        this.kpiPoint = kpiPoint;
        this.kpiThreshold = kpiThreshold;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    public double getKpiPoint() {
        return kpiPoint;
    }

    public void setKpiPoint(double kpiPoint) {
        this.kpiPoint = kpiPoint;
    }

    public double getKpiThreshold() {
        return kpiThreshold;
    }

    public void setKpiThreshold(double kpiThreshold) {
        this.kpiThreshold = kpiThreshold;
    }

    @Override
    public double calculateActualSalary() {
        return super.calculateActualSalary() + super.calculateActualSalary() * bonusRate * (kpiPoint / kpiThreshold);
    }

    @Override
    public String toString() {
        return String.format("Manager [id=%s, name=%s, hourOfTimeserving=%d, salaryPerHourOfTimeserving=%f, hourOfOvertime=%d, bonusSalaryPerHourOfOvertime=%f, bonusRate=%f, kpiPoint=%f, kpiThreshold=%f] => Actual salary: %f",
            getId(), getName(), getHourOfTimeserving(), getSalaryPerHourOfTimeserving(), getHourOfOvertime(), 
            getBonusSalaryPerHourOfOvertime(), this.bonusRate, this.kpiPoint, this.kpiThreshold, 
            calculateActualSalary()
        );
    }
}