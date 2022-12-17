class Solution {
    public String decodeMessage(String key, String message) {
     
        HashMap<Character, Character>map = new HashMap<>();
       
        int k=0;        
        for(int i=0;i<key.length();++i){
            if(key.charAt(i)==' ')  continue;
            if(map.get(key.charAt(i))==null)
                map.put(key.charAt(i), (char)('a'+ k++));
           }
        
        StringBuilder ans = new StringBuilder();
            
        for(int i=0;i<message.length();++i){
            char ch = message.charAt(i);            
            if(ch == ' '){ 
                ans.append(' ');
                continue;
            }
            ans.append(map.get(ch));
        }       
        return ans.toString();
    }
}