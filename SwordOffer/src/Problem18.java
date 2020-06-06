public class Problem18 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public void Mirror(TreeNode pRoot) {
        if((pRoot == null) || (pRoot.left == null && pRoot.right == null)){
            return ;
        }
        TreeNode temp = null;
        temp = pRoot.right;
        pRoot.right = pRoot.left;
        pRoot.left = temp;
        if(pRoot.left != null){
            Mirror(pRoot.left);
        }
        if(pRoot.right != null){
            Mirror(pRoot.right);
        }
    }
}
