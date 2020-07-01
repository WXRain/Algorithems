package medium;

import java.util.Arrays;

/**
 * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
 * 
 *  
 * 
 * 示例：
 * 
 * matrix = [ [ 1, 5, 9], [10, 11, 13], [12, 13, 15] ], k = 8,
 * 
 * 返回 13。  
 * 
 * 提示： 你可以假设 k 的值永远是有效的，1 ≤ k ≤ n2 。
 * 
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-smallest-element-in-a-sorted-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * @author rain
 */
public class KthSmallest378 {
	public int kthSmallest(int[][] matrix, int k) {
		if (k == 1)
			return matrix[0][0];
		int[] arr = new int[matrix.length * matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				arr[matrix.length * i + j] = matrix[i][j];
			}
		}
		Arrays.sort(arr);
		return arr[k - 1];
	}
}
