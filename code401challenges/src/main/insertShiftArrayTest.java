package code401challenges;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class insertShiftArrayTest {
    @Test public void testInsertShiftArray() {
        ArrayList<Integer> expectedArray = new ArrayList<>() {{
            add(4);
            add(8);
            add(15);
            add(16);
            add(23);
            add(42);
        }};
        ArrayList<Integer> testArray = new ArrayList<>() {{
            add(4);
            add(8);
            add(15);
            add(23);
            add(42);
        }};
        ArrayList<Integer> actualArray = ArrayShift.insertShiftArray(testArray, 16);

        assertEquals(expectedArray, actualArray);
    }
}
