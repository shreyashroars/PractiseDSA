class Solution {
    public int reverse(int x) {
        int rev=0,prev_rev=0;
        int t=x;
        if(x<0)
            x=-x;
        while(x>0)
        {
            int r=x%10;
             rev=rev*10+r;
            if((rev-r)/10!=prev_rev)
                return 0;
            prev_rev=rev;
            x=x/10;
        }
        return t<0?-rev:rev;
        
    }
}