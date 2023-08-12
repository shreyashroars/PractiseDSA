class Solution {
    public int totalFruit(int[] s) {
        int i=0;
		int j=0;
		int ans=0;
		HashMap<Integer,Integer>map=new HashMap<>();
		while(j<s.length)
		{
			int x=s[j];
			map.put(x,map.getOrDefault(x,0)+1);
			if(map.size()<=2)
			{
				ans=Math.max(ans,j-i+1);
			}
			else if(map.size()>2)
			{
				while(map.size()>2)
				{
					int y=s[i];
					if(map.get(y)>1)
					map.put(y,map.getOrDefault(y,0)-1);
					else
					map.remove(y);
					i++;
				}
			}
			j++;

		}
		return ans;
        
    }
}