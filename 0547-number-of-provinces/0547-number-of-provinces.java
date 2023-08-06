class Solution {
    public void DFS(int u,int arr[][],boolean vis[])
    {
        vis[u]=true;
        ArrayList<Integer>adj=new ArrayList<>();
        for(int v=0;v<arr.length;v++)
        {
            if(arr[u][v]==1 && u!=v)
                adj.add(v);
             
        }
        for(int v:adj)
        {
            if(!vis[v])
                DFS(v,arr,vis);
        }
    }
    public int findCircleNum(int[][] arr) {
        boolean vis[]=new boolean[arr.length];
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!vis[i])
            {
                DFS(i,arr,vis);
                cnt++;
            }
        }
        return cnt;
        
    }
}