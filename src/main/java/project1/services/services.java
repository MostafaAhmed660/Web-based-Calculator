package project1.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import project1.objects.calculator;


@Service
public class services {

    public String getResult(calculator x) {
        String operation = x.getOperation();
        switch (operation){
            case "+":
                return String.valueOf(x.getFirstNum() + x.getSecondNum());

            case "-":
            // this for Double subtraction precision issue
                return String.valueOf(BigDecimal.valueOf(x.getFirstNum()).subtract(BigDecimal.valueOf(x.getSecondNum())));

            case "*":
            // this for Double multiplication precision issue
                return String.valueOf(BigDecimal.valueOf(x.getFirstNum()).multiply(BigDecimal.valueOf(x.getSecondNum())));

            case "/":
                if (x.getSecondNum() == 0)
                    return "E";
            return String.valueOf(x.getFirstNum() / x.getSecondNum());

            case "%":
                return String.valueOf(x.getFirstNum()%x.getSecondNum());

            default:
                return "E";
        }
    }
}

