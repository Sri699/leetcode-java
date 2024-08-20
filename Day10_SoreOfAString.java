class Solution {
    public int scoreOfString(String s) {
        int sum=0,a,b;
        for(int i=1;i<s.length();i++)
        {
             a=(int)s.charAt(i-1);
             b=(int)s.charAt(i);
            sum=sum+(Math.abs(a-b));
        }
        return sum;
        
    }
}
