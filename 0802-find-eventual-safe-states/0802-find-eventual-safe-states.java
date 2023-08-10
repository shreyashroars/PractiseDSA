class Solution {
  
    public boolean dfs(int u, List<List<Integer>>adj,boolean vis[],boolean pathVis[])
    {
        vis[u]=true;
        pathVis[u]=true;
        for(int v:adj.get(u))
        {
            if(!vis[v])
            {
                if(dfs(v,adj,vis,pathVis)==true)
                    return true;
            }
            else if(pathVis[v])
            {
                // start=v;
                // end=u;
                return true;
            }
        }
        pathVis[u]=false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>>adj=new ArrayList<>();
        int n=graph.length;
        for(int i=0;i<n;i++)
        {
            List<Integer>arr=new ArrayList<>();
            for(int j=0;j<graph[i].length;j++)
            {
                arr.add(graph[i][j]);
            }
            adj.add(arr);
        }
        boolean vis[]=new boolean[n];
         boolean pathVis[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            dfs(i,adj,vis,pathVis);
               // break;
        }
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(pathVis[i]==false)
                ans.add(i);        
        }
        return ans;
        
    }
}