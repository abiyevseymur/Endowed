package az.barama.endowed.controller;

import az.barama.endowed.model.view.CustomerInfo;
import az.barama.endowed.service.JavanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavanController {

    JavanService javanService;

    public JavanController(JavanService javanService) {
    this.javanService = javanService;
    }

    @GetMapping("/get-interest=rate")
    public void getInterestRate(
            @RequestBody CustomerInfo customerInfo
            ){
        javanService.getInterestRate(customerInfo);
    }
}
