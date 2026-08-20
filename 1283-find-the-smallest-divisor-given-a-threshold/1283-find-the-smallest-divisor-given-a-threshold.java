class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
    int max=0;
    for(int num:nums){
        max= Math.max(num,max);
    }
    int left =1;
    int right=max;
    int sum =0;
    while(left<=right){
        sum=0;
    int mid = left+(right-left)/2;
    for(int i =0; i< nums.length; i++){

        sum+=(nums[i]+ mid-1)/mid;
    }    
    if(sum>threshold) left=mid+1;
    else right = mid-1; 
    }
        return left;
    }
    
}