package bai12;

import java.util.ArrayList;

public class ATM extends ArrayList<Account> implements AccountManagement, ATMFunction {
    
    private Account inUsing;

    public ATM() {
        this.add(new Account("123456A", "12345678", 200000));
        this.add(new Account("123456B", "12345678", 200000));
        this.add(new Account("123456C", "12345678", 200000));
    }

    @Override
    public void login(String id, String pin) {
        Account exitedAccount = searchAccountById(id);

        if (exitedAccount == null) {
            System.out.println("dang nhap that bai");
            return;
        }

        if (!exitedAccount.getPin().equals(pin)) {
            System.out.println("dang nhap that bai");
            return;
        }
            
        inUsing = exitedAccount;
        System.out.println("dang nhap thanh cong tai khoan: " + exitedAccount.getId());
    }

    @Override
    public void recharge(int money) {
        if (inUsing == null) {
            System.out.println("nap that bai");
            return;
        }
        
        inUsing.setBalance(inUsing.getBalance() + money);
        System.out.println("nap thanh cong cho: " + inUsing.getId());
    }

    @Override
    public void withdraw(int money) {
        if (inUsing == null) {
            System.out.println("rut that bai");
            return;
        }

        int remainingMoney = inUsing.getBalance() - money;
        if (remainingMoney < 0) {
            System.out.println("rut tien that bai");
            return;
        }

        inUsing.setBalance(remainingMoney);
        System.out.println("rut tien thanh cong cho: " + inUsing.getId());
    }

    public void transfer(String id, int money) {
        if (inUsing == null) {
            System.out.println("chuyen tien that bai");
            return;
        }

        Account acc = searchAccountById(id);
        if (acc == null || acc == inUsing) {
            System.out.println("chuyen tien that bai");
            return;
        }

        int remainingMoney = inUsing.getBalance() - money;
        if (remainingMoney < 0) {
            System.out.println("chuyen tien that bai");
            return;
        }

        inUsing.setBalance(remainingMoney);
        acc.setBalance(acc.getBalance() + money);
        System.out.println("chuyen tien thanh cong tu " + inUsing.getId() + " sang " + acc.getId());
    }

    @Override
    public void logout() {
        if (inUsing == null) {
            System.out.println("dang xuat that bai");
            return;
        }

        inUsing = null;
        System.out.println("dang xuat thanh cong");
    }

    @Override
    public void showAllAccounts() {
        for (Account acc: this)
            System.out.println(acc);
    }

    @Override
    public Account searchAccountById(String id) {
        for (Account acc: this)
            if (acc.getId().equals(id))
                return acc;

        return null;
    }

    @Override
    public void addAccount(Account acc) {
        Account exitedAccount = searchAccountById(acc.getId());

        if (exitedAccount != null)
            return;

        this.add(acc);
    }

    @Override
    public void updateAccount(Account acc) {
        Account exitedAccount = searchAccountById(acc.getId());

        if (exitedAccount == null)
            return;

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(exitedAccount)) {
                this.set(i, acc);
                return;
            }
        }
    }

    @Override
    public void removeAccountById(String id) {
        Account exitedAccount = searchAccountById(id);

        if (exitedAccount == null)
            return;

        this.remove(exitedAccount);
    }
}