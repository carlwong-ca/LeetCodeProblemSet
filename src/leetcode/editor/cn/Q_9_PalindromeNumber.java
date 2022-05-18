//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。 
//
// 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。 
//
// 
// 例如，121 是回文，而 123 不是。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 121
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：x = -121
//输出：false
//解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
// 
//
// 示例 3： 
//
// 
//输入：x = 10
//输出：false
//解释：从右向左读, 为 01 。因此它不是一个回文数。
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能不将整数转为字符串来解决这个问题吗？ 
// Related Topics 数学 👍 2006 👎 0

package leetcode.editor.cn;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q_9_PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new Q_9_PalindromeNumber().new Solution();
        // 测试代码
        int x = 10022201;
        System.out.println(solution.isPalindrome(x));
    }

// 题目：回文数
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return false;

        int[] xArray = new int[String.valueOf(Double.valueOf(Math.pow(2, 31)).intValue()).length()];
        int digits = 0;
        for (int i = 0; i < xArray.length; i++) {
            xArray[i] = x % 10;
            //System.out.println(xArray[i]);
            if (x < 10) {
                digits = i + 1;
                break;
            }
            x = (x - xArray[i]) / 10;
        }
        //System.out.println(digits);

        boolean answer = true;
        for (int i = 0; i < Double.valueOf(Math.floor(digits / 2)).intValue(); i++) {
            //System.out.println(xArray[i] + ", " + xArray[digits - 1 - i]);
            if (xArray[i] != xArray[digits - 1 - i]) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
