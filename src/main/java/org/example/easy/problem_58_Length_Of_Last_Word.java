package org.example.easy;

public class problem_58_Length_Of_Last_Word {
    /*
      Path :
      https://leetcode.com/problems/length-of-last-word
      */
    public static void main(String[] args) {
        String s = "this is string word";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }
}
