package pro.skyjavanamig.skyprocalculatornamig;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceImplTest {
    private final ServiceCalculatorImpl out = new ServiceCalculatorImpl();

    @Test
    public void shouldReturnTwoSum1Arguments1And2() {
        assertEquals(2, out.sum(1, 1));
    }

    @Test
    public void shouldReturnTwoSum2Arguments1And2() {
        assertEquals(3, out.sum(1, 2));
    }

    @Test
    public void shouldReturnOneMinus1Arguments1And2() {
        assertEquals(1, out.minus(3, 2));
    }

    @Test
    public void shouldReturnOneMinus2Arguments1And2() {
        assertEquals(0, out.minus(2, 2));
    }

    @Test
    public void shouldReturnOneMultiply1Arguments1And2() {
        assertEquals(1, out.multiply(1, 1));
    }

    @Test
    public void shouldReturnOneMultiply2Arguments1And2() {
        assertEquals(0, out.multiply(1, 0));
    }

    @Test
    public void shouldDivideZeroExceptionWhenDividing1AnyNumberByZero() {
        assertThrows(DivideZeroException.class, () -> out.divide(1, 0));
    }

    @Test
    public void shouldDivideZeroExceptionWhenDividing2AnyNumberByZero() {
        assertThrows(DivideZeroException.class, () -> out.divide(3, 0));
    }
}
