class Solution {
    //Tabulation method
    // public int amt(int [] nums , int i , int j){
    //     if (i == j) return nums[i];
    //  int[] dp = new int[j-i+1];
    //     if(nums.length==1) return nums[0];
    //     dp[0] = nums[i];
    //     dp[1]= Math.max(nums[i],nums[i+1]);
    //     for(int idx =2 ; idx<dp.length ; idx++){
    //         dp[idx]=Math.max((nums[i+idx]+dp[idx-2]),dp[idx-1]);
    //     }    
    //     return dp[dp.length-1];
    // }
    // public int rob(int[] nums) {
    //     int n = nums.length;
    //  return Math.max(amt(nums,0,n-2),amt(nums,1,n-1));  
    // }

    // Recursion+Memoization
    public int amt (int[]nums, int i ,int end , int [] dp){
        if(i>end) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i]+amt(nums,i+2,end,dp);
        int skip = amt(nums,i+1,end,dp);
        return dp[i]=Math.max(pick,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
         if (n == 1) return nums[0];

    int[] dp1 = new int[n];
    int[] dp2 = new int[n];

    Arrays.fill(dp1, -1);
    Arrays.fill(dp2, -1);
        
        return Math.max(amt(nums,0,n-2,dp1),amt(nums,1,n-1,dp2));
    }
}