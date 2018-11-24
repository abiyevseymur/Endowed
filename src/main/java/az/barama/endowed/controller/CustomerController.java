package az.barama.endowed.controller;

import az.barama.endowed.model.view.CustomerInfo;
import az.barama.endowed.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
    }


    @GetMapping("/get-interest-rate")
    public void getInterestRate(
            @RequestBody CustomerInfo customerInfo
            ){
        customerService.getInterestRate(customerInfo);
    }
}
