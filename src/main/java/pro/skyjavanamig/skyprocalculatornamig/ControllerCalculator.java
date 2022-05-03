package pro.skyjavanamig.skyprocalculatornamig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculator {

    private final ServiceCalculator serviceCalculator;

    public ControllerCalculator(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping
    public String hello() {
        return "<b>Привет!</b>";
    }

    @GetMapping(path = "/calculator")
    public String answerHello() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping("/plus")
    public String numSum(@RequestParam int num1, @RequestParam int num2) {
        int result = serviceCalculator.sum(num1, num2);
        return massageInBrowser(num1, num2, '+', result);
    }

    @GetMapping("/minus")
    public String numMinus(@RequestParam int num1, @RequestParam int num2) {
        int result = serviceCalculator.minus(num1, num2);
        return massageInBrowser(num1, num2, '-', result);
    }

    @GetMapping("/multiply")
    public String numMultiply(@RequestParam int num1, @RequestParam int num2) {
        int result = serviceCalculator.multiply(num1, num2);
        return massageInBrowser(num1, num2, '*', result);
    }

    @GetMapping("/divide")
    public String numdivide(@RequestParam int num1, @RequestParam int num2) {
        int result = serviceCalculator.divide(num1, num2);
        return massageInBrowser(num1, num2, '/', result);
    }

    private String massageInBrowser(int num1, int num2, char action, int result) {
        return String.format("<h1>%d %c %d = %d</h1>", num1, action, num2, result);
    }
}
