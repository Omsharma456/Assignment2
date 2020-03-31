/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public static StringBuilder stringBuilder;
    public int levels = 0;
    public TreeNode root;

    public MyBinarySearchTree() {
        this.root = null;
        stringBuilder = new StringBuilder();
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        stringBuilder.append(root.getKey() + " ");
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());

    }
}
