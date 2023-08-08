class Solution {
    int n=0,m=0;
    public void dfs(int i,int j,char mat[][])
    {
        mat[i][j]='B';
        int dx[]={-1,1,0,0};
        int dy[]={0,0,-1,1};
        for(int k=0;k<4;k++)
        {
            int x=i+dx[k];
            int y=j+dy[k];
            if(x>=0 && x<=n-1 && y>=0 && y<=m-1 && mat[x][y]=='O')
                dfs(x,y,mat);
                
        }
    }
    public void solve(char[][] mat) {
         n=mat.length;
        m=mat[0].length;
        for(int i=0;i<n;i++)   
        {
            if(mat[i][0]=='O')
                dfs(i,0,mat);
        }
        for(int i=0;i<m;i++)
        {
            if(mat[0][i]=='O')
                dfs(0,i,mat);
        }
        for(int i=0;i<n;i++)
        {
            if(mat[i][m-1]=='O')
                dfs(i,m-1,mat);
        }
         for(int i=0;i<m;i++)
        {
            if(mat[n-1][i]=='O')
                dfs(n-1,i,mat);
        }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<m;j++)
        //     {
        //         System.out.print(mat[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]=='O')
                    mat[i][j]='X';
                if(mat[i][j]=='B')
                    mat[i][j]='O';
            }
        }
        
        
        
        
    }
}