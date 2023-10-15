class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return Arrays.asList();
        }
        Map<String,List<String>> mapper=new HashMap<>();
        mapper.put("2",Arrays.asList("a","b","c"));
        mapper.put("3",Arrays.asList("d","e","f"));
        mapper.put("4",Arrays.asList("g","h","i"));
        mapper.put("5",Arrays.asList("j","k","l"));
        mapper.put("6",Arrays.asList("m","n","o"));
        mapper.put("7",Arrays.asList("p","q","r","s"));
        mapper.put("8",Arrays.asList("t","u","v"));
        mapper.put("9",Arrays.asList("w","x","y","z"));
        String[] arrdigits=digits.split("");
        List<String> resstr=new ArrayList<>();
        for(int i=0;i<arrdigits.length;i++){
            if(resstr.size()==0){
                resstr.addAll(mapper.get(arrdigits[i]));
                continue;
            }
            List<String> curstr=new ArrayList<>();
            List<String> lister=mapper.get(arrdigits[i]);
            for(int j=0;j<resstr.size();j++){
                for(int k=0;k<lister.size();k++){
                    String str=resstr.get(j)+lister.get(k);
                    curstr.add(str);
                }
            }
            resstr=curstr;
        } 
        System.out.println(resstr);
        return resstr;
    }
}