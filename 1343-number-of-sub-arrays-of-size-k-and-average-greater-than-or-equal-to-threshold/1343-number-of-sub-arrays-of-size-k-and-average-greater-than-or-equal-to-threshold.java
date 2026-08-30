class Solution { //sliding window array
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int average=0;
        int count=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        average=sum/k;
        if(average>=threshold){
            count++;
        }
        int low=1;
        int high=k;
        int n=arr.length;
        while(high<n){
            sum=sum+arr[high]-arr[low-1];
             average=sum/k;
            if(average>=threshold){
                count++;
            }
            low++;
            high++;
        }
        return count;

    }
}