import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(2, 3);
    }

    @Test
    public void getNumberOne(){
        assertEquals(2, calculator.getNumberOne());
    }

    @Test
    public void getNumberTwo(){
        assertEquals(3, calculator.getNumberTwo());
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add());
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(1.5, calculator.divide(), 0.01);
    }

}
