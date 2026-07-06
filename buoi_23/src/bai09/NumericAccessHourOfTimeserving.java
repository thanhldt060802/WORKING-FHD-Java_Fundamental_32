package bai09;

public class NumericAccessHourOfTimeserving implements INumericAccess {

    @Override
    public double getValue(Employee emp) {
        return emp.getHourOfTimeserving();
    }

}
