import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Define TreeNode class (your own, not javax.swing)
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class levelorderTraversal {

    public static void main(String[] args) {
        // Example test:
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        levelorderTraversal lot = new levelorderTraversal();
        List<List<Integer>> result = lot.levelOrder(root);
        System.out.println(result);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if (root == null) return wrapList;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNum = queue.size(); // number of nodes in this level
            List<Integer> subList = new LinkedList<>();

            for (int i = 0; i < levelNum; i++) {
                TreeNode current = queue.poll(); // take out the front node
                subList.add(current.val);        // add its value to current level list

                if (current.left != null) queue.offer(current.left);   // add left child
                if (current.right != null) queue.offer(current.right); // add right child
            }

            wrapList.add(subList); // add this level's list to the result
        }

        return wrapList;
    }
}
