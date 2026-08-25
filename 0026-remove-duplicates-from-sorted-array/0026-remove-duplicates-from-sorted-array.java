class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int i = 0;
        int j = 0;
        int length = nums.length;
        while (i < length) {
            if (nums[i] != nums[j]) {
                k++;
                j++;
                nums[j] = nums[i];

            } else if (nums[i] == nums[j]) {
                i++;
            }

        }
        return k + 1;
    }
}