class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n=score.length;
        int arr[]=new int[n];
        // for(int i=0;i<n;i++)
        //     arr[i]=score[i][k];
        // Arrays.sort(arr,Collections.reverseOrder());
        TreeMap<Integer,Integer>h=new TreeMap<>(Collections.reverseOrder());
                for(int i=0;i<n;i++)
                    h.put(score[i][k],i);
        int l=0;
        for(Map.Entry<Integer,Integer>e:h.entrySet())
            arr[l++]=e.getValue();
        int res[][]=new int[n][score[0].length];
        for(int i=0;i<n;i++)
            for(int j=0;j<score[0].length;j++)
            res[i][j]=score[arr[i]][j];
        return res;
            
        
    }
}