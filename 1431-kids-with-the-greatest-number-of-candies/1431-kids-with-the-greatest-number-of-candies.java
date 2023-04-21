class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=-1;
        List<Boolean>arr=new ArrayList<>();
        for(int x:candies)
        {
            max=Math.max(max,x);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
                arr.add(true);
            else
                arr.add(false);
                
        }
        return arr;
        
    }
}