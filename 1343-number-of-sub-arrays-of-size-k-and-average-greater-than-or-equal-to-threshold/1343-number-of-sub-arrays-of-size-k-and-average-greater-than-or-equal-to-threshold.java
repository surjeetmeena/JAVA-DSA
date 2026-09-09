class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];

        }
        int avg = sum / k;
        if (avg >= threshold) {
            count++;
        }
        int high=k;
        int low=1;
        while(high<arr.length){
            sum=sum+arr[high]-arr[low-1];
            avg=sum/k;
            if(avg>=threshold){
                count++;
            }
                low++;
                high++;
        }
        return count;

    }
}