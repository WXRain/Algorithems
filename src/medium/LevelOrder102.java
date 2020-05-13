package medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import medium.RightSideView.TreeNode;
/**
 * 
 *@author rain
 *
						给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
						
						 
						
						示例：
						二叉树：[3,9,20,null,null,15,7],
						
						    3
						   / \
						  9  20
						    /  \
						   15   7
						返回其层次遍历结果：
						
						[
						  [3],
						  [9,20],
						  [15,7]
						]
						
						来源：力扣（LeetCode）
						链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
						著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LevelOrder102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null) return new LinkedList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode last = root;
		TreeNode temp = root;
		LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		while(!queue.isEmpty()){
			TreeNode t = queue.poll();
			list.add(t.val);
			if(t.left != null){
				queue.add(t.left);
				temp = t.left;
			}
			if(t.right != null){
				queue.add(t.right);
				temp = t.right;
			}
			if(t == last){
				result.add(list);
				list = new LinkedList<Integer>();
				last = temp;
			}
		}
		return result;
    }
}
