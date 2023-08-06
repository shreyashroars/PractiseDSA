class Solution {
    public boolean judgeCircle(String moves) {
        long s=0;
        for(int i=0;i<moves.length();i++)
        {
            char c=moves.charAt(i);
            if(c=='U')
                s+=1;
            else if(c=='L')
                s-=100000;
            else if(c=='R')
                s+=100000;
            else
                s-=1;
            //System.out.println(s);
        }
        return s==0;
        
    }
}