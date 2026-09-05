class Solution {
    public int findDuplicate(int[] nums) {
        // uses extra space
        // HashMap<Integer,Integer>map = new HashMap<>();
        // for(int i =0 ;i<nums.length;i++){
        //     if(map.containsKey(nums[i])) return nums[i];
        //     else{
        //         map.put(nums[i],i);
        //     }
    
        // }
        //  return -1;

        // uses extra space
        // 
        //  use slow and fast pointer(Floyd’s Tortoise & Hare)
        int n = nums.length;
        int fast = nums[0];
        int slow = nums[0];
        do{
            slow= nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        fast= nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }
}