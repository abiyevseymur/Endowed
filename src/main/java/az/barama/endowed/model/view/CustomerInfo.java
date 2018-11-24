package az.barama.endowed.model.view;

public class CustomerInfo {

    private String customerId;

    private String bank;

    private String cartNumber;

    public CustomerInfo(String customerId, String bank, String cartNumber) {
        this.customerId = customerId;
        this.bank = bank;
        this.cartNumber = cartNumber;
    }

    public CustomerInfo() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }
}
