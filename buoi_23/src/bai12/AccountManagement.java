package bai12;

public interface AccountManagement {
    
    public abstract void showAllAccounts();
    public abstract void addAccount(Account acc);
    public abstract void updateAccount(Account acc);
    public abstract void removeAccountById(String id);
    public abstract Account searchAccountById(String id);

}