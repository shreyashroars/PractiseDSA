class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(int i=0;i<moves.length();i++)
        {
            char c=moves.charAt(i);
            if(c=='U')
                y++;
            else if(c=='L')
                x--;
            else if(c=='R')
                x++;
            else
                y--;
            //System.out.println(s);
        }
        return x==0 && y==0;
        
    }
}