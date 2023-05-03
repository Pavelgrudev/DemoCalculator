package pro.sky.testmav2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.testmav2.Service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String Hello() {
        return calculatorService.Hello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("Num1") int a, @RequestParam("Num2") int b) {
        return a + "+" + b + "=" + calculatorService.plus(a, b);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("Num1") int a, @RequestParam("Num2") int b) {
        return a + "-" + b + "=" + calculatorService.minus(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("Num1") int a, @RequestParam("Num2") int b) {
        return a + "*" + b + "=" + calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("Num1") int a, @RequestParam("Num2") int b) {
        if (b == 0) {
            return "На ноль делить нельзя";
        } else {
            return a + "/" + b + "=" + calculatorService.divide(a, b);
        }


        //localhost:8080/calculator/plus?Num1=5&Num2=5
    }
}
