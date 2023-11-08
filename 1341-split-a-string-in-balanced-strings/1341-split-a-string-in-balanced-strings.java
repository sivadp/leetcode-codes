class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> stacker=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if(stacker.isEmpty()){
                stacker.push(ch);
            }
            else if(ch!=stacker.peek()){
                stacker.pop();
            }
            else{
                stacker.push(ch);
            }
            if(stacker.isEmpty())count++;
        }
        return count;
    }
}