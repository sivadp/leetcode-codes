import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i:nums){
           int current=table.getOrDefault(i,0);
           table.put(i,current+1);
           count+=current;
        }
        return count;
    }
}