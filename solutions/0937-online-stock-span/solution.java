class StockSpanner {
    ArrayList <Integer> sp = new ArrayList<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span_count = 0;
        sp.add(price);
        for(int i = sp.size()-1; i >= 0; i--){
            if(sp.get(i) <= price){
                span_count ++;
            }else break;
            
        }
        return span_count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
