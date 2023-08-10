class Solution {
    public int[] findOrder(int V, int[][] preReq) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        int indeg[]=new int[V];
        for(int i=0;i<preReq.length;i++)
        {
            adj.get(preReq[i][1]).add(preReq[i][0]);
            indeg[preReq[i][0]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indeg[i]==0)
                q.add(i);
        }
        int ans[]=new int[V];
        Arrays.fill(ans,-1);
        int cnt=0;
        int j=0;
        while(!q.isEmpty())
        {
            int u=q.poll();
            ans[j++]=u;
            for(int v:adj.get(u))
            {
                if(indeg[v]>0)
                    indeg[v]--;
                if(indeg[v]==0)
                    q.add(v);
            }
            cnt++;
        }
       return cnt!=V?new int[0]:ans;
        
        
        
        
        
    }
}