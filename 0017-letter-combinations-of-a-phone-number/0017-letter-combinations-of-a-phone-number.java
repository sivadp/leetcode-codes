import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) {
            return Arrays.asList();
        }

        Map<Character, List<String>> mapper = new HashMap<>();
        mapper.put('2', Arrays.asList("a", "b", "c"));
        mapper.put('3', Arrays.asList("d", "e", "f"));
        mapper.put('4', Arrays.asList("g", "h", "i"));
        mapper.put('5', Arrays.asList("j", "k", "l"));
        mapper.put('6', Arrays.asList("m", "n", "o"));
        mapper.put('7', Arrays.asList("p", "q", "r", "s"));
        mapper.put('8', Arrays.asList("t", "u", "v"));
        mapper.put('9', Arrays.asList("w", "x", "y", "z"));

        List<String> resstr = new ArrayList<>();

        for (char digit : digits.toCharArray()) {
            if (resstr.isEmpty()) {
                resstr.addAll(mapper.get(digit));
            } else {
                List<String> curstr = new ArrayList<>();
                List<String> lister = mapper.get(digit);

                for (String str : resstr) {
                    for (String suffix : lister) {
                        curstr.add(str + suffix);
                    }
                }
                resstr = curstr;
            }
        }
        return resstr;
    }
}
