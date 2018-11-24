package az.barama.endowed.model;

import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Id;
import java.math.BigDecimal;

=======
import java.math.BigDecimal;
>>>>>>> 023b369feb4e660af448062d1571c81ace09e276
@Entity
public class CustomerEntity {

    @Id
    private Long id;

    private String customerId;

    private BigDecimal interestRate;

    private BigDecimal amount;

    public CustomerEntity(String customerId, BigDecimal interestRate, BigDecimal amount) {
        this.customerId = customerId;
        this.interestRate = interestRate;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
