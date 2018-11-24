package az.barama.endowed.client.pashabank;

import az.barama.endowed.model.dto.PashaBank;

import java.math.BigDecimal;

public class PashaBankClient {

    public PashaBank getCustomerInfo(String customerId){
        return new PashaBank("customerId", new BigDecimal("13"), new BigDecimal(1200));
    }
}
