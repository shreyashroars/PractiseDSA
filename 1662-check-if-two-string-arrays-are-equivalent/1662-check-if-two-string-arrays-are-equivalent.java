class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="",t="";
        for(String x:word1)
            s+=x;
         for(String x:word2)
            t+=x;
        return s.equals(t);
    }
}