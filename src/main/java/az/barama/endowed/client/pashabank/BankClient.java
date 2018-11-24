package az.barama.endowed.client.pashabank;

import az.barama.endowed.model.dto.Bank;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
//test client, which is supposedly stored in database
public class BankClient {

<<<<<<< HEAD
@Component
public class BankClient {

    public Bank getCustomerInfo(String customerId) {
        return new Bank("Bank", new BigDecimal("13"), new BigDecimal(1200));
=======
    public Bank getCustomerInfo(int customerId){
        return new Bank(12341234, new BigDecimal("13"), new BigDecimal(1200));
>>>>>>> 023b369feb4e660af448062d1571c81ace09e276
    }
}
