package org.example.easy;

public class Problem_3005_Count_Elements_With_Maximum_Frequency {
        public int maxFrequencyElements(int[] nums) {
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
