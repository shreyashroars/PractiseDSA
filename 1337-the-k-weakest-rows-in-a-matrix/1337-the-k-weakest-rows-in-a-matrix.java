class Pair
{
    int val;
    int ind;
    Pair(int v,int i)
    {
        val=v;
        ind=i;
    }
    @Override
    public String toString()
    {
        return this.val+" "+this.ind;
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Pair ans[]=new Pair[mat.length];
        Comparator<Pair>comp=new Comparator<Pair>(){
            public int compare(Pair a,Pair b)
            {
                if(a.val>b.val)
                    return 1;
                else if(a.val<b.val)
                    return -1;
                else
                    return 0;
            }
        };
        int i=0;
        for(int rows[]:mat)
        {
            int res=-1;
            int low=0;
            int high=mat[0].length-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(rows[mid]==1)
                {
                    res=mid+1;
                    low=mid+1;
                }
                else if(rows[mid]==0)
                    high=mid-1;
            }
            ans[i]=new Pair(res,i); 
            i++;
        }
        System.out.println(Arrays.toString(ans));
        Arrays.sort(ans,comp);
        System.out.println(Arrays.toString(ans));
        int answer[]=new int[k];
        for(int j=0;j<k;j++)
        {
            answer[j]=ans[j].ind;
        }
        return answer;
       
    }
}