class Solution {//two pointer
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int [n];
        int left=0;
        int rigth=1;

        for(int i=0; i<n; i++){
            if(nums[i]>=0){
                ans[left]=nums[i];
                left+=2;
            }else{
                ans[rigth]=nums[i];
                rigth+=2;
            }

        }
        return ans;
    }
}