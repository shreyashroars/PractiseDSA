class Solution {
public:
    int findMaxbit(int x)
    {
        int no_ofbits=0;
        while(x>0)
        {
            x/=2;
            no_ofbits++;
        }
        return no_ofbits;
    }
    int findDuplicate(vector<int>& nums) {
        int duplNum=0;
        int n=nums.size()-1;
        int maxnum=0;
        for(int i=0;i<n;i++)
        {
            maxnum=max(maxnum,nums[i]);
        }
        int maxbits=findMaxbit(maxnum);
        for(int i=0;i<maxbits;i++)
        {
            int mask=1<<i;
            int base_cnt=0,nums_cnt=0;
            for(int j=0;j<=n;j++)
            {
                if((j&mask))
                    base_cnt++;
                if((nums[j]& mask))
                    nums_cnt++;
            }
            if(nums_cnt>base_cnt)
                duplNum|=mask;
            
        }
        return duplNum;
    }
};