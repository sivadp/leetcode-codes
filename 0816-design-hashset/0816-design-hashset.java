class MyHashSet {
    private boolean[] setter;
    public MyHashSet() {
        setter=new boolean[1000001];
    }
    
    public void add(int key) {
        setter[key]=true;
    }
    
    public void remove(int key) {
        setter[key]=false;
    }
    
    public boolean contains(int key) {
        return setter[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */