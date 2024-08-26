class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        digits[n]+=1;
        int m=digits[n];
        while(n>=0 && m==10){
            if(n==0){
                digits = new int[digits.length+1];
                digits[n]=1;
                return(digits);
            } 
            else{
                digits[n-1]+=1;
            }
            digits[n]=0;
            n--;
            m=digits[n];
        }
        return(digits);
        
    }
}
