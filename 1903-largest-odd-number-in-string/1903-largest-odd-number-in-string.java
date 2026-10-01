class Solution {//string basic 
    public String largestOddNumber(String num) {
        int n=num.length()-1;
        int i=0;
        while(i<=n){
            if((num.charAt(n)-'0')%2!=0){
                return num.substring(0,n+1);
            }
            n--;
        }
    return "";
    }
}