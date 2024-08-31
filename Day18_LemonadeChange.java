class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten =0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5) five+=5;

            else if(bills[i]==20 )
            {
                if(ten>0) ten-=10;
                else five-=10;
                five-=5;      
            }
            else{
                ten+=10;
                five-=5;
            }
            if(five<0 || ten<0) return(false);
        }
        return(five>=0 && ten>=0);
    }
}
