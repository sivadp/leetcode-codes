class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,maxWater=0;
        while(left<right){
            int leftHeight=height[left];
            int rightHeight=height[right];
            int maxHeight=Math.min(leftHeight,rightHeight);
            int currentWater=maxHeight*(right-left);
            maxWater=Math.max(maxWater,currentWater);
            if(leftHeight<rightHeight){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}