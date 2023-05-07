class Solution {
public:
    int countNegatives(vector<vector<int>>& mat) {
        int c=0;
        for(int i=0;i<mat.size();i++)
        {
            int n=mat[i].size();
            int low=0,high=n-1,ans1=-1,ans2=-1;
            while(low<=high)
            {
                int mid=(high-low)/2+low;
                if(mat[i][mid]<0)
                {
                    ans1=mid;
                   cout<<i<<" "<<mid<<", ";
                    high=mid-1;
                   
                }
                else if(mat[i][mid]>=0)
                     low=mid+1;
                    
                    
            }
            cout<<"\n";
        
        low=0;high=n-1;
        while(low<=high)
            {
                int mid=(high-low)/2+low;
                if(mat[i][mid]<0)
                {
                    ans2=mid;
                    low=mid+1;
                   
                }
                else if(mat[i][mid]>=0)
                     low=mid+1;
                    
                    
            }
            if(ans2==-1 && ans2==-1)
                c+=0;
       if(ans1!=-1 && ans2!=-1)
           c+=abs(ans2-ans1)+1;
           
                
        }
        return c;
        
    }
};