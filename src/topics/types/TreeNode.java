package topics.types;

public class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private String value;

        public TreeNode(String value) {
            left = null;
            right = null;
            this.value = value;
        }
        public TreeNode getLeft() {
            return left;
        }
        public void setLeft(TreeNode left) {
            this.left = left;
        }
        public TreeNode getRight() {
            return right;
        }
        public void setRight(TreeNode right) {
            this.right = right;
        }
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }


    public static TreeNode createTree() {
        TreeNode root = new TreeNode("R");
        String[] valuesToAdd = new String[] {
                "E", "A", "D", "U", "N", "T", "S", "M"
        };
        for (String s : valuesToAdd)
            addNodeToTree(root, s);
        return root;
    }
    private static void addNodeToTree(TreeNode tree, String value) {
        if (value.compareTo(tree.getValue()) < 0) {
            if (tree.getLeft() == null)
                tree.setLeft(new TreeNode(value));
            else
                addNodeToTree(tree.getLeft(), value);
        } else {
            if (tree.getRight() == null)
                tree.setRight(new TreeNode(value));
            else
                addNodeToTree(tree.getRight(), value);
        }
    }

}
//
//  if (current.getLeft() != null)
//          depthFirstRecursive(current.getLeft());
//          }
//private static void breadthFirst(TreeNode root) {
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//        TreeNode node = queue.poll();
//        System.out.println(node.getValue());
//        if (node.getLeft() != null)
//        queue.add(node.getLeft());
//        if (node.getRight() != null)
//        queue.add(node.getRight());
//        }
//        }
//private static void depthFirst(TreeNode root) {
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while (!stack.empty()) {
//        TreeNode node = stack.pop();
//        System.out.println(node.getValue());
//        if (node.getLeft() != null)
//        stack.push(node.getLeft());
//        if (node.getRight() != null)
//        stack.push(node.getRight());
//        }
//        }
//

