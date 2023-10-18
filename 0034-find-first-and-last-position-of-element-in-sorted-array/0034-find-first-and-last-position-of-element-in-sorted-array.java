class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int[] result={-1,-1};
        if(nums.length==1&&nums[0]==target){
            return new int[] {0,0};
        }
        else if(nums.length==1&&nums[0]!=target){
            return result;
        }
        while(left<=right){
            if(nums[left]==target){
                result[0]=left;
            }
            if(nums[right]==target){
                result[1]=right;
            }
            if(result[0]!=-1&&result[1]!=-1){
                return result;
            }
            if(result[0]!=-1){
            right--;
            }
            else{
            left++;
            }
        }
        return result;
    }
}