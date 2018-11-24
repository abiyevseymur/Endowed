package az.barama.endowed.client.pashabank;

import az.barama.endowed.model.dto.Bank;

import java.math.BigDecimal;
//test client, which is supposedly stored in database
public class BankClient {

    public Bank getCustomerInfo(int customerId){
        return new Bank(12341234, new BigDecimal("13"), new BigDecimal(1200));
    }
}
