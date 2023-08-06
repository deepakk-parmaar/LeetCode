import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        if (digits.length() == 0) {
            return ans;
        }
        String mapping[] = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        ans.add("");
        int anslength = 0; // determines the length of strings in the ans list
        for (char digit : digits.toCharArray()) {
            int idx = Character.getNumericValue(digit);
            while (ans.peek().length() == anslength) {
                String curr = ans.poll();
                for (char map : mapping[idx].toCharArray()) {
                    ans.add(curr + map);
                }
            }
            anslength++;
        }
        return ans;
    }
}