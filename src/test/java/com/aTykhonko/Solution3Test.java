package com.aTykhonko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {
    Solution3 solution = new Solution3();
    @Test
    void returnZeroWhenInputEmptyString(){
        String input = "";
        int expected = 0;

        int actual = solution.lengthOfLongestSubstring(input);

        assertEquals(expected, actual);
    }
    @Test
    void returnThreeWhenInputThreeDifferentLetters(){
        String input = "abc";
        int expected = 3;

        int actual = solution.lengthOfLongestSubstring(input);

        assertEquals(expected, actual);
    }
    @Test
    void returnThreeWhenInputThreeDifferentLettersAfterRepeat(){
        String input = "abcabcbb";
        int expected = 3;

        int actual = solution.lengthOfLongestSubstring(input);

        assertEquals(expected, actual);
    }
    @Test
    void returnThreeWhenInputThreeDifferentLettersAfterRepeatTwoLetters(){
        String input = "pwwkew";
        int expected = 3;

        int actual = solution.lengthOfLongestSubstring(input);

        assertEquals(expected, actual);
    }
    @Test
    void returnThreeWhenInputThreeDifferentLettersAfterRepeatTwoSubStrings(){
        String input = "abcabcbb";
        int expected = 3;

        int actual = solution.lengthOfLongestSubstring(input);

        assertEquals(expected, actual);
    }
    @Test
    void returnThreeWhenInputThreeDifferentLettersAndFirstIsDuplicated(){
        String input = "dvdf";
        int expected = 3;

        int actual = solution.lengthOfLongestSubstring(input);

        assertEquals(expected, actual);
    }

}