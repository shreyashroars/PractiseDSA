class Solution {
    public void dfs(int i,int j,int [][]mat,int n,int m)
    {
        mat[i][j]=0;
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        for(int k=0;k<4;k++)
        {
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0 && x<n && y>=0 && y<m && mat[x][y]==1)
                dfs(x,y,mat,n,m);
        }
    }
    public int numEnclaves(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            if(mat[i][0]==1)
                dfs(i,0,mat,n,m);
            if(mat[i][m-1]==1)
                dfs(i,m-1,mat,n,m);
        }
         for(int i=0;i<m;i++)
        {
            if(mat[0][i]==1)
                dfs(0,i,mat,n,m);
            if(mat[n-1][i]==1)
                dfs(n-1,i,mat,n,m);
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                if(mat[i][j]==1)
                    cnt++;
        }
        return cnt;
        
        
        
    }
}