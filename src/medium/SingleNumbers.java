package medium;
/**
 * 
 *@author rain
 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。

 

示例 1：

输入：nums = [4,1,4,6]
输出：[1,6] 或 [6,1]
示例 2：

输入：nums = [1,2,10,4,1,4,3,3]
输出：[2,10] 或 [10,2]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SingleNumbers {
	public int[] singleNumbers(int[] nums) {
		if(nums.length == 2) return nums;
		int res = 0;
		int a = 0, b = 0;
		for(int i : nums) res = res ^ i;//res为全部数字的与或
		int h = 1;
		while((res & h) == 0){
			h <<= 1;//找到第一个为0的位，将nums分成两组
		}
		for(int i : nums){
			if((h & i) == 0) a ^= i;//第一组的与或结果放在a里
			else b ^= i;//第二组与或结果放在b里
		}
		return new int[]{a, b};
    }
}
