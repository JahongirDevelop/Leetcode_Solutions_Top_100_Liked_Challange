package org.example.hard;

public class Problem_41_First_Missing_Positive {
    /*
      Path :
      https://leetcode.com/problems/first-missing-positive
      */
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] found = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if(nums[i] > 0 && nums[i] <= n) {
                found[nums[i]] = true;
            }
        }
        for(int i = 1; i <= n; i++) {
            if(!found[i]) {
                return i;
            }
        }
        return n + 1;
    }
}
