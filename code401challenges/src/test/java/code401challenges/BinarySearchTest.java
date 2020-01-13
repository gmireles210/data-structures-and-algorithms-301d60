package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;
public class BinarySearchTest {
    @Test public void testBinaryMachine() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int key = 1;
        int actualOutput = BinarySearch.BinaryMachine(arr, key);
        System.out.println("actualOutput = " + actualOutput);
    }
}

