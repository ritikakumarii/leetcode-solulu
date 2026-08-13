class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
   HashMap<Integer,Integer> map = new HashMap<>();
     map.put(0,1);
     int ans =0;
     int[] ps = new int[nums.length];
     ps[0]=nums[0];
     for(int i =1; i < nums.length ; i++){
        ps[i]=ps[i-1] +nums[i];
     }  
     for(int val: ps){
        ans+= map.getOrDefault(val-goal,0);
        map.put(val,map.getOrDefault(val,0)+1);
     } 
     return ans;
    }
   
}