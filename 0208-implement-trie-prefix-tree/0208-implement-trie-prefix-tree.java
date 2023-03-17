class Trie {
   ArrayList<String>arr;
    public Trie() {
        arr=new ArrayList<>();
    }
    
    public void insert(String word) {
        arr.add(word);
    }
    
    public boolean search(String word) {
        return arr.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        for(int i=0;i<arr.size();i++)
        {
            if(prefix.length()<=arr.get(i).length())
            if(arr.get(i).substring(0,prefix.length()).equals(prefix))
                return true;
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */