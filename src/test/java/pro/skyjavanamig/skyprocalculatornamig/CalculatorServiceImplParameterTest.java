package pro.skyjavanamig.skyprocalculatornamig;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceImplParameterTest {

    private final ServiceCalculatorImpl out = new ServiceCalculatorImpl();
    public static Stream<Arguments> paramsForTests(){
        return Stream.of(
                Arguments.of(1, 2, 2),
                Arguments.of(2, 1, 2),
                Arguments.of(4, 2, 2),
                Arguments.of(3, 1, 3),
                Arguments.of(0, 1, 0),
                Arguments.of(3, 1, 4)

        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void shouldReturnCorrectResultFromSummation(int num1, int num2){
        assertEquals(num1 + num2, out.sum(num1,num2));
        Arguments.of(1, 1 , 2);
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void shouldReturnCorrectResultFromMinus(int num1, int num2){
        assertEquals(num1 - num2, out.minus(num1,num2));
        Arguments.of(1, 1 , 0);
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void shouldReturnCorrectResultFromMultiply(int num1, int num2){
        assertEquals(num1 * num2, out.multiply(num1,num2));
        Arguments.of(1, 1 , 1);
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void shouldReturnCorrectResultFromDividing(int num1, int num2){
        assertThrows(DivideZeroException.class, () -> out.divide(1, 0) );
        assertEquals(num1 / num2, out.divide(num1,num2));
    }
}
