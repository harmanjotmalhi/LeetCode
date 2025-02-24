/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */

/**
 * @param {TreeNode} root
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {TreeNode}
 */
var lowestCommonAncestor = function(root, p, q) {
    
    let temp1 = root;
    let temp2 = root;
    let temp = null;

    while(temp1.val == temp2.val){
        console.log('hello');
        temp = temp1;

        if(temp1.val > p.val){
            temp1 = temp1.left;
        }
        else if(temp1.val < p.val){
            temp1 = temp1.right;
        }
        if(temp2.val > q.val){
            temp2 = temp2.left;
        }
        else if(temp2.val < q.val){
            temp2 = temp2.right;
        }
    }

    return temp;
};