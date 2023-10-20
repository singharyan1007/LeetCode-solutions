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
    public boolean isValidBST(TreeNode root) {
        TreeNode r=null;
        TreeNode l=null;
    return    isValid(root,l,r);
    }
    
    public boolean isValid(TreeNode root, TreeNode l, TreeNode r){
        if(root==null){
            return true;
        }
        if((l!=null && root.val<=l.val) || (r!=null && root.val>=r.val) ){
            return false;
        }
        if((!isValid(root.left,l,root)) || (!isValid(root.right,root,r))){
            return false;
        }
        
        return true;
    }
    
}