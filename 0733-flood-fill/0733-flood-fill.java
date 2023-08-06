class Pair
{
    int i,j;
    Pair(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<Pair>q=new LinkedList<>();
        int m=image.length;
        int n=image[0].length;
        int temp=image[sr][sc];
        image[sr][sc]=color;
        q.add(new Pair(sr,sc));
        if(color == temp) return image;
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int i=p.i;
            int j=p.j;
            if(i>0 && image[i-1][j]==temp)
            {
                image[i-1][j]=color;
                q.add(new Pair(i-1,j));
            }
            if(i<m-1 && image[i+1][j]==temp)
            {
                image[i+1][j]=color;
                 q.add(new Pair(i+1,j));
            }
            if(j>0 && image[i][j-1]==temp)
            {
                image[i][j-1]=color;
                 q.add(new Pair(i,j-1));
            }
            if(j<n-1 && image[i][j+1]==temp)
            {
                image[i][j+1]=color;
                 q.add(new Pair(i,j+1));
            }
        }
        return image;
        
    }
}