class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] odd = new int[nums.length];
        odd[0]= nums[0]%2;
        for(int i =1 ; i<nums.length ; i++){
            if(nums[i]%2!=0) {
                odd[i]= odd[i-1]+1;
            }
            else {
                odd[i]=odd[i-1];
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int val : odd){
            count+=map.getOrDefault(val-k,0);
            map.put(val,map.getOrDefault(val,0)+1);
            
        }
      return count;  
    }
}