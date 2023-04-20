class Solution{
public int[] findOriginalArray(int[] changed) {
	if (changed.length % 2 == 1) return new int[0];

	Arrays.sort(changed);
	Map<Integer, Integer> freq = new HashMap<>();
	for (int num : changed) freq.put(num, freq.getOrDefault(num, 0) + 1);        

	int[] result = new int[changed.length / 2];
	int index = 0;

	for (int num : changed) {
		if (freq.get(num) <= 0) continue;
		freq.put(num, freq.get(num) - 1);
		int doubled = num * 2;
		if (!freq.containsKey(doubled) || freq.get(doubled) <= 0) return new int[0];
		freq.put(doubled, freq.get(doubled) - 1);
		result[index] = num;        
		index++;
	}

	return result;
}
}