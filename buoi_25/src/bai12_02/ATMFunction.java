package bai12_02;

public interface ATMFunction {
    
    public abstract void login(String id, String pin);
    
    public abstract void recharge(int money);
    
    public abstract void withdraw(int money);
    
    public abstract void transfer(String id, int money);
    
    public abstract void logout();

}
