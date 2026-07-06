package bai10;

public class CreCardPayment extends PaymentMethod {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    
    public CreCardPayment(String transactionId, double amount, String cardNumber, String cardHolderName, String expiryDate) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.printf("You have selected the payment method by credit card, the details are as follows:\nTransaction id: %s\nAmount: %f\nCard number: %s\nCard holder name: %s\nExpiry date: %s", 
            getTransactionId(), getAmount(), this.cardNumber, this.cardHolderName, this.expiryDate
        );
    }
}