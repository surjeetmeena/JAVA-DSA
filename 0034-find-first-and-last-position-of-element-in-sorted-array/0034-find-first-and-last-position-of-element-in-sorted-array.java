class Solution {//binary search good foundation question
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int first=-1;
        int last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                first=mid;
                right=mid-1;

            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }

        }
        int low=0;
        int high=n-1;
        while(low<=high){
            int midd=low+(high-low)/2;
            if(nums[midd]==target){
                last=midd;
                low=midd+1;
            }else if(nums[midd]>target){
                high=midd-1;
            }else{
                low=midd+1;
            }
        }
        return new int[]{first,last};
        
    }
}