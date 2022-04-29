package pro.skyjavanamig.skyprocalculatornamig;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculatorImpl implements ServiceCalculator {

    @Override
    public int sum (int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus (int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply (int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2){
        return num1 / num2;
    }
}
