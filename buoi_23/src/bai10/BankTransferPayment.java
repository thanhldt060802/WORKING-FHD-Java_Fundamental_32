package bai10;

public class BankTransferPayment extends PaymentMethod {

    private String bankAccountNumber;
    private String bankName;
    
    public BankTransferPayment(String transactionId, double amount, String bankAccountNumber, String bankName) {
        super(transactionId, amount);
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void processPayment() {
        System.out.printf("You have selected the payment method by bank transfer, the details are as follows:\nTransaction id: %s\nAmount: %f\nBank account number: %s\nBank name: %s.",
            getTransactionId(), getAmount(), this.bankAccountNumber, this.bankName
        );        
    }
}