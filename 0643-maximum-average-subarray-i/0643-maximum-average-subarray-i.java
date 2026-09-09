class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
    
        for(int i=0; i<k; i++){
            sum=sum+nums[i];
           // avg=sum/k;


        }
        int n=nums.length;
        int high=k;
        int low=1;
        int max=sum;
        int current=sum;
        while(high<n){
            
           current =current+nums[high]-nums[low-1];
            max=Math.max(max,current);
          
            high++;
            low++;
        }
        
        return (double)max/k;
    }
}