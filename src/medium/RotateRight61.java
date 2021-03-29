package medium;

/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[4,5,1,2,3]
 * 示例 2：
 *
 *
 * 输入：head = [0,1,2], k = 4
 * 输出：[2,0,1]
 *
 *
 * 提示：
 *
 * 链表中节点的数目在范围 [0, 500] 内
 * -100 <= Node.val <= 100
 * 0 <= k <= 2 * 109
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RotateRight61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode l = head;
        int length = 0;
        while (l != null) {
            length++;
            l = l.next;
        }
        k = k % length;
        ListNode first = head, second = head;
        if (k == 0) return head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        l = second;
        while (first.next != null) {
            first = first.next;
            l = second;
            second = second.next;
        }
        l.next = null;
        first.next = head;
        return second;
    }
}
