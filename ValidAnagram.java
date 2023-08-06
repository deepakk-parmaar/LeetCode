import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();// character,count
        for (char ele : s.toCharArray()) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        for (char ele : t.toCharArray()) {
            if (map.isEmpty()) {
                return false;
            }
            if (map.getOrDefault(ele,0) == 1) {
                map.remove(ele);
            } else if(map.get(ele)!=null) {
                map.replace(ele, map.get(ele) - 1);

            }
        }

        return map.isEmpty();
    }
}