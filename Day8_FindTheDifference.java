class Solution {
    public char findTheDifference(String s, String t) {
        int i=0,s1=0;
        for(i=0;i<s.length();i++)
        {
             s1+=(int)t.charAt(i);
             s1-=(int)s.charAt(i);
        }
        s1+=(int)t.charAt(i);
        return (char)s1;
    }
}
