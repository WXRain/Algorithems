package medium;

import util.Utils;
/**
 * 
 *@author rain
					给定一个整数数组 A，返回其中元素之和可被 K 整除的（连续、非空）子数组的数目。
					
					 
					
					示例：
					
					输入：A = [4,5,0,-2,-3,1], K = 5
					输出：7
					解释：
					有 7 个子数组满足其元素之和可被 K = 5 整除：
					[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
					 
					
					提示：
					
					1 <= A.length <= 30000
					-10000 <= A[i] <= 10000
					2 <= K <= 10000
					
					来源：力扣（LeetCode）
					链接：https://leetcode-cn.com/problems/subarray-sums-divisible-by-k
					著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SubarraysDivByK974 {
	public static int subarraysDivByK(int[] A, int K) {
        int[] dp = new int[K];
        int count = 0, sum = 0, t = 0;
        int i;
        for(i = 0; i < A.length; i++){
        		sum += A[i];
        		if(sum % K < 0){
        			t = sum % K + K;
        		}else t = sum % K;
        		if(t == 0){
        			dp[0]++;
        			count += dp[0];
        		}else if(t != 0 && dp[t] == 0){
        			dp[t] = 1;
        		}else if(t != 0){
        			count += dp[t];
        			dp[t]++;
        		}
        }
        return count;
    }
	public static void main(String[] args) {
		int[] A = Utils.string2intarray("[4,5,0,-2,-3,1]");
		System.out.println(subarraysDivByK(A, 5));
	}
}
