class Solution {
    public int missingNumber(int[] nums) {
        int i=0,j;
        int sum=0;
        for(j=0;j<nums.length;j++)
        {
            i+=j;
            sum+=nums[j];
        }
        i+=j;
        return i-sum;
        
    }
}
