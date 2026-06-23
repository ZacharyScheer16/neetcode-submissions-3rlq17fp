/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(k <= 0)return 0;
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);

        return list.get(k - 1);
    }

    public void inOrder(TreeNode node, List<Integer> list){
        if(node == null)return;

        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }
}
