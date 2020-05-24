package hard;
/**
 * 
 *@author rain
					给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
					
					请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
					
					你可以假设 nums1 和 nums2 不会同时为空。
					
					 
					
					示例 1:
					
					nums1 = [1, 3]
					nums2 = [2]
					
					则中位数是 2.0
					示例 2:
					
					nums1 = [1, 2]
					nums2 = [3, 4]
					
					则中位数是 (2 + 3)/2 = 2.5
					
					来源：力扣（LeetCode）
					链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
					著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindMedianSortedArrays4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	       int left = (nums1.length + nums2.length + 1) / 2;
	       int right = (nums1.length + nums2.length + 2) / 2;
	       
	       return (findKth(nums1, 0, nums2, 0, left) + findKth(nums1, 0, nums2, 0, right)) / 2;
	    }
		
		private double findKth(int nums1[], int i, int nums2[], int j, int k){
			if(i >= nums1.length) return nums2[j + k - 1];//nums1为空
			if(j >= nums2.length) return nums1[i + k - 1];//nums2为空
			if(k == 1) return Math.min(nums1[i], nums2[j]);
			
			int midVal1 = (i + k/2 - 1 < nums1.length) ? nums1[i + k/2 - 1] : Integer.MAX_VALUE;
			int midVal2 = (j + k/2 - 1 < nums2.length) ? nums2[j + k/2 - 1] : Integer.MAX_VALUE;
			
			if(midVal1 < midVal2){
				return findKth(nums1, i + k/2, nums2, j, k - k/2);
			}else{
				return findKth(nums1, i, nums2, j + k/2, k - k/2);
			}
		}
}
