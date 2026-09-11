class Solution {//variable size window 
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int ans = 0;

        int low = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

            while (sum >= target) {

                ans = i - low + 1;

                min = Math.min(ans, min);
                sum = sum - nums[low];
                low++;

            }

        }
        if (min==Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}