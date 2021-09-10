package com.aTykhonko;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int medianArrayIndex = (nums1.length + nums2.length) / 2;
        boolean isEven = (nums1.length + nums2.length) % 2 == 0;
        int indexFirst = 0;
        int indexSecond = 0;
        int indexTemp = 0;
        int medianNumber = 0;
        int secondMedialNumberIfEvenArray = 0;
        boolean isLessMedian = true;
        while (isLessMedian) {
            if (indexFirst >= nums1.length) {
                medianNumber = nums2[indexSecond];
                indexSecond++;
            } else if (indexSecond >= nums2.length) {
                medianNumber = nums1[indexFirst];
                indexFirst++;
            } else if (nums1[indexFirst] < nums2[indexSecond]) {
                medianNumber = nums1[indexFirst];
                indexFirst++;
            } else {
                medianNumber = nums2[indexSecond];
                indexSecond++;
            }
            isLessMedian = indexTemp < medianArrayIndex;
            indexTemp++;
            if (isEven && isLessMedian) {
                secondMedialNumberIfEvenArray = medianNumber;
            }
        }
        return isEven ? (medianNumber + secondMedialNumberIfEvenArray) / 2.0 : medianNumber * 1.0;
    }
}
