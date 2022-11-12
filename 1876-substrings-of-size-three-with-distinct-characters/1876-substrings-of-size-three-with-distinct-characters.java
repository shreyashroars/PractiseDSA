class Solution {
   
     public int countGoodSubstrings(String s) {
    int cnt[] = new int[123], repeat = 0, res = 0;
    for(int i = 0; i < s.length(); ++i) {
        if(cnt[s.charAt(i)] == 1) repeat++;
        cnt[s.charAt(i)]++;
        if( i >= 3 ){
            if(cnt[s.charAt(i-3)] == 2) repeat--;
           cnt[s.charAt(i-3)]--;
        }
        if(i >= 2 && repeat == 0) res++;
    }    
    return res;
}
    }