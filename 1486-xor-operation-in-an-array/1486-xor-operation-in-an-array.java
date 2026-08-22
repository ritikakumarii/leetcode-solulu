class Solution {
    public int xorOperation(int n, int start) {
       int[] ans = new int[n];
        
        for(int i =0; i< n ; i++){
            ans[i] = start + 2*i;

         }
         int val=0;
         for(int num : ans){
         val^=num;
         }
         return val;     
    }
}