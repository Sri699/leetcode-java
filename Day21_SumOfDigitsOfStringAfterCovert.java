class Solution {
    public int getLucky(String s, int k) {
        
        StringBuilder number = new StringBuilder();
        for (char x : s.toCharArray()) {
            number.append(x-96);
        }

        while (k > 0) {
            int temp = 0;
            for (char x : number.toString().toCharArray()) {
                temp += x - '0';  
            }
            number = new StringBuilder(String.valueOf(temp)); 
            k--;
        }
        return Integer.parseInt(number.toString()); 
    }
}
