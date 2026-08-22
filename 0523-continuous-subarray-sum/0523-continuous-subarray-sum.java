class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       int currsum=0;
       
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0,-1); 
      for(int i =0 ; i< nums.length ; i++){
       currsum+=nums[i];
       int rem =currsum%k;
       if(map.containsKey(rem)){
        int prev= map.get(rem);
        if(i-prev>=2){
            return true;
        }
       }
       else map.put(rem,i);
      
    }
    return false;
    }
}