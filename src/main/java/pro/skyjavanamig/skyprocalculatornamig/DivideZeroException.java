package pro.skyjavanamig.skyprocalculatornamig;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.BAD_REQUEST)
public class DivideZeroException extends IllegalArgumentException {

    public DivideZeroException(String name){
        super("На ноль делить нельзя!");
    }
}
