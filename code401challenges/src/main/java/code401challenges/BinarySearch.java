package code401challenges;

import java.util.Arrays;

public class BinarySearch {
    public static int BinaryMachine(int[] startArray, int pinpointNum) {
        int startIndex = 0;
        int endIndex = startArray.length - 1;
        int halfway = -1;
        while (startIndex <= endIndex) {
            halfway = (int) Math.ceil((startIndex + endIndex) / 2);

            if (startArray[halfway] < pinpointNum) {
                startIndex = halfway + 1;

            } else if (startArray[halfway] == pinpointNum) {
                System.out.println("Element is found at index: " + halfway);

                break;

            } else {
                endIndex = halfway - 1;
            }
        }
        if (startIndex > endIndex) {
            return -1;
        }
        return halfway;
    }
}







