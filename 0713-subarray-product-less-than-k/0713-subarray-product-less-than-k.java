class Solution {//variable window
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int product =1;
        int count = 0;
        int low = 0;
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
            
            while (product >= k&&low<=i) {
                product = product /nums[low];
                
                low++;

            }
            count=count+(i-low+1);

        }
        return count;
    }
}