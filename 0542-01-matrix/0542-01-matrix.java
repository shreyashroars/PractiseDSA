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
           int[] dx = {-1, 1, 0, 0};
           int[] dy = {0, 0, -1, 1};
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX >= 0 && newX < n && newY >= 0 && newY < m && mat[newX][newY] == -1)
                {
                    mat[newX][newY] = mat[x][y] + 1;
                    q.add(new Pair(newX, newY));
                }
            }
        }
        return mat;
        
    }
}