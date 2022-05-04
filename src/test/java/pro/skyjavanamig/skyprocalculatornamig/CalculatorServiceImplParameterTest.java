package pro.skyjavanamig.skyprocalculatornamig;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorServiceImplParameterTest {

    private final ServiceCalculatorImpl out = new ServiceCalculatorImpl();
    private static Stream<Arguments> paramsForTestsSum(){
        return Stream.of(
                Arguments.of(5, 2, 7),
                Arguments.of(3, 1, 4),
                Arguments.of(4, 2, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTestsSum")
    public void shouldReturnCorrectResultFromSummation(int num1, int num2, int expected){
        assertEquals(expected, out.sum(num1,num2));
    }

    private static Stream<Arguments> paramsForTestsMinus(){
        return Stream.of(
                Arguments.of(10, 5, 5),
                Arguments.of(7, 5, 2),
                Arguments.of(8, 6, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTestsMinus")
    public void shouldReturnCorrectResultFromMinus(int num1, int num2, int expected){
        assertEquals(expected, out.minus(num1,num2));
    }

    private static Stream<Arguments> paramsForTestsMultiply(){
        return Stream.of(
                Arguments.of(4, 2, 8),
                Arguments.of(6, 2, 12),
                Arguments.of(4, 4, 16)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTestsMultiply")
    public void shouldReturnCorrectResultFromMultiply(int num1, int num2, int expected){
        assertEquals(expected, out.multiply(num1,num2));
    }

    private static Stream<Arguments> paramsForTestsDividing(){
        return Stream.of(
                Arguments.of(8, 2, 4),
                Arguments.of(12, 6, 2),
                Arguments.of(6, 2, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTestsDividing")
    public void shouldReturnCorrectResultFromDividing(int num1, int num2, int expected){
        assertThrows(DivideZeroException.class, () -> out.divide(1, 0) );
        assertEquals(expected, out.divide(num1,num2));
    }
}
