package org.example.hard;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Problem_239_Sliding_Window_Maximum {
    /*
      Path :
      https://leetcode.com/problems/sliding-window-maximum
      */

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int ans[] = new int[nums.length - k + 1];
        Deque<Integer> q = new LinkedList<>();

        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(q.size() == 0){
                q.add(nums[j]);
            }
            else{
                while(q.size() > 0 && q.peekLast() < nums[j]){
                    q.removeLast();
                }
                q.add(nums[j]);
            }
            if(j - i + 1 < k) j++;

            else if(j - i + 1 == k){
                ans[i] = q.peek();
                if(nums[i] == q.peek()){
                    q.removeFirst();
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
