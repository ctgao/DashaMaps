package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DashaMapOneTest {
    @Test
    public void set() {
        //Given
        int expectedSize = 1;
        String expectedKey = "Brent";
        Integer expectedValue = 91;
        DashaMapOne one = new DashaMapOne();
        //When
        one.set(expectedKey, expectedValue);
        //Then
        Assert.assertEquals(expectedSize, one.bucketSize("b"));
    }

    @Test
    public void delete() {
        //Given
        int expectedSize = 0;
        String expectedKey = "Brent";
        Integer expectedValue = 91;
        DashaMapOne one = new DashaMapOne();
        one.set(expectedKey, expectedValue);
        //When
        Integer actualValue = one.delete(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertEquals(expectedSize, one.bucketSize("b"));
    }

    @Test
    public void get() {
        //Given
        String expectedKey = "Brent";
        Integer expectedValue = 91;
        DashaMapOne one = new DashaMapOne();
        one.set(expectedKey, expectedValue);
        //When
        Integer actualValue = one.get(expectedKey);
        //Then
        Assert.assertEquals(expectedValue, actualValue);
    }
}