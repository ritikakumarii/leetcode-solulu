class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexmin = -1;
        int indexmax = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                indexmin = i;
                min = nums[i];
            } 
            if(nums[i]>max) {
                indexmax = i;
                max = nums[i];
            }
        }
        int left = Math.min(indexmin, indexmax);
        int right = Math.max(indexmin, indexmax);
        int fromLeft = right + 1;
        int fromend = nums.length - left;
        int both = left + 1 + (nums.length - right);

        return Math.min(fromLeft,Math.min(fromend, both));

    }
}