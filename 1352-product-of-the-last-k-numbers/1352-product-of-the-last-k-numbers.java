class ProductOfNumbers {
    
         ArrayList<Integer> list=new ArrayList<>(); 

    public ProductOfNumbers() {
         
    }
    
    public void add(int num) {
         list.add(num); 
    }
    
    public int getProduct(int k) {
         if (k>list.size())
        { 
            return 0; 
        }
         int p=1; 
          for (int i=list.size()-k;i<list.size();i++)
        {        
           p*=list.get(i); 
        }
               return p; 
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */