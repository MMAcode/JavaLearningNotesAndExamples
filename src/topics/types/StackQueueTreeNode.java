package topics.types;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTreeNode {
    private StackQueueTreeNode left;
    private StackQueueTreeNode right;
    private String value;

    public StackQueueTreeNode(String value) {
        left = null;
        right = null;
        this.value = value;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();
        System.out.println(s.peek());
        
        LinkedList<Integer> ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.remove();
        System.out.println(ll.peek());
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        ll.addLast(5);
        ll.addFirst(6);
        ll.forEach(System.out::print);
    }

    public StackQueueTreeNode getLeft() {
        return left;
    }

    public void setLeft(StackQueueTreeNode left) {
        this.left = left;
    }

    public StackQueueTreeNode getRight() {
        return right;
    }

    public void setRight(StackQueueTreeNode right) {
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public static StackQueueTreeNode createTree() {
        StackQueueTreeNode root = new StackQueueTreeNode("R");
        String[] valuesToAdd = new String[]{
                "E", "A", "D", "U", "N", "T", "S", "M"
        };
        for (String s : valuesToAdd)
            addNodeToTree(root, s);
        return root;
    }

    private static void addNodeToTree(StackQueueTreeNode tree, String value) {
        if (value.compareTo(tree.getValue()) < 0) {
            if (tree.getLeft() == null)
                tree.setLeft(new StackQueueTreeNode(value));
            else
                addNodeToTree(tree.getLeft(), value);
        } else {
            if (tree.getRight() == null)
                tree.setRight(new StackQueueTreeNode(value));
            else
                addNodeToTree(tree.getRight(), value);
        }
    }


    //
//  if (current.getLeft() != null)
//          depthFirstRecursive(current.getLeft());
//          }
    private static void breadthFirst(StackQueueTreeNode root) {
        Queue<Integer> q = new LinkedList<>(); //also possible
        Queue<StackQueueTreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            StackQueueTreeNode node = queue.poll();
            System.out.println(node.getValue());
            if (node.getLeft() != null)
                queue.add(node.getLeft());
            if (node.getRight() != null)
                queue.add(node.getRight());
        }
    }

    private static void depthFirst(StackQueueTreeNode root) {
        // Stack<Integer> stackX = new Stack<>(); //also POSSIBLE , - stack of any objects
        Stack<StackQueueTreeNode> stack = new Stack<>(); //outdated; use linnkedList instead
        stack.push(root);
        while (!stack.empty()) {
            StackQueueTreeNode node = stack.pop();
            System.out.println(node.getValue());
            if (node.getLeft() != null)
                stack.push(node.getLeft());
            if (node.getRight() != null)
                stack.push(node.getRight());
        }
    }
}


