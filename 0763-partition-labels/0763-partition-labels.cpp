class Solution {
public:
    vector<int> partitionLabels(string s) {
     unordered_map<char,int>h;
        for(int i=0;i<s.length();i++)
            h[s[i]]=i;
        vector<int>arr;
        int maxi=-1,prev=-1;
        for(int i=0;i<s.length();i++)
        {
            maxi=max(maxi,h[s[i]]);
            if(maxi==i)
            {
                arr.push_back(maxi-prev);
                prev=maxi;
            }
        }
        return arr;
    }
};