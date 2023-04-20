class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int c=0;
        while( i<costs.length && coins>0)
        {
            coins-=costs[i++];
            if(coins>=0)
            c++;
            
        }
        return c;
        
    }
}