class Solution {//using prefix sum + two nested loop but not optimal
    public int subarraySum(int[] nums, int k) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];

        for(int i=1; i<nums.length; i++){
        prefix[i]=prefix[i-1]+nums[i];

            
        }
        int sum=0;
        int count=0;
        for(int i=0; i<prefix.length; i++){
            int start=i;
            for(int j=start; j<prefix.length; j++){
                int end=j;
                if(start==0){
                    sum=prefix[end];
                    if(sum==k){
                        count++;
                    }
                    }else{
                        sum=prefix[end]-prefix[i-1];
                        if(sum==k){
                            count++;
                        }
                }
            }

        

    

        }
        return count;

        
    }
}