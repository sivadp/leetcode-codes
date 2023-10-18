class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        int result=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                result=mid;
                break;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(left>right){
            result=left;
        }
        return result;
    }
}