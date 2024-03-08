package org.example.easy;

public class Problem_3005_Count_Elements_With_Maximum_Frequency {
    /*
      Path :
      https://leetcode.com/problems/count-elements-with-maximum-frequency
      */
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums1)); // Output: 4

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(maxFrequencyElements(nums2)); // Output: 5
    }
    public static int maxFrequencyElements(int[] nums) {
            int[] a =new int[101];
            for(int i:nums) {
                a[i]++;
            }
            int maxi=0;
            for(int i=0;i<=100;i++) {
                maxi=Math.max(maxi,a[i]);
            }
            int ans=0;
            for(int i=0;i<=100;i++) {
                if(a[i]==maxi) {
                    ans+=maxi;
                }
            }
            return ans;
        }

}
