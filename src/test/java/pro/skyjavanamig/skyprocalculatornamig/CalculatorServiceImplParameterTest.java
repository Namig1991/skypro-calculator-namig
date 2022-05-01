package pro.skyjavanamig.skyprocalculatornamig;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import java.util.zip.ZipException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.skyjavanamig.skyprocalculatornamig.ConstantsCalculatorServiceImpl.*;

public class CalculatorServiceImplParameterTest {

    private final ServiceCalculatorImpl out = new ServiceCalculatorImpl();
    public static Stream<Arguments> paramsForTests(){
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(ONE, ONE),
                Arguments.of(ZERO, THREE),
                Arguments.of(TWO, TWO),
                Arguments.of(ONE, ONE)

        );
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void shouldReturnCorrectResultFromSummation(int num1, int num2){
        assertEquals(num1 + num2, out.sum(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void shouldReturnCorrectResultFromMinus(int num1, int num2){
        assertEquals(num1 - num2, out.minus(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void shouldReturnCorrectResultFromMultiply(int num1, int num2){
        assertEquals(num1 * num2, out.multiply(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("paramsForTests")
    public void shouldReturnCorrectResultFromDividing(int num1, int num2){
        assertThrows(DivideZeroException.class, () -> out.divide(ONE, ZERO) );
        assertEquals(num1 / num2, out.divide(num1,num2));
    }
}
