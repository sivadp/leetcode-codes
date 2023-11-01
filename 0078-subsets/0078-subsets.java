class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        result.add(Arrays.asList());
        for(int i=0;i<nums.length;i++){
            List<Integer> curlist=new ArrayList<>();
            curlist.add(nums[i]);
            backtrack(nums,curlist,i);
        }
        return result;
    }
    private void backtrack(int[] nums,List<Integer> curlist,int lastind){
        result.add(new ArrayList<>(curlist));
        if(lastind==nums.length-1){
            return;
        }
        for(int i=lastind+1;i<nums.length;i++){
            curlist.add(nums[i]);
            backtrack(nums,curlist,i);
            curlist.remove(curlist.size()-1);
        }
    }
}