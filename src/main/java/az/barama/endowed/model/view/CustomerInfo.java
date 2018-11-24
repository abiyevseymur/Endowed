package az.barama.endowed.model.view;

public class CustomerInfo {

    public String customerId;

    public String bank;

    public String cartNumber;

    public CustomerInfo(String customerId, String bank, String cartNumber) {
        this.customerId = customerId;
        this.bank = bank;
        this.cartNumber = cartNumber;
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
