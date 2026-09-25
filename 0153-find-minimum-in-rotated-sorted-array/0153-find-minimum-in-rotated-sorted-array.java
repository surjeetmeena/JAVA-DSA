class Solution {
    public int findMin(int[] nums) {//i solved this binary search in 28 mint
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            min=Math.min(min,nums[mid]);
            if(nums[left]>nums[mid]&&nums[right]>nums[mid]){
                right=mid-1;
            }
            
           else if(nums[left]<=nums[mid]&&nums[right]>=nums[mid]){
                right=mid-1;


            }else{
                left=mid+1;
            }
            
        }
        return min;
    }
}