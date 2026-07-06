package bai10;

public class CashPayment extends PaymentMethod {

    public CashPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public void processPayment() {
        System.out.printf("You have selected the payment method by cash, the details are as follows:\nTransaction id: %s\nAmount: %f",
           getTransactionId() , getAmount()
        );
    }
}