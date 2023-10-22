class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,new ArrayList<>(),0,0,result);
        return result;
    }
    private static void  backtrack(int[] candidates, int target,List<Integer> currentList,int start,int sum, List<List<Integer>> result){
        if(sum==target){
            result.add(new ArrayList<>(currentList));
            return;
        }
        else if(sum>target){
            return;
        }
        else{
            for(int i=start;i<candidates.length;i++){
                if(i>start&&candidates[i]==candidates[i-1]){
                    continue;
                }
                currentList.add(candidates[i]);
                sum+=candidates[i];
                backtrack(candidates,target,currentList,i+1,sum,result);
                sum-=candidates[i];
                currentList.remove(currentList.size()-1);
            }
        }
    }
}