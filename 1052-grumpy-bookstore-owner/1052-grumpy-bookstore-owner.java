class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int alreadyHappy = 0;

        // Customers who are already happy
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                alreadyHappy += customers[i];
            }
        }

        int extra = 0;
        int maxExtra = 0;

        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                extra += customers[i];
            }
        }

        maxExtra = extra;

        
        for (int i = minutes; i < customers.length; i++) {

            // Add new element
            if (grumpy[i] == 1) {
                extra += customers[i];
            }

            // Remove old element
            if (grumpy[i - minutes] == 1) {
                extra -= customers[i - minutes];
            }

            maxExtra = Math.max(maxExtra, extra);
        }

        return alreadyHappy + maxExtra;
    
        }
}