class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int pairs[] = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>(); 
         for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int mapped_n=0;
            int base =1;
            if(n==0)
            {
                mapped_n=mapping[n];
            }
            while(n>0){
                int digit=n%10;
                n=n/10;
                mapped_n+=base*mapping[digit];
                base*=10;
            }
            map.put(i,mapped_n);
         }
         Map<Integer,Integer> nmap = sortByValue(map);
         for(int i=0;i<nums.length;i++)
         {
            pairs[i]=nums[nmap[i]];
         }
        return pairs;
    }
}
