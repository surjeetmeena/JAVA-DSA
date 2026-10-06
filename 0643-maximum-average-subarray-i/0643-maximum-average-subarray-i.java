class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int fsum=0;
        for(int i=0; i<k; i++){
            fsum=fsum+nums[i];


        }
        int max=fsum;
        int csum=fsum;
        int low=0;
        for(int i=k; i<nums.length; i++){
             csum=csum+nums[i]-nums[low]; 
            low++;
            max=Math.max(csum,max);
        }
        return (double)max/k;

    }
}