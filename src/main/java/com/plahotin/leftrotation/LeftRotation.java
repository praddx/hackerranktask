package com.plahotin.leftrotation;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeftRotation {

    public static void main(String[] args) {
        LeftRotation rotation = new LeftRotation();

        int d = 2;
        int[] arr = new int[]{1, 2, 3, 4};

        String result = Arrays.stream(rotation.rotate(d, arr)).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(result);
    }

    public int[] rotate(int rotationsNumber, int[] inputArray) {

        int[] result = new int[inputArray.length];
        int resultIndex = 0;
        for (int counter = rotationsNumber; counter < inputArray.length; counter++, resultIndex++){
            result[resultIndex] = inputArray[counter];
        }
        for (int counter = 0; counter <= rotationsNumber - 1; counter++, resultIndex++){
            result[resultIndex] = inputArray[counter];
        }
        return result;


    }
}
