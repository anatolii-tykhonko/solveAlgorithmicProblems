package com.aTykhonko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {
    Solution4 solution = new Solution4();

    @Test
    void returnMedianElementWhenExistOneArray(){
        int[] inputFirst = {1,2,3};
        int[] inputSecond = {};
        double expected = 2.0;

        double actual = solution.findMedianSortedArrays(inputFirst, inputSecond);

        assertEquals(expected, actual);
    }
    @Test
    void returnElementWhenExistOneArrayWithOneElement(){
        int[] inputFirst = {2};
        int[] inputSecond = {};
        double expected = 2.0;

        double actual = solution.findMedianSortedArrays(inputFirst, inputSecond);

        assertEquals(expected, actual);
    }
    @Test
    void returnMedianElementWhenFirstArrayWithTwoElementSecondWithOne(){
        int[] inputFirst = {1,2};
        int[] inputSecond = {3};
        double expected = 2.0;

        double actual = solution.findMedianSortedArrays(inputFirst, inputSecond);

        assertEquals(expected, actual);
    }
    @Test
    void returnMedianElementWhenArrayOdd(){
        int[] inputFirst = {1,2};
        int[] inputSecond = {3,4,5};
        double expected = 3.0;

        double actual = solution.findMedianSortedArrays(inputFirst, inputSecond);

        assertEquals(expected, actual);
    }
    @Test
    void returnMedianElementWhenMergedArrayConsistCombinedElementsTwoArrays(){
        int[] inputFirst = {1,3};
        int[] inputSecond = {2,4,5};
        double expected = 3.0;

        double actual = solution.findMedianSortedArrays(inputFirst, inputSecond);

        assertEquals(expected, actual);
    }
    @Test
    void returnMedianValueWhenMergedArrayEven(){
        int[] inputFirst = {1,3,6};
        int[] inputSecond = {2,4,5};
        double expected = 3.5;

        double actual = solution.findMedianSortedArrays(inputFirst, inputSecond);

        assertEquals(expected, actual);
    }

}