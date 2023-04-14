class Solution {
    public int numDistinct(String s1, String s2) {
       int n1 = s1.length();
        int n2 = s2.length();
        int[] prev = new int[n2+1];
        int[] curr = new int[n2+1];
        prev[0] = curr[0] = 1;
        
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    curr[j] = prev[j-1] + prev[j];
                } else {
                    curr[j] = prev[j];
                }
            }
            prev = curr.clone();
        }
        
        return prev[n2];




        
    }
}