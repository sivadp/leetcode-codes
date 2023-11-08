class Solution {
    public String restoreString(String s, int[] indices) {
        char[] resarr=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            resarr[indices[i]]=s.charAt(i);
        }
        return new String(resarr);
    }
}