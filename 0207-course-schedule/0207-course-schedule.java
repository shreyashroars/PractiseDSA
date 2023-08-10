class Solution {
    public boolean canFinish(int numCourses, int[][] preReq) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int n=preReq.length;
        int indeg[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<n;i++)
        {
           adj.get(preReq[i][1]).add(preReq[i][0]);
            indeg[preReq[i][0]]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indeg[i]==0)
                q.add(i);
        }
        int cnt=0;
        while(!q.isEmpty())
        {
            int u=q.poll();
            for(int v:adj.get(u))
            {
                if(indeg[v]>0)
                    indeg[v]--;
                if(indeg[v]==0)
                    q.add(v);
            }
            cnt++;
        }
        return cnt==numCourses;
        
        
        
    }
}