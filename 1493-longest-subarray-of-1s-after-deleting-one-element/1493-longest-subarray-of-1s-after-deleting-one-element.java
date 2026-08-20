class Solution {
    public int longestSubarray(int[] nums) {
      int i = 0;
        int j =0;
        int zeroes=0;
        int len=0;
        int max = 0;
        while(j<nums.length){
           if(nums[j]==0) zeroes++;
           if(zeroes>1){
            if(nums[i]==0) zeroes--;
            i++;
           }
           if(zeroes<=1){
            len = j-i;
            max = Math.max(max,len);
           }
           j++;
        }
        return max;   
    }
}