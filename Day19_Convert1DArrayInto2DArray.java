class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int a[][] = new int[m][n];
        int k=0;
        if(m*n!=original.length) return new int[0][0];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=original[k];
                k++;  
            }
        }
        return a;  
    }
}
