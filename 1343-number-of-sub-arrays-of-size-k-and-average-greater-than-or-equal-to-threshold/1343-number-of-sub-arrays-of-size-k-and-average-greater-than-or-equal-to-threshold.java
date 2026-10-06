class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int ans=0;
        for(int i=0; i<k; i++){
            sum=sum+arr[i];
        }
        if(sum/k>=threshold){
            ans++;

        }
        int cur=sum;
        //int max=sum;
        int low=0;
        for(int i=k; i<arr.length; i++){
            cur=cur+arr[i]-arr[low];
            if(cur/k>=threshold){
                ans++;
            }
            low++;
        }
        return ans;
    }
}