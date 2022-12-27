import java.util.* ;
import java.io.*; 
public class Solution {
    static int n,m;
    public static int maxCh(int i,int j1,int j2,int[][]mat,int[][][]dp)
    {
        if(j1<0||j1>=m||j2<0||j2>=m)
            return -1000000;
        if(i==n-1)
        {
            if(j1==j2)
                return mat[i][j1];
        else
            return mat[i][j1]+mat[i][j2];
        }
        if(dp[i][j1][j2]!=-1)
            return dp[i][j1][j2];
        int maxi=0;
        for(int dj1=-1;dj1<=1;dj1++)
        {
            for(int dj2=-1;dj2<=1;dj2++)
            {
                if(j1==j2)
                    maxi=Math.max(maxi,mat[i][j1]+maxCh(i+1,j1+dj1,j2+dj2,mat,dp));
                else
                  maxi=Math.max(maxi,mat[i][j1]+mat[i][j2]+maxCh(i+1,j1+dj1,j2+dj2,mat,dp));   
                    
            }
        }
        return dp[i][j1][j2]=maxi;
        
    }
	public static int cherryPickup(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        n=r;
        m=c;
        int [][][]dp=new int[r][c][c];
        for(int j=0;j<m;j++)
        {
            for(int k=0;k<m;k++)
            {
                if(j==k)
                    dp[n-1][j][k]=mat[n-1][j];
                else
                    dp[n-1][j][k]=mat[n-1][j]+mat[n-1][k];
            }
                
        }
        for(int i=n-2;i>=0;i--)
            for(int j1=0;j1<m;j1++)
                for(int j2=0;j2<m;j2++)
                {
          int maxi=0;
        for(int dj1=-1;dj1<=1;dj1++)
        {
            for(int dj2=-1;dj2<=1;dj2++)
            {
                int val=0;
                if(j1==j2)
                   val=mat[i][j1];
                else
                    val=mat[i][j1]+mat[i][j2];
                if(j1+dj1>=0 && j1+dj1<m&& j2+dj2>=0 && j2+dj2<m)
                val+=dp[i+1][j1+dj1][j2+dj2];
                else
                    val+=-10000000;
                  maxi=Math.max(maxi,val);   
                    
            }
        }
         dp[i][j1][j2]=maxi;
                }
        return dp[0][0][m-1];
        
	}
}