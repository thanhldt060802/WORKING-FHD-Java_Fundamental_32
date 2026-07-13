package bai12_01;

import java.util.ArrayList;

public class ATM extends ArrayList<Account> implements AccountManagement, ATMFunction {
    
    private Account inUsing;
    private DataFileHandling dataFileHandling;

    public ATM(DataFileHandling dataFileHandling) {
        this.dataFileHandling = dataFileHandling;
        dataFileHandling.loadData(this);
    }

    @Override
    public void login(String id, String pin) {
        Account existedAccount = searchAccountById(id);

        if (existedAccount == null) {
            System.out.println("tai khoan ko ton tai");
            return;
        }

        if (!existedAccount.getPin().equals(pin)) {
            System.out.println("dang nhap that bai");
            return;
        }
            
        inUsing = existedAccount;
        System.out.println("dang nhap thanh cong tai khoan: " + existedAccount.getId());
    }

    @Override
    public void recharge(int money) {
        if (inUsing == null) {
            System.out.println("nap that bai");
            return;
        }
        
        inUsing.setBalance(inUsing.getBalance() + money);
        dataFileHandling.saveData(this);
        System.out.println("nap thanh cong cho: " + inUsing.getId());
    }

    @Override
    public void withdraw(int money) {
        if (inUsing == null) {
            System.out.println("rut tien that bai");
            return;
        }

        int remainingMoney = inUsing.getBalance() - money;
        if (remainingMoney < 0) {
            System.out.println("rut tien that bai");
            return;
        }

        inUsing.setBalance(remainingMoney);
        dataFileHandling.saveData(this);
        System.out.println("rut tien thanh cong cho: " + inUsing.getId());
    }

    public void transfer(String id, int money) {
        if (inUsing == null) {
            System.out.println("chuyen tien that bai");
            return;
        }

        int remainingMoney = inUsing.getBalance() - money;
        if (remainingMoney < 0) {
            System.out.println("chuyen tien that bai");
            return;
        }

        Account acc = searchAccountById(id);
        if (inUsing == acc) {
            System.out.println("chuyen tien that bai");
            return;
        }

        inUsing.setBalance(remainingMoney);
        acc.setBalance(acc.getBalance() + money);
        dataFileHandling.saveData(this);
        System.out.println("chuyen tien thanh cong: " + inUsing.getId() + " --> " + acc.getId());
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
        dataFileHandling.saveData(this);
    }

    @Override
    public void updateAccount(Account acc) {
        Account exitedAccount = searchAccountById(acc.getId());

        if (exitedAccount == null)
            return;

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).equals(exitedAccount)) {
                this.set(i, acc);
                dataFileHandling.saveData(this);
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
        dataFileHandling.saveData(this);
    }
}