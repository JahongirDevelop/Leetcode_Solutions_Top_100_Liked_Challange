package org.example.easy;

import java.util.Arrays;

public class Problem_2540_Minimum_Common_Value {

    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[1] == nums2[j]){
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }

}
