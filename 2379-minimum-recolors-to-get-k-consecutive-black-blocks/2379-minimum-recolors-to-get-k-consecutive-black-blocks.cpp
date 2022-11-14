class Solution {
public:
    int minimumRecolors(string s, int k) {
         int n=s.length(),c=0,min=101;
     int i=0,j=0;
        while(j<n)
        {
            if(s[j]=='W')
                c++;
            if(j-i+1<k)
                j++;
            else if(j-i+1==k)
            {
               if(min>c)
                   min=c;
                if(s[i]=='W')
                    c--;
                i++;
                j++;
            }
        }
        return min;
    }
};