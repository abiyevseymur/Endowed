package az.barama.endowed.service;

import az.barama.endowed.client.pashabank.PashaBankClient;
import az.barama.endowed.model.dto.PashaBank;
import az.barama.endowed.model.view.CustomerInfo;
import org.springframework.stereotype.Service;

@Service
public class JavanService {

    private PashaBankClient pashaBankClient;

    public JavanService(PashaBankClient pashaBankClient) {
        this.pashaBankClient = pashaBankClient;
    }

    public PashaBank getInterestRate(CustomerInfo customerInfo){

        if(customerInfo.bank.equals("pashabank")){
            return this.pashaBankClient.getCustomerInfo(customerInfo.getCustomerId());
        }
        else{
            return null;
        }
    }


}
