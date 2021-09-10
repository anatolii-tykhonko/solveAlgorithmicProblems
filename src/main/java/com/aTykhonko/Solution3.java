package com.aTykhonko;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        String[] array = s.split("");
        List<String> uniqueCharacter = new ArrayList();
        int maxLength = 0;
        int tempMaxLength = 0;
        int indexGeneral = 0;
        for (int i = 0; i < array.length; i++) {
            if (uniqueCharacter.contains(array[i])) {
                uniqueCharacter.clear();
                tempMaxLength = 0;
                i = indexGeneral;
                indexGeneral++;
            } else {
                uniqueCharacter.add(array[i]);
                tempMaxLength++;
            }
            if(maxLength < tempMaxLength){
                maxLength = tempMaxLength;
            }
        }
        return maxLength;
    }
}