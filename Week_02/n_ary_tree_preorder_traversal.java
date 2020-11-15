
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> lis=preorder
        helper(lis,root);
        return lis;
    }
    public void helper( List<Integer> lis,Node root){
        if(root == null) return ;
        lis.add(root.val);
        for(int i= 0; i< root.children.size();i++){
            helper(lis,root.children.get(i));
        }
    }
}