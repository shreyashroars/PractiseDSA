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
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<c;k++)
                {
                    dp[i][j][k]=-1;
                }
            }
        }
	  return maxCh(0,0,c-1,mat,dp);
	}
}