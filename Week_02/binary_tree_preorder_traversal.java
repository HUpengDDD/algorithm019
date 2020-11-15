class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lis =new ArrayList<Integer>();
        preorder(lis,root);
        return lis;
    }
    public void  preorder(List<Integer> lis, TreeNode root){
        if(root==null) return;
        lis.add(root.val);
        preorder(lis,root.left);
        preorder(lis,root.right);
    }
}