package easy;

import easy.DeleteDuplicates83.ListNode;
/**
 * 
 *@author rain
 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MergeTwoLists21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		ListNode result = new ListNode(0);
		ListNode point  = result;
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				point.next = l1;
				l1 = l1.next;
				point = point.next;
			}else{
				point.next = l2;
				l2 = l2.next;
				point = point.next;
			}
		}
		while(l1 != null){
			point.next = l1;
			l1 = l1.next;
			point = point.next;
		}
		while(l2 != null){
			point.next = l2;
			l2 = l2.next;
			point = point.next;
		}
		point.next = null;
		return result.next;
    }
}
