class Trie {
public:
     vector<string>arr;   
    Trie() {
     
    }
    
    void insert(string word) {
        arr.push_back(word);
    }
    
    bool search(string word) {
        if(find(arr.begin(),arr.end(),word)!=arr.end())
            return true;
        return false;
    }
    
    bool startsWith(string prefix) {
        for(int i=0;i<arr.size();i++)
            if(arr[i].length()>=prefix.length())
            {
            if(arr[i].substr(0,prefix.length())==prefix)
                return true;
            }
        return false;
    }
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */