package az.barama.endowed.model.view;

public class CustomerInfo {

<<<<<<< HEAD
    private String customerId;

    private String bank;

    private String cartNumber;
=======
    private int customerId;

    private String bank;

    private String cardNumber;
>>>>>>> 023b369feb4e660af448062d1571c81ace09e276

    public CustomerInfo(int customerId, String bank, String cardNumber) {
        this.customerId = customerId;
        this.bank = bank;
        this.cardNumber = cardNumber;
    }

<<<<<<< HEAD
    public CustomerInfo() {
    }

    public String getCustomerId() {
=======
    public int getCustomerId() {
>>>>>>> 023b369feb4e660af448062d1571c81ace09e276
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
