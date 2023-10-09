//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int N = Integer.parseInt(br.readLine().trim());
			int [][] colors = new int[N][3];
			for(int i = 0; i < N; i++) {
				String [] str = br.readLine().trim().split(" ");
				colors[i][0] = Integer.parseInt(str[0]);
				colors[i][1] = Integer.parseInt(str[1]);
				colors[i][2] = Integer.parseInt(str[2]);
			}
			Solution obj = new Solution();
			out.println(obj.minCost(colors, N));
		}
		out.close();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    int rec(int ind,int colors[][],int n,int prev,int dp[][])
    {
        if(ind==n)
        return 0;
        if(prev!=0 && dp[ind][prev]!=-1)
        return dp[ind][prev];
        int take0=Integer.MAX_VALUE;
        int take1=Integer.MAX_VALUE;
        int take2=Integer.MAX_VALUE;
        if(prev!=1)
        {
        take0=colors[ind][0]+rec(ind+1,colors,n,1,dp);
        }
        if(prev!=2)
        {
        take1=colors[ind][1]+rec(ind+1,colors,n,2,dp);
        }
        if(prev!=3)
        {
        take2=colors[ind][2]+rec(ind+1,colors,n,3,dp);
        }
        return dp[ind][prev]=Math.min(take0,Math.min(take1,take2));
    }
	int minCost(int [][] colors, int n){
	    int dp[][]=new int[n][4];
	    for(int rows[]:dp)
	    Arrays.fill(rows,-1);
	    return rec(0,colors,n,0,dp);
        
    }
}