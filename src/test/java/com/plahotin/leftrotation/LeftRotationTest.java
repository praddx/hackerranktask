package com.plahotin.leftrotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftRotationTest {

    LeftRotation rotation = new LeftRotation();

    @Test
    void rotate() {
        int rotationNumber = 2;
        int[] inputArray = new int[] {1, 2, 3, 4};

        int[] expectedArray = new int[]{3, 4, 1, 2};

        assertArrayEquals(expectedArray, rotation.rotate(rotationNumber, inputArray));
    }
}