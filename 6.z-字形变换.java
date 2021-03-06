/*
 * @description: 
 * @param: params
 * @return: 
 */
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        // 设定每一行的字符数
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++){
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        for(char c : s.toCharArray()){
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows -1) goingDown = !goingDown;
            curRow += goingDown ? 1: -1 ;
        }

        StringBuilder ret = new StringBuilder();
        for(StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}
// @lc code=end

