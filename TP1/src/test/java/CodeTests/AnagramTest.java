package CodeTests;

import static org.junit.jupiter.api.Assertions.*;

import org.example.AnagramCorrectedVersion;
import org.junit.jupiter.api.Test;

public class AnagramTest {
    @Test
    public void testIsAnagram() {
        // Standard test case
        assertTrue(AnagramCorrectedVersion.isAnagram("listen", "silent"));

        // Test with empty strings
        assertTrue(AnagramCorrectedVersion.isAnagram("", ""));

        // Test with strings of different lengths
        assertFalse(AnagramCorrectedVersion.isAnagram("of course", "this is no anagram"));

        // Test with strings containing spaces
        assertTrue(AnagramCorrectedVersion.isAnagram("the eyes", "they see"));

        // Test with strings containing special characters
        assertTrue(AnagramCorrectedVersion.isAnagram("méchant", "chanté"));

        // Test with null strings (should throw an exception)
        assertThrows(NullPointerException.class, () -> {
            AnagramCorrectedVersion.isAnagram(null, "test");
        });
        assertThrows(NullPointerException.class, () -> {
            AnagramCorrectedVersion.isAnagram("test", null);
        });
        // Test with both null strings (should throw an exception)
        assertThrows(NullPointerException.class, () -> {
            AnagramCorrectedVersion.isAnagram(null, null);
        });
    }
}
