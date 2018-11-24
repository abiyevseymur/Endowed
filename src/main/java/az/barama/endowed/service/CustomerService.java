package az.barama.endowed.service;

import az.barama.endowed.client.pashabank.BankClient;
import az.barama.endowed.model.dto.Bank;
import az.barama.endowed.model.view.CustomerInfo;
import org.springframework.stereotype.Service;

@Service
public class JavanService {

    private BankClient bankClient;

    public JavanService(BankClient pashaBankClient) {
        this.bankClient = pashaBankClient;
    }

    public Bank getInterestRate(CustomerInfo customerInfo){
// we have only 2 banks for test version.
        if(customerInfo.getBank().equals("PashaBank")){
            return this.bankClient.getCustomerInfo(customerInfo.getCustomerId());
        }
        else if (customerInfo.getBank().equals("KapitalBank")){
            return this.bankClient.getCustomerInfo(customerInfo.getCustomerId());
        }
        else {
            // Seymur has to check this.
            return null;
        }

    }


}
