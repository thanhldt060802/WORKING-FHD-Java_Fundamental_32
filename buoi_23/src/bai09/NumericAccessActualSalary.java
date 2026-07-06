package bai09;

public class NumericAccessActualSalary implements INumericAccess {

    @Override
    public double getValue(Employee emp) {
        return emp.calculateActualSalary();
    }

}
