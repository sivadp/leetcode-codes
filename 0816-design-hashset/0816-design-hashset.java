class MyHashSet {
    private List<Integer> lister;
    public MyHashSet() {
        lister=new ArrayList<>();
    }
    
    public void add(int key) {
        if(!lister.contains(key)){
        lister.add(key);
        }
    }
    
    public void remove(int key) {
        lister.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return lister.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */