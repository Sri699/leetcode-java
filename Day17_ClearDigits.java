class Solution {
    public String clearDigits(String s) {
         StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
                sb.deleteCharAt(sb.length()-1);
              
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
