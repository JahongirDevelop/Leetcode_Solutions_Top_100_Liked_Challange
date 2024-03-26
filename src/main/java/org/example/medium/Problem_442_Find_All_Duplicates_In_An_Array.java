package org.example.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem_442_Find_All_Duplicates_In_An_Array {

    /*
     Path :
     https://leetcode.com/problems/find-all-duplicates-in-an-array
     */
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for(int n : nums){
            if(s.contains(n)){
                res.add(n);
            } else {
                s.add(n);
            }
        }
        return res;
    }

}
