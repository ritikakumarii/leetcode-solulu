class Solution {
    public int amt(int [] nums , int i , int j){
        if (i == j) return nums[i];
     int[] dp = new int[j-i+1];
        if(nums.length==1) return nums[0];
        dp[0] = nums[i];
        dp[1]= Math.max(nums[i],nums[i+1]);
        for(int idx =2 ; idx<dp.length ; idx++){
            dp[idx]=Math.max((nums[i+idx]+dp[idx-2]),dp[idx-1]);
        }    
        return dp[dp.length-1];
    }
    public int rob(int[] nums) {
        int n = nums.length;
     return Math.max(amt(nums,0,n-2),amt(nums,1,n-1));  
    }
}