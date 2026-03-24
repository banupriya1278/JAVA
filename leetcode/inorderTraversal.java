class Solution {
    private List<Integer> res;
    public List<Integer> inorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        inorder(root);
        return res;
    }
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}