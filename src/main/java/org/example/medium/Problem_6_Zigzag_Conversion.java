package org.example.medium;

public class Problem_6_Zigzag_Conversion {
    /*
      Path :
     https://leetcode.com/problems/zigzag-conversion/
      */
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
            int n = s.length();
            StringBuffer [] arr = new StringBuffer[numRows];
            for(int i=0; i<numRows; i++) arr[i] = new StringBuffer();

            int i=0;
            while(i<n){
                for(int ind=0; ind<numRows && i<n; ind++){
                    arr[ind].append(s.charAt(i++));
                }
                for(int ind=numRows-2; ind>0 && i<n; ind--){
                    arr[ind].append(s.charAt(i++));
                }
            }
            StringBuffer ans = new StringBuffer();
            for(StringBuffer el : arr){
                ans.append(el);
            }
            return ans.toString();
        }
}
