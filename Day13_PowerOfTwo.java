// space complexity : O(n)
// time complexity  : O(logN)
class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=1,j=0;
        while(i<=n && j<=31)
        {
            if(i==n) return(true);
            i=i*2;
            j++;
        }
        return(false);
    }
}

// space complexity : O(n)
// time complexity  : O(logN)
class Solution {
    public boolean isPowerOfTwo(int n) {
     if(n<=0) return(false);
     while(n%2==0)
     {
        n/=2;
     }
     return(n==1);
    }
}

