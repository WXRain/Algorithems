package hard;

/**
 * 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 * 
 * 示例 1:
 * 
 * 输入: "(()" 输出: 2 解释: 最长有效括号子串为 "()" 示例 2:
 * 
 * 输入: ")()())" 输出: 4 解释: 最长有效括号子串为 "()()"
 * 
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/longest-valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * @author rain
 */
public class LongestValidParentheses32 {
	public int longestValidParentheses(String s) {
		char[] chars = s.toCharArray();
		return Math.max(calc(chars, 0, 1, chars.length, '('), calc(chars, chars.length - 1, -1, -1, ')'));
	}

	private int calc(char[] chars, int i, int flag, int end, char cTem) {
		int max = 0, sum = 0, currLen = 0, validLen = 0;
		for (; i != end; i += flag) {
			sum += (chars[i] == cTem ? 1 : -1);
			currLen++;
			if (sum < 0) {
				max = max > validLen ? max : validLen;
				sum = 0;
				currLen = 0;
				validLen = 0;
			} else if (sum == 0) {
				validLen = currLen;
			}
		}
		return max > validLen ? max : validLen;
	}
}
