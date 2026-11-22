class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int f=-1;
        int l=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                l=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        int start=0;
        int end=n-1;
                while(start<=end){
            int mid2=start+(end-start)/2;
            if(nums[mid2]==target){
                
                f=mid2;
            end=mid2-1;
    
            }
            else if(nums[mid2]<target){
                start=mid2+1;
            }
            else{
                end=mid2-1;
            }
                }


        return new int[]{f,l};
    }
}