package code401challenges;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class ArrayShiftTest {
    @Test public void testinsertShiftArray() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(99);
        expected.add(3);

        assertTrue("insertShiftArray should return 'true'", ArrayShift.insertShiftArray(input,99));
    }
}
