package az.barama.endowed.service;

import az.barama.endowed.client.pashabank.BankClient;
import az.barama.endowed.model.dto.Bank;
import az.barama.endowed.model.view.CustomerInfo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private BankClient bankClient;

    public CustomerService(BankClient bankClient) {
        this.bankClient = bankClient;
    }

    public Bank getInterestRate(CustomerInfo customerInfo){
// we have only 2 banks for test version.
        if(customerInfo.getBank().equals("Bank")){
            return bankClient.getCustomerInfo(customerInfo.getCustomerId());
        }
        else if (customerInfo.getBank().equals("KapitalBank")){
            return bankClient.getCustomerInfo(customerInfo.getCustomerId());
        }
        else {
            // Seymur has to check this.
            return null;
        }

    }


}
