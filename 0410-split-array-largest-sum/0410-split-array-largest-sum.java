class Solution {
   public int splitArray(int[] nums, int k) {

    int start = 0;
    int end = 0;

    // start = maximum single element
    // end = total sum
    for (int num : nums) {
        start = Math.max(start, num);
        end += num;
    }

    int ans = end;

    while (start <= end) {

        int mid = start + (end - start) / 2;

        int parts = 1;
        int sum = 0;

        for (int num : nums) {

            if (sum + num > mid) {
                parts++;
                sum = num;
            } else {
                sum += num;
            }
        }

        // We were able to divide into k or fewer parts
        if (parts <= k) {
            ans = mid;
            end = mid - 1;
        } 
        // Need more than k parts
        else {
            start = mid + 1;
        }
    }

    return ans;
}
}