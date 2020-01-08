package code401challenges;

import java.util.ArrayList;

public class ArrayShift {
    public static int[] insertShiftArray(int[] arrayToBeShifted, int valueToBeAdded) {
        int arrayMidPoint = arrayToBeShifted.length / 2;
        int[] result= new int[arrayToBeShifted.length +1];
        if(arrayToBeShifted.length % 2 == 0) {
            for (int i = 0; i< result.length; i++) {
                if(i < arrayMidPoint){

                }
                else if ( i == arrayMidPoint) {
                    // this is where valueToBeAdded goes
                    arrayToBeShifted.length, arrayMidPoint, valueToBeAdded
                }
                else{
                    // copy over second half of input array
                    arrayToBeShifted.length +1,

                }


            }

        } else {
            arrayToBeShifted.add((int) ((arrayMidPoint + .5) + 1), valueToBeAdded);
        }
        return arrayToBeShifted;
    }
}