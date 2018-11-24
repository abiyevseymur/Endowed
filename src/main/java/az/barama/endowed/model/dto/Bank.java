package az.barama.endowed.model.dto;

import java.math.BigDecimal;

public class Bank {

    private int customerId;

    private BigDecimal interestRate;

    private BigDecimal amount;

<<<<<<< HEAD
    public Bank() {
    }

    public Bank(String customerId, BigDecimal interestRate, BigDecimal amount) {
=======
    public Bank(int customerId, BigDecimal interestRate, BigDecimal amount) {
>>>>>>> 023b369feb4e660af448062d1571c81ace09e276
        this.customerId = customerId;
        this.interestRate = interestRate;
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
