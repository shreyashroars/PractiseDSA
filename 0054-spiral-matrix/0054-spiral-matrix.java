class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int rowmin=0;
        int colmin=0;
        int rowmax=n-1;
        int colmax=m-1;
        int total_ele=n*m;
        int cnt=0;
        List<Integer>ans=new ArrayList<>();
        while(cnt<total_ele)
        {
            //topwall
            for(int i=colmin;i<=colmax && cnt<total_ele;i++)
            {
                ans.add(arr[rowmin][i]);
                cnt++;
            }
            rowmin++;
            //rigthwall
            for(int i=rowmin;i<=rowmax && cnt<total_ele;i++)
            {
                ans.add(arr[i][colmax]);
                cnt++;
            }
            colmax--;
            //bottomwall
            for(int i=colmax;i>=colmin && cnt<total_ele;i--)
            {
                ans.add(arr[rowmax][i]);
                cnt++;
            }
            rowmax--;
            for(int i=rowmax;i>=rowmin && cnt<total_ele;i--)
            {
                ans.add(arr[i][colmin]);
                cnt++;
            }
            colmin++;
        }
        return ans;
        
        
    }
}