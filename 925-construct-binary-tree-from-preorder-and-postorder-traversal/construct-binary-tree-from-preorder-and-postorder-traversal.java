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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return build(pre, post, 0, 0, pre.length);
    }

    TreeNode build(int[] pre, int[] post, int ps, int qs, int n) {
        if (n == 0) return null;

        TreeNode root = new TreeNode(pre[ps]);
        if (n == 1) return root;

        int i = qs;
        while (post[i] != pre[ps + 1]) i++;

        int left = i - qs + 1;

        root.left = build(pre, post, ps + 1, qs, left);
        root.right = build(pre, post, ps + left + 1,
                           i + 1, n - left - 1);

        return root;
    }
}