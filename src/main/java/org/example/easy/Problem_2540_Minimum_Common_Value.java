package org.example.easy;

import java.util.Arrays;

public class Problem_2540_Minimum_Common_Value {

    public int getCommon(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]){
                    ans[i] = nums1[i];
                } else {
                    return -1;
                }
            }
        }
        Arrays.sort(ans);
        return ans[0];
    }
}
