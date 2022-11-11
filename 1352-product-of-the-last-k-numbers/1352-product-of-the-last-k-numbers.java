class ProductOfNumbers {
     List<Integer> prefix;

    public ProductOfNumbers() {
        this.prefix = new ArrayList<>();
    }
    
    public void add(int num) {
        if (num == 0)
            prefix.clear();
        else {
            if (prefix.size() == 0)
                prefix.add(num);
            else
                prefix.add(num * prefix.get(prefix.size() - 1));
        }
    }
    
    public int getProduct(int k) {
        int n = prefix.size();
        
        if (k > n)
            return 0;
        
        else if (k == n)
            return prefix.get(k - 1);
        
        return prefix.get(n - 1) / prefix.get(n - k - 1);
    }
}