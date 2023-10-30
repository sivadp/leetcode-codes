class Solution {
    public String simplifyPath(String path) {
        String[] arr=path.trim().split("/");
        StringBuilder sb=new StringBuilder();
        Stack<String> stk=new Stack<>();
        for(String s:arr){
            if(s.equals("")||s.equals(".")) continue;
            else if(s.equals("..")&&!stk.isEmpty()) stk.pop();
            else if(!s.equals("..")&&!s.equals(".")) stk.push(s);
        }
        if(stk.isEmpty()) return "/";
        for(String s:stk){
            if(!s.equals("")) sb.append("/"+s);
        }
        return sb.toString();
    }
}