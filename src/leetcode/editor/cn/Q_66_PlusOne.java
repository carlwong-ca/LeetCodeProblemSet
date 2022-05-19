//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
// Related Topics 数组 数学 👍 1019 👎 0

package leetcode.editor.cn;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q_66_PlusOne {
    public static void main(String[] args) {
        Solution solution = new Q_66_PlusOne().new Solution();
        // 测试代码
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(solution.plusOne(digits)));
    }

// 题目：加一
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        int digitsLen = digits.length;
        boolean allNine = true;
        for (int i = 0; i < digitsLen; i++) {
            if (digits[i] != 9) allNine = false;
        }
        //System.out.println(allNine);

        if (allNine) {
            digitsLen++;
            int[] answer = new int[digitsLen];
            answer[0] = 1;
            return answer;
        } else {
            if (digits[digitsLen - 1] != 9) {
                digits[digitsLen - 1]++;
                return digits;
            } else {
                int[] answer = new int[digitsLen];
                boolean first = true;
                boolean up = false;
                for (int i = digitsLen - 1; i >= 0; i--) {
                    if (first && digits[i] == 9) {
                        answer[i] = 0;
                        up = true;
                    } else {
                        first = false;
                        if (up) {
                            up = false;
                            answer[i] = digits[i] + 1;
                        } else {
                            answer[i] = digits[i];
                        }
                    }
                }
                return answer;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
