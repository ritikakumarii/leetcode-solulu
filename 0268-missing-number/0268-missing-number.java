
class Solution {
    public int missingNumber(int[] arr) {
      int a1=0;
      int a2=0;
      for(int i=0;i<arr.length;i++){
        a1^=arr[i];
      }
      for(int i=1;i<=arr.length;i++ ){
        a2^=i;
      }
      return a1^a2;
    
    
}
}