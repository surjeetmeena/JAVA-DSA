class Solution {  //basic array 
    public int[] plusOne(int[] digits) {

        int n = digits.length - 1;
        while (n >= 0) {

            if (digits[n] + 1 != 10) {
                digits[n] = digits[n] + 1;
                return digits;

            } else {
                digits[n] = 0;
                n--;

            }
        }
            int digist2[] = new int[digits.length + 1];
            digist2[0] = 1;

            return digist2;

      
    }
}