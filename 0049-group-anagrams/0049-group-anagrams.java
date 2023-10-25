class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mapper=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] temparr=strs[i].toCharArray();
            Arrays.sort(temparr);
            String stdstr=new String(temparr);
            if(mapper.containsKey(stdstr)){
                List<String> lister=mapper.get(stdstr);
                lister.add(strs[i]);
                mapper.put(stdstr,lister);
            }
            else{
                List<String> lister=new ArrayList<>();
                lister.add(strs[i]);
                mapper.put(stdstr,lister);
            }
        }
        return new ArrayList<>(mapper.values());
    }
}