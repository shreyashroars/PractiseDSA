class Pair
{
    int i;
    int j;
    Pair(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==0)
                q.add(new Pair(i,j));
                else
                    mat[i][j]=-1; //unvisited
            }
        }
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int x=p.i;
            int y=p.j;
            if(x>0 && mat[x-1][y]==-1)
            {
                mat[x-1][y]=mat[x][y]+1;
                q.add(new Pair(x-1,y));
            }
            if(x<n-1 && mat[x+1][y]==-1)
            {
                mat[x+1][y]=mat[x][y]+1;
                q.add(new Pair(x+1,y));
            }
            if(y>0 && mat[x][y-1]==-1)
            {
                mat[x][y-1]=mat[x][y]+1;
                q.add(new Pair(x,y-1));
            }
            if(y<m-1 && mat[x][y+1]==-1)
            {
                mat[x][y+1]=mat[x][y]+1;
                q.add(new Pair(x,y+1));
            }
        }
        return mat;
        
    }
}