class Solution {
    public int divisorSubstrings(int num, int k) {
       int y=(int)Math.pow(10,k-1);
        int org=num;
        int c=0;
        while(num/y>0)
        {
            int r=num%(y*10);
            if(r!=0 && org%r==0)
                c++;
            num=num/10;
        }
        return c;
    }
}