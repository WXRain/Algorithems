package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 * 示例 1：
 *
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 * 示例 2：
 *
 * 输入：["cool","lock","cook"]
 * 输出：["c","o"]
 *
 * 提示：
 *
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] 是小写字母
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-common-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CommonChars1002 {
    public List<String> commonChars(String[] A) {
        int[] min = new int[26];
        Arrays.fill(min, 1000);
        List<String> res = new ArrayList<>();
        for (String a : A) {
            int[] x = new int[26];
            char[] chs = a.toCharArray();
            for (char ch : chs) {
                x[ch - 'a']++;
            }
            for (int i = 0; i < min.length; i++) {
                min[i] = Math.min(min[i], x[i]);
            }
        }
        for (int i = 0; i < min.length; i++) {
            for (int j = 0; j < min[i]; j++) {
                String s = (char) ('a' + i) + "";
                res.add(s);
            }
        }
        return res;
    }
}
