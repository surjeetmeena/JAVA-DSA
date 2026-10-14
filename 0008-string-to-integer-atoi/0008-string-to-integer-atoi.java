class Solution {//lenthi h bahut 
    public int myAtoi(String s) {
        int i=0; 
        int n=s.length();
        long sum=0; 
        int sign=1;
         while(i<n&&s.charAt(i)==' '){
            i++;
         }
         if(i<n&&s.charAt(i)=='-'){
            sign=-1;
            i++;
         }
         else if(i<n&&s.charAt(i)=='+'){
            sign=1;
            i++;
         }
         while(i<n){
            int digit=s.charAt(i)-'0';
            if(digit>=0&&digit<=9){
                sum=sum*10+digit;
            if(sum*sign>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sum*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
            }else{
                break;
            }

         }
         return (int)(sum*sign);
    }
}