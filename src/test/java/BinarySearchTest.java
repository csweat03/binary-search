import me.christian.binary_search.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    final BinarySearch binarySearch = new BinarySearch();

    @Test
    void testBinarySearchFindOnArrayOf10() {
        assertEquals(2 , binarySearch.find(3, new int[] {1,2,3,4,5,6,7,8,9,10}));
    }

    @Test
    void testBinarySearchMissOnEmptyArray() {
        assertEquals(-1, binarySearch.find(11, new int[] {1,2,3,4,5,6,7,8,9,10}));
    }

    @Test
    void testBinarySearchOnEmptyArray() {
        assertEquals(-1, binarySearch.find(4, new int[] {}));
    }

}
