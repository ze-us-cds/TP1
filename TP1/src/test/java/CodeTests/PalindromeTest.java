package CodeTests;

import org.example.PalinromeCorrectedVersion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        // Standard test cases with a palindrome
        assertTrue(PalinromeCorrectedVersion.isPalindrome("kayak"));
        assertTrue(PalinromeCorrectedVersion.isPalindrome("Nurse I spy gypsies run")); // "Nurse, I spy gypsies, run"

        // Standard test cases with a string that is not a palindrome
        assertFalse(PalinromeCorrectedVersion.isPalindrome("freeze"));
        assertFalse(PalinromeCorrectedVersion.isPalindrome("the word word is not palindrome"));

        // Edge case with an empty string
        assertTrue(PalinromeCorrectedVersion.isPalindrome(""));

        // Edge case with a single letter
        assertTrue(PalinromeCorrectedVersion.isPalindrome("w"));

        // Edge case with a null string (should throw an exception)
        assertThrows(NullPointerException.class, () -> {
            PalinromeCorrectedVersion.isPalindrome(null);
        });

        // Test case where the string contains two identical characters
        assertTrue(PalinromeCorrectedVersion.isPalindrome("ff"));
    }
}
