class Solution {
    public int chalkReplacer(int[] chalk, int k) {
      
      // worst case
      
      // int i=0;
        // while(i<chalk.length)
        // {
        //     k-=chalk[i];
        //     if(k<0) return i;
        //     if(i==chalk.length-1){
        //         i=0;
        //         continue;
        //     }
        //     i++;
        // }
        // return i;

      // best case
      
      long s=0;  //Arrays.stream(chalk).sum();
        for (int i : chalk) {
            s += i;
        }
        k=(int)(k%s);
        for(int i=0;i<chalk.length;i++)
        {
            if(k<chalk[i]) return i;
            k-=chalk[i];
        }
        return 0;
    }
}
