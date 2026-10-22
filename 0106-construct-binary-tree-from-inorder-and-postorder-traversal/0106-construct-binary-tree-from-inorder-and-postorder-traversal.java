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
    int postIndex;
    
    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder){
        for(int i =0; i<inorder.length ; i++){
            map.put(inorder[i],i);
        }
     postIndex=postorder.length-1;
      return  create(postorder,0,postorder.length-1);
    }   
    public TreeNode create(int[] postorder, int left, int right){
        if(left>right){
            return null;
        }
        int rootValue = postorder[postIndex--];
        TreeNode root = new TreeNode(rootValue);
        int index= map.get(rootValue);
         root.right= create(postorder,index+1,right);
        root.left=create(postorder,left,index-1);
       

        return root;
    }
}