package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(2,3, '+'));
        assertEquals(7.0, calculator.add(10,3 , '-'));
        assertEquals(6.0, calculator.add(2,3 , '*'));
        assertEquals(5.0, calculator.add(15,3 , '/'));
        // Edge Cases
        assertEquals(0,calculator.add(0,0 , '+'));
        assertEquals(-2.0, calculator.add(-1, -1, '+'));
    }
}
