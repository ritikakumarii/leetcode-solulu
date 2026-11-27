class Solution {
    // TLE(Recursion)
    // public int tribonacci(int n) {
    //  if(n==0) return n;
    //  if(n==1 || n==2) return 1;
    //  return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);   
    // }

    // Recursion +Memoization
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return tri(n,dp);
    }
    public int tri(int n , int[] dp){
      if(n==0) return dp[n]=0;
      if(n==1 || n==2) return dp[n]=1;
      if(dp[n]!=-1) return dp[n];
      return dp[n]= tri(n-1,dp)+tri(n-2,dp)+tri(n-3,dp);
       
      
    }

}