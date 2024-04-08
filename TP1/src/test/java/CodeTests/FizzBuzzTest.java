package CodeTests;

import static org.junit.jupiter.api.Assertions.*;

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        // Standard test cases
        // Test case where n is equal to 1
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        // Test case where n is divisible by 3 but not by 5
        assertEquals("Fizz", FizzBuzz.fizzBuzz(12));
        // Test case where n is divisible by 5 but not by 3
        assertEquals("Buzz", FizzBuzz.fizzBuzz(100));
        // Test case where n is neither divisible by 3 nor by 5
        assertEquals("17", FizzBuzz.fizzBuzz(17));
        // Test case where n is divisible by 15
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(90));

        // Lower bound test case
        // Test case where n is less than 1 (should throw an exception)
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(0);
        });
    }
}

