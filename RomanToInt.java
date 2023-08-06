import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int last = Integer.MIN_VALUE;
        int ans = 0;
        char arr[] = s.toCharArray();
        for (int i = arr.length - 1; i >= 0;i--) {
            int curr = map.get(arr[i]);
            if (curr < last) {
                ans -= curr;
            } else {
                ans += curr;
            }
            last = curr;
        }
        return ans;
    }
}