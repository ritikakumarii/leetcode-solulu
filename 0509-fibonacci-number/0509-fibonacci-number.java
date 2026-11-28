class Solution {
    // public int fibo(int n , int[] dp){
    //     if(n<=1) return n;
    //     if(dp[n]!=0) return dp[n];
    //     return dp[n]= fibo(n-1,dp) +fibo(n-2,dp);
    // }
    public int fib(int n) {
        if(n<=1) return n;
        int first=0;
        int second=1;
        
        for(int i =2 ; i<=n; i++){
          int ans=first+second;
          first=second;
          second=ans;
          
        
        }
        return second;
    }
        
    }
