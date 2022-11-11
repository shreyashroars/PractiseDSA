class Solution {
    public int[] deckRevealedIncreasing(int[] d) {
     Arrays.sort(d);
		Queue<Integer> q = new LinkedList<>();
		for(int i = 0; i < d.length; i++) q.add(i);

		int [] ans = new int[d.length]; 
		for(int i = 0; i < d.length; i++){
			ans[q.poll()] = d[i];
			q.add(q.poll());
		}
		return ans;   
    }
}