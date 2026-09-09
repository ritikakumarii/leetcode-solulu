class Solution {
    public long countCommas(long n) {
        long ans =0;
        for(long x=1000 ; x<=n ; x=x*1000){
            ans= ans +(n-x+1);

        }
        return ans;
    //  if(n<1000) return 0;
    //  else if(n>=1000 && n<1000000){
    //     return (n-999);
    //  }
    //  else if(n>=1000000 && n<1000000000){
    //     return 2*(n-1000000+1)+ 1*(1000);
    //  }
    //  else if(n>=1000000000L && n<1000000000000L){
    //     return 3*(n-1000000000L+1) + 2*1000000 + 1000;
    //  }
    //  else if(n>=1000000000000L && n <1000000000000000L){
    //     return 4*(n-1000000000000L+1)+ 3*(1000000000) + 2*1000000 +1000;
    //  }
    //  else
    //  return 5*(n-1000000000000000L+1) +4*(1000000000000L)+ 3*(1000000000L) + 2*1000000 +1000;
    }
}