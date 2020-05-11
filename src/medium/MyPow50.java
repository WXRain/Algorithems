package medium;
/**
 * 
 *@author rain
								实现 pow(x, n) ，即计算 x 的 n 次幂函数。
								
								示例 1:
								
								输入: 2.00000, 10
								输出: 1024.00000
								示例 2:
								
								输入: 2.10000, 3
								输出: 9.26100
								示例 3:
								
								输入: 2.00000, -2
								输出: 0.25000
								解释: 2-2 = 1/22 = 1/4 = 0.25
								
								来源：力扣（LeetCode）
								链接：https://leetcode-cn.com/problems/powx-n
								著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MyPow50 {
	public double myPow(double x, int n) {
		return Math.pow(x, n);
		/**
		if (x == 1) return 1;
        if (x == -1) return n % 2 == 0 ? 1 : -1;

        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1/x;

        double prev = myPow(x, n/2);
        return prev * prev * myPow(x, n%2);
		 */
	}
}
