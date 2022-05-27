/*
 * @Author: 丑牛
 * @Date: 2021-12-30 10:14:42
 * @LastEditors: 丑牛
 * @LastEditTime: 2021-12-30 11:48:16
 * @Description: file content
 */
/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
    //    int n = s.length();
    //    int left = 0;
    //    int right = n - 1;
    //    while ( left < right){
    //        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
    //            ++ left;
    //        }
    //        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
    //            --left;
    //        }
    //        if (left < right) {
    //            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
    //                return false;
    //            }
    //            ++ left;
    //            -- right;
    //        }
    //    } 
    //    return true;
    StringBuffer sgood = new StringBuffer();
    int length = s.length();
    for (int i = 0; i < length; i++) {
        char ch = s.charAt(i);
        if (Character.isLetterOrDigit(ch)) {
            sgood.append(Character.toLowerCase(ch));
        }
    }
    StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
    return sgood.toString().equals(sgood_rev.toString());
    }
}
// @lc code=end

