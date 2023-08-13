class Solution {
    public int[] fairCandySwap(int[] arr1, int[] arr2) {
        int sum1=0,sum2=0;
        for(int x:arr1)
            sum1+=x;
        for(int y:arr2)
            sum2+=y;
        int change=(sum2-sum1)/2;
        HashSet<Integer>h=new HashSet<>();
        for(int x:arr2)
            h.add(x);
        for(int x:arr1)
        {
            if(h.contains(x+change))
                return new int[]{x,x+change};
        }
        throw null;
        
    }
}