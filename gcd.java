class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        
        // Step 1: Find min and max values
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        // Step 2: Compute GCD using Euclidean Algorithm
        return gcd(min, max);
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}