class Solution {//prefix sum but not optimal 
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        int ans = 0;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

        }
        int length = 0;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {

                length = (j - i) + 1;
                if (length % 2 != 0) {

                    if (start == 0) {
                        ans += prefix[j];
                    } else {

                        ans = ans + (prefix[j] - prefix[i - 1]);

                    }

                }

            }
        }
        return ans;
    }
}