class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        int left=0;
        int right=n-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;

        }
        int low=0;
        int high=k-1;
        while(low<high){
            int t=nums[low];
            nums[low]=nums[high];
            nums[high]=t;
            low++;
            high--;
        }
        int beg=k;
        int end=n-1;
        while(beg<end){
            int tt=nums[beg];
            nums[beg]=nums[end];
            nums[end]=tt;
            beg++;
            end--;
        }

    
        
        
    }
}