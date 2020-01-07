# data-structures-and-algorithms-301d60
# data-structures-and-algorithms-401-Java

# Reverse an Array
Reverse it using a for loop.

## Challenge
Take in a Java Array and reverse it.

## Approach & Efficiency
The approach was completed by using a for-loop to iterate through the array and reverse it.

## Solution



        for (int i = 0; i < currentLength; i++) {

            temporary = inputArray[i];
            inputArray[i] = inputArray[currentLength - 1];
            inputArray[currentLength - 1] = temporary;

            currentLength--;
        }
        return inputArray;
    }
}
