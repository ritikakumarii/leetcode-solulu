class Solution {
    //vahiyat complexity
    // public int mincost(int[] cost, int idx){
    //     if(idx<=1) return cost[idx];
    //     return cost[idx] +Math.min(mincost(cost,idx-1),mincost(cost,idx-2));
    // }
    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //   return Math.min(mincost(cost, n-1),mincost(cost,n-2));  
    // }

    //  done using dp
    public int mincost(int[] cost, int idx,int[]dp){
        if(idx<=1) return dp[idx]=cost[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=cost[idx] +Math.min(mincost(cost,idx-1,dp),mincost(cost,idx-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
      return Math.min(mincost(cost, n-1,dp),mincost(cost,n-2,dp));  
    }

}