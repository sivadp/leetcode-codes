class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }
            else{
                return -1;
            }
        }
        else{
            int left=0,right=nums.length-1;
            if(target<nums[0]){
                while(right>left&&nums[right-1]<nums[right]){
                    if(nums[right]==target){
                        return right;
                    }
                    right--;
                }
                if(nums[right]==target){
                    return right;
                }
                else{
                    return -1;
                }
            }
            else{
                while(right>left&&nums[left]<nums[left+1]){
                    if(nums[left]==target){
                        return left;
                    }
                    left++;
                }
                if(nums[left]==target){
                    return left;
                }
                else{
                    return -1;
                }
            }

        }
    }
}