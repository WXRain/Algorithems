/**
 * 
 */
package medium;

/**
 * @author wangxinyu
 *
 */
/**
 * Definition for singly-linked list.**/
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) { 
		ListNode a = head, b = head;
	    int i;
	    for(i = 0; i < n; i++){
	        b = b.next;
	    }
	    if(b == null){
	        return head.next;
	    }
	    while(b.next != null){
	        a = a.next;
	        b = b.next;
	    }
	    a.next = a.next.next;
	    return head;
	}
}
