class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> f =new HashMap<>();
        Integer [] newNums = new Integer[nums.length];

        for(int i=0; i<nums.length;i++){
            f.put(nums[i], f.getOrDefault(nums[i],0)+1);
            newNums[i]=nums[i];
        }
        
        Arrays.sort(newNums, (n1,n2) ->{
            if (f.get(n1) != f.get(n2)){
                return f.get(n1)-f.get(n2);
            }
            else{
                return n2-n1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }

        return nums;
        }
    }
