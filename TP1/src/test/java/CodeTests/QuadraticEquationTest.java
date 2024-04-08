package CodeTests;

import static org.junit.jupiter.api.Assertions.*;

import org.example.QuadraticEquation;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {

    @Test
    public void testSolve() {
        // Standard test case with two distinct real roots
        double[] result1 = QuadraticEquation.solve(1, -1, -6);
        assertNotNull(result1);
        assertEquals(2, result1.length);
        assertEquals(3.0, result1[0]);
        assertEquals(-2.0, result1[1]);

        // Test case with a single real root
        double[] result2 = QuadraticEquation.solve(1, -10, 25);
        assertNotNull(result2);
        assertEquals(1, result2.length);
        assertEquals(5.0, result2[0]);

        // Test case with no real roots
        double[] result3 = QuadraticEquation.solve(1, 1, 1);
        assertNull(result3);

        // Test case with 'a' equal to zero (should throw an exception)
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquation.solve(0, 3, 7);
        });

        // Test case with delta equal to zero (one real root)
        double[] result4 = QuadraticEquation.solve(1, -4, 4);
        assertNotNull(result4);
        assertEquals(1, result4.length);
        assertEquals(2.0, result4[0]);
    }
}
