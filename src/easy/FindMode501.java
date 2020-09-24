package easy;

import easy.MaxDepthOfBinaryTree104.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 *
 * 假定 BST 有如下定义：
 *
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 例如：
 * 给定 BST [1,null,2,2],
 *
 *    1
 *     \
 *      2
 *     /
 *    2
 * 返回[2].
 *
 * 提示：如果众数超过1个，不需考虑输出顺序
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-mode-in-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindMode501 {
    private Map<Integer, Integer> map = new HashMap<>();
    private List<Integer> res = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        int max = 0;
        preOrder(root);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) max = entry.getValue();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) res.add(entry.getKey());
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

    private void preOrder(TreeNode root) {
        if (root == null) return;
        preOrder(root.left);
        if (!map.containsKey(root.val)) {
            map.put(root.val, 1);
        } else {
            map.replace(root.val, map.get(root.val) + 1);
        }
        preOrder(root.right);
        return;
    }

}
