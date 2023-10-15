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
    HashMap<Pair<Integer,Integer>,List<TreeNode>> memo;
    public List<TreeNode> generateTrees(int n) {
          memo = new HashMap<>();
        return allPossibleBST(1, n);
        
    }

    public List<TreeNode> allPossibleBST(int start, int end){
        List<TreeNode> res=new ArrayList<>();
        if(start>end){
            res.add(null);
            return res;
        }

        if(memo.containsKey(new Pair<>(start, end))){
            return memo.get(new Pair<>(start,end));
        }

        for(int i=start; i<=end;i++){
            List<TreeNode> leftBST=allPossibleBST(start,i-1);
            List<TreeNode> rightBST=allPossibleBST(i+1,end);
            for(TreeNode left:leftBST){
                for(TreeNode right:rightBST){
                    TreeNode root=new TreeNode(i,left,right);
                    res.add(root);
                }
            }
        }
         memo.put(new Pair<>(start, end), res);
        return res;
    }
}