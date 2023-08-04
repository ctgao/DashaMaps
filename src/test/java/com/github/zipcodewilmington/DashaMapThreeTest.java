package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DashaMapThreeTest {
    @Test
    public void set() {
        //Given
        int expectedSize = 1;
        String expectedKey = "aardvark";
        Integer expectedValue = 91;
        DashaMapThree three = new DashaMapThree();
        //When
        three.set(expectedKey, expectedValue);
        //Then
        Assert.assertEquals(expectedSize, three.bucketSize("b"));
    }

    @Test
    public void delete() {
        //Given
        int expectedSize = 0;
        String expectedKey = "aardvark";
        Integer expectedValue = 91;
        DashaMapThree three = new DashaMapThree();
        three.set(expectedKey, expectedValue);
        //When
        Integer actualValue = three.delete(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedSize, three.bucketSize("b"));
    }

    @Test
    public void get() {
        //Given
        String expectedKey = "aardvark";
        Integer expectedValue = 91;
        DashaMapThree three = new DashaMapThree();
        three.set(expectedKey, expectedValue);
        //When
        Integer actualValue = three.get(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}