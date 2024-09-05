class Solution {
    public double myPow(double x, int n) {
    
        double ans = 1.0;
        long nTemp = n;

        if(n < 0)
            nTemp = nTemp * -1;

        while(nTemp > 0){
            if(nTemp % 2 == 0){
                x *= x;
                nTemp /=2;
            }
            else{
                ans *= x;
                nTemp--;
            }
        }
        return n < 0 ? 1 / ans : ans;
    }
}
