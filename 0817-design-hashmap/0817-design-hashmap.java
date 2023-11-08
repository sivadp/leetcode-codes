
class MyHashMap {
    private static final int CAPACITY = 10003;
    private Entry[] table;

    class Entry{
        int key;
        int value;
        Entry next;
        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        table = new Entry[CAPACITY];
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        Entry entry = table[index];

        while(entry != null) {
            if(entry.key == key) {
                entry.value = value;
                return;
            }
            entry = entry.next;
        }

        Entry newEntry = new Entry(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
    }
    
    public int get(int key) {
        int index = hash(key);
        Entry entry = table[index];

        while(entry != null) {
            if(entry.key == key) {
                return entry.value;
            }
            entry = entry.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);
        Entry entry = table[index];
        Entry prev = null;

        while (entry != null) {
            if (entry.key == key) {
                if (prev == null) {
                    table[index] = entry.next; // Update the bucket's head if the key is at the head.
                } else {
                    prev.next = entry.next; // Update the previous entry's next pointer.
                }
                return;
            }
            prev = entry;
            entry = entry.next;
        }
    }

    private int hash(int key) {
        return key % CAPACITY; // A simple hash function using modulo.
    }
}