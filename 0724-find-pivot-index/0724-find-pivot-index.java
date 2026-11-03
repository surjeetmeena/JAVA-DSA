class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix=new int [nums.length];
        prefix[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int right=prefix.length-1;
        int left=0;
        if(prefix[left]==prefix[right]){
            return 0;
        }
        for(int j=1; j<prefix.length; j++){
             left=j-1;
            if(prefix[left]==(prefix[right]-prefix[j])){
                return j;
            }
        }
        return -1;
    }
}