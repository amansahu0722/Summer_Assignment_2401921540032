class Solution {

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).diam;
    }

    public Info helper(TreeNode root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info left = helper(root.left);
        Info right = helper(root.right);

        int height = Math.max(left.ht, right.ht) + 1;

        
        int selfDiam = left.ht + right.ht;

        int maxDiam = Math.max(Math.max(left.diam, right.diam), selfDiam);

        return new Info(maxDiam, height);
    }
}