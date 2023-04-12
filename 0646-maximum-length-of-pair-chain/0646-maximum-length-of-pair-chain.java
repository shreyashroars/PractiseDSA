class Solution {
    public int findLongestChain(int[][] pairs) {
        if(pairs.length==1)
            return 1;
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
      for(int i=0;i<pairs.length;i++)
   {
      System.out.println(pairs[i][0]+" "+pairs[i][1]);
   }
         int cur = -10000, ans = 0;
        for (int[] pair: pairs) if (cur < pair[0]) {
            cur = pair[1];
            ans++;
        }
        return ans;
       
            
        
        
    }
}