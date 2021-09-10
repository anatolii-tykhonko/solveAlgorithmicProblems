package com.aTykhonko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution1Test  {
    Solution1 solution = new Solution1();

    @Test
    public void twoSumReturnZeroAndOneWhenSummFirstAndSecondEqualsTarget() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] expected = new int[]{0,1};

        int[] result = solution.twoSum(nums, target);

        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
    @Test
    public void twoSumReturnZeroAndOneWhenSummFirstAndSecondEqualsTargetNegativeNumbers() {
        int[] nums = new int[]{-2,-7,11,15};
        int target = -9;
        int[] expected = new int[]{0,1};

        int[] result = solution.twoSum(nums, target);

        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
    @Test
    public void twoSumReturnZeroAndtwoWhenSummFirstAndThirdEqualsTargetNegativeNumbers() {
        int[] nums = new int[]{-2,-7,11,15};
        int target = 9;
        int[] expected = new int[]{0,2};

        int[] result = solution.twoSum(nums, target);

        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
    @Test
    public void twoSumReturnZeroAndtwoWhenSummFirstAndThirdEqualsTargetAllNegativeNumbers() {
        int[] nums = new int[]{-2,0,-7,-11};
        int target = -9;
        int[] expected = new int[]{0,2};

        int[] result = solution.twoSum(nums, target);

        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }
    @Test
    public void twoSumReturnZeroAndZeroWhenNoSummEqualsResult() {
        int[] nums = new int[]{-2,0,-7,-11};
        int target = 10;
        int[] expected = new int[]{0,0};

        int[] result = solution.twoSum(nums, target);

        assertEquals(expected[0], result[0]);
        assertEquals(expected[1], result[1]);
    }

}