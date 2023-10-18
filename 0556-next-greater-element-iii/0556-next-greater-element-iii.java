class Solution {
    public int nextGreaterElement(int n) {
        String str=Integer.toString(n);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = Character.getNumericValue(str.charAt(i));
        }
        if(digits.length==1){
            return -1;
        }
        int i=digits.length-2;
        while(i>=0&&digits[i]>=digits[i+1]){
            i--;
        }
        if(i==-1){
            return -1;
        }
        int j=digits.length-1;
        while(digits[i]>=digits[j]){
            j--;
        }
        swap(digits,i,j);
        reverse(digits,i+1);
        long result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        if(result>Integer.MAX_VALUE){
            return -1;
        }
        else return (int)result;
    }
    private void swap(int[] digits,int i,int j){
        int temp=digits[i];
        digits[i]=digits[j];
        digits[j]=temp;
    }
    private void reverse(int[] digits,int i){
        int right=digits.length-1;
        while(i<right){
            swap(digits,i,right);
            i++;
            right--;
        }
    }
}