package az.barama.endowed.client.pashabank;

import az.barama.endowed.model.dto.Bank;

import java.math.BigDecimal;

public class PashaBankClient {

    public Bank getCustomerInfo(String customerId){
        return new Bank("customerId", new BigDecimal("13"), new BigDecimal(1200));
    }
}
