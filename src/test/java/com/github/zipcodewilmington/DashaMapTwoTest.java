package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DashaMapTwoTest {
    @Test
    public void set() {
        //Given
        int expectedSize = 1;
        String expectedKey = "BRent";
        Integer expectedValue = 91;
        DashaMapTwo two = new DashaMapTwo();
        //When
        two.set(expectedKey, expectedValue);
        //Then
        Assert.assertEquals(expectedSize, two.bucketSize("r"));
    }

    @Test
    public void delete() {
        //Given
        int expectedSize = 0;
        String expectedKey = "BRent";
        Integer expectedValue = 91;
        DashaMapTwo two = new DashaMapTwo();
        two.set(expectedKey, expectedValue);
        //When
        Integer actualValue = two.delete(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedSize, two.bucketSize("r"));
    }

    @Test
    public void getTest() {
        //Given
        String expectedKey = "Brent";
        Integer expectedValue = 91;
        DashaMapTwo two = new DashaMapTwo();
        two.set(expectedKey, expectedValue);
        //When
        Integer actualValue = two.get(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}