package project1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//  import org.springframework.web.servlet.ModelAndView;
import project1.objects.calculator;
import project1.services.services;

@RestController
public class CalculatorController {

    @Autowired
    private services s;

    @PostMapping("/getresult")
    public String post(@RequestBody calculator x){
        return s.getResult(x);
    }
}
