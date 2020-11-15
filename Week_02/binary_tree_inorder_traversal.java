class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer> ();
        inorder(list, root);
        return list;
    }
    private void inorder(List<Integer> list ,TreeNode root){
        if (root == null) return ;
        inorder(list, root.left);
        list.add(root.val);
        inorder(list, root.right);
    }

}