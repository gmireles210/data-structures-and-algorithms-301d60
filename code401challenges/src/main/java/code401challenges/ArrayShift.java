package code401challenges;

import java.util.ArrayList;

public class ArrayShift {
    public static ArrayList<Integer> insertShiftArray(ArrayList<Integer> arrayToBeShifted, int valueToBeAdded) {
        float arrayMidPoint = arrayToBeShifted.size() / 2;

        if(arrayToBeShifted.size() % 2 == 0) {
            arrayToBeShifted.add((int) arrayMidPoint, valueToBeAdded);
        } else {
            arrayToBeShifted.add((int) ((arrayMidPoint + .5) + 1), valueToBeAdded);
        }
        return arrayToBeShifted;
        
    }
}