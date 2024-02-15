package org.example.hard;

public class Problem_42_Trapping_Rain_Water {
    /*
      Path :
      https://leetcode.com/problems/trapping-rain-water
      */
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if (height.length <= 2) return 0;

        int water = 0;
        int maxLeft = 0;
        int maxRight = height.length - 1;
        int max = 0;

        for (int j = 0; j < height.length; j++) {
            if (height[max] < height[j]) max = j;
        }

        for (int i = 1; i <= max; i++) {
            if (height[i] < height[maxLeft]) {
                water += (height[maxLeft] - height[i]);
            } else {
                maxLeft = i;
            }
        }

        for (int i = height.length - 2; i > max; i--) {
            if (height[i] < height[maxRight]) {
                water += (height[maxRight] - height[i]);
            } else {
                maxRight = i;
            }
        }

        return water;
    }
}
