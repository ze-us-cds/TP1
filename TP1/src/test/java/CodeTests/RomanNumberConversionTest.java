package CodeTests;

import static org.junit.jupiter.api.Assertions.*;

import org.example.RomanNumberConversionCorrectedVersion;
import org.junit.jupiter.api.Test;

public class RomanNumberConversionTest {

    @Test
    public void testToRoman() {
        // Standard test cases
        assertEquals("VIII", RomanNumberConversionCorrectedVersion.toRoman(8));
        assertEquals("IX", RomanNumberConversionCorrectedVersion.toRoman(9));
        assertEquals("XLV", RomanNumberConversionCorrectedVersion.toRoman(45));
        assertEquals("XCVI", RomanNumberConversionCorrectedVersion.toRoman(96));
        assertEquals("CMXCIX", RomanNumberConversionCorrectedVersion.toRoman(999));

        // Lower bound test case
        // Test case where n is less than 1 (should throw an exception)
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumberConversionCorrectedVersion.toRoman(0);
        });

        // Upper bound test case
        // Test case where n is greater than 3999 (should throw an exception)
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumberConversionCorrectedVersion.toRoman(4000);
        });

        // Test case where n is equal to 1
        assertEquals("I", RomanNumberConversionCorrectedVersion.toRoman(1));

        // Test case where n is equal to 3999
        assertEquals("MMMCMXCIX", RomanNumberConversionCorrectedVersion.toRoman(3999));
    }
}


