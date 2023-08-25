import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, ArrayList<Integer>> row = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> col = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> box = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                ArrayList<Integer> rowList = row.getOrDefault(i, new ArrayList<>());
                ArrayList<Integer> colList = col.getOrDefault(j, new ArrayList<>());
                ArrayList<Integer> boxList = box.getOrDefault(  (i / 3) * 3 + j / 3, new ArrayList<>());

                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if (rowList.contains(num) || colList.contains(num)|| boxList.contains(num)) {
                        return false;
                    } else {
                        rowList.add(num);
                        colList.add(num);
                        boxList.add(num);
                        row.put(i, rowList);
                        col.put(j, colList);
                        box.put((i / 3) * 3 + j / 3, boxList);
                    }
                }
            }
        }
        return true;
    }
}
