package org.example;

import org.junit.Assert;
import org.junit.Test;

public class QuantityCalculatorTest {

    @Test
    public void test1() {
        int array = QuantityCalculator.findMaxNumberRepetitions(new int[]{1, 4, 1});
        int quantity = 2;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void test2() {
        int array = QuantityCalculator.findMaxNumberRepetitions(new int[]{2, 2, 2, 2, 2});
        int quantity = 5;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void test3() {
        int array = QuantityCalculator.findMaxNumberRepetitions(new int[]{1, 2, 3, 4, 5, 5});
        int quantity = 2;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void test4() {
        int array = QuantityCalculator.findMaxNumberRepetitions(new int[]{2, 2, 2, 2, 3, 3, 3});
        int quantity = 4;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void test5() {
        int array = QuantityCalculator.findMaxNumberRepetitions(new int[]{21, 12, 22, 21, 32});
        int quantity = 2;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void test6() {
        int array = QuantityCalculator.findMaxNumberRepetitions(new int[]{-1, -133, 0, -5, -99});
        int quantity = 1;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void test7() {
        int array = QuantityCalculator.findMaxNumberRepetitions(new int[]{1, 1, 1, 2, 2, 2});
        int quantity = 3;
        Assert.assertEquals(quantity, array);
    }

    @Test
    public void test9() {
        int array = QuantityCalculator.findMaxNumberRepetitions(new int[]{});
        int quantity = 0;
        Assert.assertEquals(quantity, array);
    }


}