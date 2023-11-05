class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4 || s.length() > 12) {
            return new ArrayList<>();
        }
        backtrack(s,0,new ArrayList<>());
        List<String> ipAddresses = new ArrayList<>();
        for (List<Integer> address : result) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                if (i != 0) {
                    sb.append('.');
                }
                sb.append(address.get(i));
            }
            ipAddresses.add(sb.toString());
        }

        return ipAddresses;
    }
    public void backtrack(String s, int i,List<Integer> currentList){
        if (i == s.length()) {
            if (currentList.size() == 4) {
                result.add(new ArrayList<>(currentList));
            }
            return;
        }
        if (currentList.size() == 4) {
            return;
        }
        currentList.add(Integer.parseInt(s.substring(i, i + 1)));
        backtrack(s, i + 1, currentList);
        currentList.remove(currentList.size() - 1);
         if (i + 1 < s.length() && s.charAt(i) != '0') {
            currentList.add(Integer.parseInt(s.substring(i, i + 2)));
            backtrack(s, i + 2, currentList);
            currentList.remove(currentList.size() - 1);
        }
        if (i + 2 < s.length() && s.charAt(i) != '0') {
            int num = Integer.parseInt(s.substring(i, i + 3));
            if (num <= 255) {
                currentList.add(num);
                backtrack(s, i + 3, currentList);
                currentList.remove(currentList.size() - 1);
            }
        }
    }
}