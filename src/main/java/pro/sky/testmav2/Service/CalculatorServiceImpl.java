package pro.sky.testmav2.Service;

import org.springframework.stereotype.Service;

@Service
public class  CalculatorServiceImpl implements CalculatorService{
    @Override
    public String Hello() {
        return "Добро пожаловать в калькулятор" ;
    }

    @Override
    public int plus(int a, int b) {
        return a+b;
    }

    @Override
    public int minus(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public double divide(int a, int b) {
        return a/b ;
    }
}
