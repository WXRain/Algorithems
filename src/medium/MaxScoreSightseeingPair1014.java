package medium;

import util.Utils;

/**
 * 
 * @author rain 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
 * 
 *         一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
 * 
 *         返回一对观光景点能取得的最高分。
 * 
 *          
 * 
 *         示例：
 * 
 *         输入：[8,1,5,2,6] 输出：11 解释：i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0
 *         - 2 = 11  
 * 
 *         提示：
 * 
 *         2 <= A.length <= 50000 1 <= A[i] <= 1000
 * 
 *         来源：力扣（LeetCode）
 *         链接：https://leetcode-cn.com/problems/best-sightseeing-pair
 *         著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxScoreSightseeingPair1014 {
	public static int maxScoreSightseeingPair(int[] A) {
		if (A == null || A.length < 2)
			return 0;
		int left = A[0];
		int maxScore = Integer.MIN_VALUE;
		for (int i = 1; i < A.length; i++) {
			maxScore = Math.max(maxScore, left + A[i] - i);
			left = Math.max(left, A[i] + i);
		}
		return maxScore;
	}

	public static void main(String[] args) {
		int[] A = Utils.string2intarray("[8,1,5,2,6]");
		System.out.println(maxScoreSightseeingPair(A));
	}
}
