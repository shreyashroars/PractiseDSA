class Pair 
{
    String word;
    int steps;
    Pair(String w,int s)
    {
        word=w;
        steps=s;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String>h=new HashSet<>(wordList);
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        h.remove(beginWord);
        while(!q.isEmpty())
        {

            Pair p=q.poll();
            String word=p.word;
            int steps=p.steps;
            if(word.equals(endWord))
                return steps;
            for(int i=0;i<word.length();i++)
            {
            for(char ch='a';ch<='z';ch++)
            {
                char[]charArr=word.toCharArray();
                charArr[i]=ch;
                String newWord=new String(charArr);
                if(h.contains(newWord))
                {
                    h.remove(newWord);
                    q.add(new Pair(newWord,steps+1));
                }
            }
            }
        }
        return 0;
        
        
        
    }
}