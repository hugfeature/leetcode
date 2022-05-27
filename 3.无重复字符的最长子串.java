
import java.util.Set;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合记录出现次数
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        int rk = -1 , ans = 0;
        for (int i = 0; i < n; ++i){
            if (i !=0){
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt( rk + 1))){
                occ.add(s.charAt( rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk - i +1);
        }
        return ans;
    }
}
// @lc code=end

