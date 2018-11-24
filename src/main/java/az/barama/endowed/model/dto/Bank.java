package az.barama.endowed.model.dto;

import java.math.BigDecimal;

public class PashaBank {

    private String customerId;

    private BigDecimal interestRate;

    private BigDecimal amount;

    public PashaBank(String customerId, BigDecimal interestRate, BigDecimal amount) {
        this.customerId = customerId;
        this.interestRate = interestRate;
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
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
