class Solution {
public:
    int bs(vector<int>&arr,int l,int h,int target)
    {
        if(l>h)
            return -1;
        int mid=(h-l)/2+l;
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]>=target)
         return bs(arr,l,mid-1,target);
        else
        return bs(arr,mid+1,h,target);
    }
    int search(vector<int>& arr, int target) {
        int n=arr.size();
        int high=n-1;
        int low=0;
        int l,h;
        l=0,h=0;
        while(low<=high)
        {
            int mid=(high-low)/2+low;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            if(arr[mid]<=arr[next]&& arr[mid]<=arr[prev])
            {
                cout<<"l= "<<mid<<endl;
                l=mid;
                break;
            }
            else if(arr[mid]<=arr[high])
                high=mid-1;
            else if(arr[mid]>=arr[low])
                low=mid+1;        
        }
       int x= bs(arr,0,l-1,target);
      int y=  bs(arr,l,n-1,target);
        cout<<x<<" "<<y;
        if(x==y==-1)
            return -1;
       return x!=-1?x:y;
      
    }
};