class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted=Arrays.copyOf(nums,nums.length);
        Arrays.sort(sorted);
        HashMap<Integer,Integer> mapper=new HashMap<>();
        for(int i=0;i<sorted.length;i++){
            mapper.put(sorted[i],i);
            while(i+1<sorted.length&&sorted[i]==sorted[i+1]){
                i++;
            }
        }
        int[] result=new int[sorted.length];
        for(int i=0;i<sorted.length;i++){
            result[i]=mapper.get(nums[i]);
        }
        return result;
    }
}