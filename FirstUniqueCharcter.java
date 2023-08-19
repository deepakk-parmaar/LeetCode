import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        char arr[] = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        // idx,count
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
