/*
 * @Author: 丑牛
 * @Date: 2021-10-10 16:50:47
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-10-10 17:00:59
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
       int index = s.length() - 1;
       while (s.charAt(index) == ' ') {
           index -- ;
       }
       int wordLenth = 0;
       while (index >=0 && s.charAt(index) != ' ') {
           wordLenth ++ ;
           index --;
       }
       return wordLenth;
    }
}
// @lc code=end

