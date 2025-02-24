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

    boolean result = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p == null) {
            if(q != null){
            result = false;
            return result;
            }
        }
        if(q == null) {
            if(p != null){
            result = false;
            return result;
            }
        }

        if(p == null && q == null){
            return result;
        }

        
        isSameTree(p.left,q.left);

        if(p.val != q.val) result = false;

        isSameTree(p.right,q.right);

        if(p.val != q.val) result = false;

        return result;
    }
}
