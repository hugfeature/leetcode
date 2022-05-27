/*
 * @Author: 丑牛
 * @Date: 2021-09-30 13:29:40
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-09-30 13:47:30
 * @Description: file content
 */
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=804 lang=java
 *
 * [804] 唯一摩尔斯密码词
 */

// @lc code=start
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
        "....","..",".---","-.-",".-..","--","-.",
        "---",".--.","--.-",".-.","...","-","..-",
        "...-",".--","-..-","-.--","--.."
    };
    Set<String> seen = new HashSet();
    for (String word : words) {
        StringBuilder code = new StringBuilder();
        for (char c : word.toCharArray()) {
            code.append(MORSE[c - 'a']);
    
        }
        seen.add(code.toString());
    }
    return seen.size();
}
}
// @lc code=end
