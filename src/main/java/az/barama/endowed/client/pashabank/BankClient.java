package az.barama.endowed.client.pashabank;

import az.barama.endowed.model.dto.Bank;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BankClient {

    public Bank getCustomerInfo(String customerId) {
        return new Bank("Bank", new BigDecimal("13"), new BigDecimal(1200));
    }
}
