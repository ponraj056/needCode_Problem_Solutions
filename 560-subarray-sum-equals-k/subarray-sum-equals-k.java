class Solution {
    public int subarraySum(int[] nums, int p) {
        int c = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int k = i; k < n; k++) {
                sum += nums[k];
                if (sum == p)
                    c++;
            }
        }
        return c;
    }
}