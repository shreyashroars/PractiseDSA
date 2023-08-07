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
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        //ArrayList<Pair>arr=new ArrayList<>();
        int total_oranges=0,rotten_oranges=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j));
                    rotten_oranges++;
                }
                if(grid[i][j]!=0)
                    total_oranges++;
                    
                    
            }
        }
        int cnt=0;
        if(rotten_oranges==total_oranges)
                return cnt;
        while(!q.isEmpty())
        {
            int size=q.size();
            cnt++;
            for(int i=0;i<size;i++)
            {
                
                Pair p=q.poll();
                if(p.i>0 && grid[p.i-1][p.j]==1)
                {
                q.add(new Pair(p.i-1,p.j));
                grid[p.i-1][p.j]=2;
                    rotten_oranges++;
                }
                if(p.i<n-1 && grid[p.i+1][p.j]==1)
                {
                q.add(new Pair(p.i+1,p.j));   //neeche
                grid[p.i+1][p.j]=2;
                    rotten_oranges++;
                }
                if(p.j>0 && grid[p.i][p.j-1]==1)
                {
                q.add(new Pair(p.i,p.j-1)); //Baaye
                grid[p.i][p.j-1]=2;
                    rotten_oranges++;
                }
                if(p.j<m-1 && grid[p.i][p.j+1]==1)
                {
                q.add(new Pair(p.i,p.j+1)); //Daaye
                grid[p.i][p.j+1]=2;
                    rotten_oranges++;
                }
                
            }
            if(rotten_oranges==total_oranges)
                return cnt;
             
        }
            return -1;
        
    }
}