class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i =0;
        int j =0;
        int []positive=new int[nums.length/2];
        int []negative=new int[nums.length/2];
        for(int k=0;k<nums.length;k++){
            if(nums[k]>0){
                positive[i++]=nums[k];
            }
            else{
                negative[j++]=nums[k];
            }
        }
        int p=0;
        int q=0;
        for(int k=0;k<nums.length;k++){
            if(k%2==0){
                nums[k]=positive[p++];
            }
            else{
                nums[k]=negative[q++];
            }
        }
        return nums;
    }
}
       
    //    for(int i=1;i<=nums.length;i++ ){
    //     int j=i+1;
    //       if(i%2!=0&&nums[i]<0){
    //         while(nums[j]<0){
    //         j++;
    //         }
    //         int temp=nums[i];
    //         nums[i]=nums[j];
    //         nums[jtemp;
    //       }
    //       else if(i%2==0&&nums[i]>0){
    //         while(nums[j]>0){
    //             j++;
    //         }
    //         int temp=nums[i];
    //         nums[i]=nums[j];
    //         nums[jtemp;
    // }
//        }
// }