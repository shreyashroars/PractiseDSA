class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int cnt[]=new int[26];
       int ans=0;
        int max=0;
        while(j<s.length())
        {
            int y=s.charAt(j)-'A';
            cnt[y]++;
            //get the most frequent character
            for(int l=0;l<26;l++)
            {
                if(cnt[max]<cnt[l])
                    max=l;
            }
            int count=j-i+1-cnt[max];
            if(count<=k)
                ans=Math.max(ans,j-i+1);
            else if(count>k)
            {
                int z=s.charAt(i)-'A';
                cnt[z]--;
                    i++;
            }
            j++;
            
    }
        return ans;
}
}