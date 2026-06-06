class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(n<0){
            x=1/x;
            N=-(n);
        }
        return Pow(x,N);
    }
    public static double Pow(double x,long N){
        if(N==0) return 1;
        double half=Pow(x,N/2);
        if(N%2==0) return half*half;
        else return half*half*x; 
    }
}