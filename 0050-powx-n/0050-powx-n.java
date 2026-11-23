class Solution {//recursion +math good question
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            N=-N;
            
        }
        double ans= ch(x,N);
        return n<0?1/ans:ans;

    }
    public static double ch(double x,long n){

        if(n==0){
            return 1;
        }
         double half=ch(x,n/2);
        if(n%2==0){
         return half*half;
        }else{
            
            return half*half*x;
        }
        
    }
      

    
    
}