package az.barama.endowed.controller;

import az.barama.endowed.model.dto.Bank;
import az.barama.endowed.model.view.CustomerInfo;
import az.barama.endowed.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/get_interest_rate")
    public Bank getInterestRate(@RequestBody CustomerInfo customerInfo) {
        return customerService.getInterestRate(customerInfo);
    }

}