class RandomizedSet {
    Set<Integer> s;
    List<Integer> ls;
    Random rd;

    public RandomizedSet() {
        s = new HashSet<Integer>();
        ls = new ArrayList<Integer>();
        rd = new Random();
        
    }
    
    public boolean insert(int val) {
        if(s.contains(val))
        {
            return false;
        }
        else
        {
            s.add(val);
            ls.add(val);
            return true;
        }
        
        
    }
    
    public boolean remove(int val) {
        if(s.contains(val))
        {
            s.remove(val);
            ls.remove(Integer.valueOf(val));
            return true;
        }
        else
            return false;
        
    }
    
    public int getRandom() {
        return ls.get(rd.nextInt(s.size()));
    }
}


