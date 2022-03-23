package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
 //  @DisplayName("Testing sum: 1+1=2")
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })

   public void severalSums(Long first, Long second, Long expectedResult){
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    public void sum(){

        // ARRANGE
        Long number1 = 1L;
        Long number2 = 1L;

        Long expectedValue = 2L;

        // ACT Invocación del método a probar con los valores previamente inicializados
        Long result = basicCalculator.sum(number1, number2);

        //Assert (Verifica si el valor obtenido por el método antes de ejecutado es el esperado
        assertEquals(expectedValue, result);
    }

    @Test
    //Método restar
    public void subs(){

        // ARRANGE
        Long number1 = 1L;
        Long number2 = 1L;

        Long expectedValue = 0L;

        // ACT
        Long result = basicCalculator.subs(number1, number2);

        //ASSERT
        assertEquals(expectedValue, result);
    }

    @Test
    //Método para multiplicar
    public void mult(){

        // ARRANGE
        Long number1 = 1L;
        Long number2 = 1L;

        Long expectedValue = 1L;

        // ACT
        Long result = basicCalculator.mult(number1, number2);

        // ASSERT
        assertEquals(expectedValue, result);
    }

    @Test
    // Método para dividir
    public void div(){

        // ARRANGE
        Long number1 = 1L;
        Long number2 = 1L;

        Long expectedValue = 2L;

        // ACT
        Long result = basicCalculator.div(number1, number2);

        //Assert
        assertEquals(expectedValue, result);
    }
}
