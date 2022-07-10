package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    public void whenMax2To4Then4() {
        int left = 2;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    public void whenEqual2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
}