class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int ans=Integer.MAX_VALUE;
       int mindiff=Integer.MAX_VALUE;
        Arrays.sort(nums);
         for(int i =0 ; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right){
                int sum = nums[i]+ nums[left] +nums[right];
                 int diff = Math.abs(target-sum);
                 if(diff<mindiff){
                    mindiff=diff;
                    ans=sum;
                 }
                if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
         }
    }
     return ans;
    }
}
