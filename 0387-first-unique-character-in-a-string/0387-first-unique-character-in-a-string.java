class Solution {
    public int firstUniqChar(String s) {
      int mini=Integer.MAX_VALUE;
        for(char c='a'; c<='z';c++)
        {
            int y=s.indexOf(c);
            if(y!=-1 && y==s.lastIndexOf(c))
                mini=Math.min(mini,y);
        }
        return mini==Integer.MAX_VALUE?-1:mini;
    }
}