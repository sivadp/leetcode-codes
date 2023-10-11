class Solution {
    public int removeElement(int[] nums, int val) {
        int firstlen=nums.length;
        int i,j;
        for(i=0,j=0;i<firstlen;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        int[] newArray = new int[j];
        System.arraycopy(nums,0,newArray,0,j);
        nums=newArray;
        return nums.length;
    }
}