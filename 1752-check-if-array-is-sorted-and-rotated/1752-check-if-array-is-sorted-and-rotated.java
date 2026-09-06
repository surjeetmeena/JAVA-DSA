class Solution {
    public boolean check(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                ans++;
            }
        }
        if (nums[0] < nums[n - 1]) {
            ans++;
        }
        if (ans <= 1) {
            return true;
        }
        return false;
    }
}