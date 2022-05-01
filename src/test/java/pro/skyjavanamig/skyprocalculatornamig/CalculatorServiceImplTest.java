package pro.skyjavanamig.skyprocalculatornamig;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.skyjavanamig.skyprocalculatornamig.ConstantsCalculatorServiceImpl.*;

public class CalculatorServiceImplTest {
    private final ServiceCalculatorImpl out = new ServiceCalculatorImpl();

    @Test
    public void shouldReturnTwoSum1Arguments1And2() {
        assertEquals(TWO, out.sum(ONE, ONE));
    }

    @Test
    public void shouldReturnTwoSum2Arguments1And2() {
        assertEquals(THREE, out.sum(ONE, TWO));
    }

    @Test
    public void shouldReturnOneMinus1Arguments1And2(){
        assertEquals(ONE, out.minus(THREE, TWO));
    }

    @Test
    public void shouldReturnOneMinus2Arguments1And2(){
        assertEquals(ZERO, out.minus(TWO, TWO));
    }

    @Test
    public void shouldReturnOneMultiply1Arguments1And2(){
        assertEquals(ONE, out.multiply(ONE, ONE));
    }

    @Test
    public void shouldReturnOneMultiply2Arguments1And2(){
        assertEquals(ZERO, out.multiply(ONE, ZERO));
    }

    @Test
    public void shouldDivideZeroExceptionWhenDividingAnyNumberByZero(){
        assertThrows(DivideZeroException.class, () -> out.divide(ONE, ZERO) );
    }
}
