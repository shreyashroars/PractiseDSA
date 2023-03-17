class Solution {
public:
    string reversePrefix(string word, char ch) {
        string h="";
        int n=word.length();
        int j;
        for(j=0;j<n;j++)
            if(word[j]==ch)
                break; 
        if(j==n)
            return word;
        for(int i=0;i<=j/2;i++)
           swap(word[i],word[j-i]);  
         return word;
        
    }
};