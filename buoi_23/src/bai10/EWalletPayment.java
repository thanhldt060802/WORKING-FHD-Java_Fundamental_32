package bai10;

public class EWalletPayment extends PaymentMethod {
    
    private String walletId;
    private String walletProvider;

    public EWalletPayment(String transactionId, double amount, String walletId, String walletProvider) {
        super(transactionId, amount);
        this.walletId = walletId;
        this.walletProvider = walletProvider;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getWalletProvider() {
        return walletProvider;
    }

    public void setWalletProvider(String walletProvider) {
        this.walletProvider = walletProvider;
    }

    @Override
    public void processPayment() {
        System.out.printf("You have selected the payment method by e-wallet, the details are as follows:\nTransaction id: %s\nAmount: %f\nWallet id: %s\nWallet provider: %s",
            getTransactionId(), getAmount(), this.walletId, this.walletProvider
        );
    }
}
