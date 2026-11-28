class Solution {
    // public int fibo(int n , int[] dp){
    //     if(n<=1) return n;
    //     if(dp[n]!=0) return dp[n];
    //     return dp[n]= fibo(n-1,dp) +fibo(n-2,dp);
    // }
    public int fib(int n) {
        if(n<1) return n;
        int first=0;
        int second=1;
        int ans=1;
        if(n>2){
        for(int i =1 ; i<n-1; i++){
          first=second;
          second=ans;
          ans=first+second;
        }
        }
        return ans;
    }
        
    }
