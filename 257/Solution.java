import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    List<String> paths = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        search(root, null);
        return paths;
    }

    private void search(TreeNode node, String path) {

        if (path == null) {
            path = String.valueOf(node.val);
        } else {
            path = path + "->" + node.val;
        }

        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }

        if (node.left != null) {
            search(node.left, path);
        }

        if (node.right != null) {
            search(node.right, path);
        }
    }

}
