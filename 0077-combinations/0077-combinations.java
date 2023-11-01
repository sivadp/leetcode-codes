class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        for(int i=0;i<n-k+1;i++){
            List<Integer> curlist=new ArrayList<>();
            curlist.add(nums[i]);
            backtrack(nums,k,curlist,i);
        }
        return result;
    }
    private void backtrack(int[] nums,int k,List<Integer> curlist,int initial){
        if(curlist.size()==k){
            result.add(new ArrayList<>(curlist));
            return;
        }
        else{
            for(int i=initial+1;i<i+k-1&&i<nums.length;i++){
                curlist.add(nums[i]);
                backtrack(nums,k,curlist,i);
                curlist.remove(curlist.size()-1);
            }
        }
    }
}