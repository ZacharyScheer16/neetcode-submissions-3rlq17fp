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
    int count = 0;
    int answer = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(k == 0) return 0;
        inOrder(root, k);
        return answer;
    }

    public void inOrder(TreeNode node, int k){
    if(node == null) return;

    inOrder(node.left, k);
    if(answer !=0 )return;
    count++;
    if(count ==k){
        answer = node.val;
        return;
    }
    inOrder(node.right, k);
    }
}
