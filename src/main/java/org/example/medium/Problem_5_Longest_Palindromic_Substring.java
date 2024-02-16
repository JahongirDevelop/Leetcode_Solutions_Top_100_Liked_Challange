package org.example.medium;

public class Problem_5_Longest_Palindromic_Substring {
    /*
    Path :
    https://leetcode.com/problems/longest-palindromic-substring
            */

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // "bab" or "aba"
        System.out.println(longestPalindrome("cbbd")); // "bb"
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        if(n==1) return s;

        int start = 0, end = 0;

        int left=0, right=0;
        for(int i=0; i<s.length(); i++){

            left = i-1;
            right = i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left+1 > end-start+1){
                    start = left;
                    end = right;
                }
                left--; right++;
            }

            left = i;
            right = i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left+1 > end-start+1){
                    start = left;
                    end = right;
                }
                left--; right++;
            }
        }
        return s.substring(start, end+1);
    }
}
