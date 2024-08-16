class Solution {
    public void reverseString(char[] s) {
        int l=s.length-1,i;
        for(i=0;i<s.length/2;i++)
        {
            char temp=s[i];
            s[i]=s[l];
            s[l]=temp;
            l--;
        }
    }
}
