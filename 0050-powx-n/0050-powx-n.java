class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            N=-N;
        }
        double ans=solve(x,N);
        if(n<0){
            return 1/ans;
        }else{
            return ans;
        }
    }
    double solve(double x,long N){
        if(N<=0){
            return 1;
        }
        double half =solve(x,N/2);
        if(N%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
}