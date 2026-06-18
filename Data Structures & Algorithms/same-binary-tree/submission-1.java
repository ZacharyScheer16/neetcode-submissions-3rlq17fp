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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //bfs
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while(!queue.isEmpty()){
            TreeNode v1 = queue.poll();
            TreeNode v2 = queue.poll();

            if(v1 == null && v2 == null){
                continue;
            }      
            if(v1 == null || v2 == null){
                return false;
            }       
            if(v1.val != v2.val){
                return false;
            }

            queue.offer(v1.right);
            queue.offer(v2.right);
            queue.offer(v1.left);
            queue.offer(v2.left);
            }

            return true;
    }
}
