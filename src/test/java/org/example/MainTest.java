package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    Main main = new Main();
    double delta = 0.001;

    @Test
    public void testSquareroot() {
        assertEquals(2.0, Main.squareRoot(4.0), delta);
    }

    @Test
    public void testFactorial() {
        assertEquals(24, Main.factorial(4));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(1.386, Main.naturalLog(4.0), delta);
    }

    @Test
    public void testPower() {
        assertEquals(16.0, Main.exponent(4.0, 2.0), delta);
    }
}