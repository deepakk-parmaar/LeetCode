import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int i : asteroids) {
            if (!st.isEmpty() && i < 0 && i < st.peek()&&i*st.peek()<0) {
                int check = 0;
                while (!st.isEmpty() && i < 0 && i < st.peek()&&i*st.peek()<0) {
                    if (st.peek() == Math.abs(i)) {
                        st.pop();
                        check = 1;
                        break;
                    } else {
                        int sign = st.pop();
                        int top = Math.max(sign, Math.abs(i));
                        top = sign == top ? sign : i;
                        i = top;
                    }
                }
                if (check == 0) {
                    st.push(i);
                }
            } else {
                st.push(i);
            }
        }
        int ans[] = new int[st.size()];
        int idx = 0;
        for (Integer i : st) {
            ans[idx++] = i;
        }
        return ans;
    }
}