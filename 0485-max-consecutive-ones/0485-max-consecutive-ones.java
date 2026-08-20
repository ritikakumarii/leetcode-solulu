class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i =0;
        int j =0;
        int len=0;
        int mx=0;
        while(j<nums.length){
            if(nums[j]==1){
               len=j-i+1;
               j++;
               mx= Math.max(mx,len);
            }
            else{
                j++;
                i=j;
            }
        }
        return mx;
    }
    }