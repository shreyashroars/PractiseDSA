class Solution {
    public int minimumRecolors(String s, int k) {
        int n=s.length(),c=0,min=101;
        char ch[]=s.toCharArray();
     int i=0,j=0;
        while(j<n)
        {
            if(ch[j]=='W')
                c++;
            if(j-i+1<k)
                j++;
            else if(j-i+1==k)
            {
                min=Math.min(min,c);
                if(ch[i]=='W')
                    c--;
                i++;
                j++;
            }
        }
        return min;
    }
}