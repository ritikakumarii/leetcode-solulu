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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double> ans = new ArrayList<>();
         if(root==null) return ans;
         Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root);
         while(!queue.isEmpty()){
            int size = queue.size();
            double average=0;
            double sum=0;
            for(int i=0 ; i<size; i++){
            TreeNode currNode = queue.poll();
             sum += currNode.val;
            if(currNode.left!=null){
                queue.offer(currNode.left);
            }
            if(currNode.right!=null){
                queue.offer(currNode.right);
            }
         }
         average= sum/size;
         ans.add(average);
         }
         return ans;
    }
}