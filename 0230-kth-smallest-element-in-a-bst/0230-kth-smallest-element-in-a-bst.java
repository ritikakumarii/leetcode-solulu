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
    // public List<Integer> inOrder(TreeNode root,List<Integer> list){
        
    //     if(root==null) return list ;
    //     inOrder(root.left,list);
    //     list.add(root.val);
    //     inOrder(root.right,list);
    //     return list;
    // }
    int count=0;
    public TreeNode fun(TreeNode root, int k) {
    //   List<Integer> list = new ArrayList<>();
    //   list=inOrder(root,list);
    //   return list.get(k-1);
    if(root==null) return root;
    TreeNode left = fun(root.left,k);
    if(left!=null) return left;
    count++;
    if(count==k) return root;
    return fun(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k){
    TreeNode ans = fun(root,k);
    return ans.val;
    }
}