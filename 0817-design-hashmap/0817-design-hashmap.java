class MyHashMap {
    private int[] mapper;
    public MyHashMap() {
        mapper=new int[1000001];
        Arrays.fill(mapper,-1);
    }
    
    public void put(int key, int value) {
        mapper[key]=value;
    }
    
    public int get(int key) {
        return mapper[key];
    }
    
    public void remove(int key) {
        mapper[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */