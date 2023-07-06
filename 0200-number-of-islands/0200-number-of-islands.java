class Solution {
     public void DFSRec(int i,int j,char grid[][],boolean[][]visited)
    {
        if(i<0 ||j<0 ||i>=grid.length||j>=grid[0].length||visited[i][j]==true||grid[i][j]=='0')
        return;
        visited[i][j]=true;
        DFSRec(i-1,j,grid,visited);//North
        DFSRec(i,j+1,grid,visited);//East
        DFSRec(i+1,j,grid,visited);//South
        DFSRec(i,j-1,grid,visited);//West
        // DFSRec(i-1,j-1,grid,visited);//NW
        // DFSRec(i-1,j+1,grid,visited);//NE
        // DFSRec(i+1,j-1,grid,visited);//SW
        // DFSRec(i+1,j+1,grid,visited);//SE
        
    }
    public int numIslands(char[][] grid) {
        boolean[][]visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(!visited[i][j] && grid[i][j]=='1')
                {
                    DFSRec(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
        
        
    }
}