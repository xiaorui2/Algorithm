import java.util.ArrayList;

public class Problem24 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();;
    ArrayList<Integer> ans = new ArrayList<Integer>();;

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root != null){
            ans.add(root.val);
            if(root.val == target && root.left == null && root.right == null) {
                result.add(new ArrayList<Integer>(ans));
            }
            else {
                if(root.left != null)
                    FindPath(root.left, target-root.val);
                if(root.right != null)
                    FindPath(root.right, target-root.val);
            }
            ans.remove(ans.size()-1);
        }
        return result;
    }
}
