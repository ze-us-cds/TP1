package CodeTests;

import static org.junit.jupiter.api.Assertions.*;

import org.example.BinarySearchCorrectedVersion;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] array = {5, 17, 26, 51, 786};

        // Test case where the element is in the first half of the array
        assertEquals(0, BinarySearchCorrectedVersion.binarySearch(array, 5));

        // Test case where the element is in the middle of the array
        assertEquals(2, BinarySearchCorrectedVersion.binarySearch(array, 26));

        // Test case where the element is in the last half of the array
        assertEquals(3, BinarySearchCorrectedVersion.binarySearch(array, 51));

        // Test case where the element is not present
        assertEquals(-1, BinarySearchCorrectedVersion.binarySearch(array, 13));
        assertEquals(-1, BinarySearchCorrectedVersion.binarySearch(array, 37));

        // Test with an empty array
        assertEquals(-1, BinarySearchCorrectedVersion.binarySearch(new int[0], 0));

        // Test with a null array (should throw an exception)
        assertThrows(NullPointerException.class, () -> {
            BinarySearchCorrectedVersion.binarySearch(null, 99);
        });
    }
}
