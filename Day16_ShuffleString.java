class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuffer stri = new StringBuffer(s);
        for(int i=0;i<s.length();i++)
        {
            stri.delete(indices[i],indices[i]+1);
            stri.insert(indices[i],s.charAt(i));
        } 
        return stri.toString();
    }
}
