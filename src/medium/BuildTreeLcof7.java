package medium;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *
 * 限制：
 *
 * 0 <= 节点个数 <= 5000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BuildTreeLcof7 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return build(preorder, inorder, 0, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int[] inorder, int root, int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[root]);
        int i = start;
        while (i < end && preorder[root] != inorder[i]) i++;
        node.left = build(preorder, inorder, root + 1, start, i - 1);
        node.right = build(preorder, inorder, root + 1 + i - start, i + 1, end);
        return node;
    }
}
