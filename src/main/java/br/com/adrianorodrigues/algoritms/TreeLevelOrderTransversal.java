package br.com.adrianorodrigues.algoritms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class TreeLevelOrderTransversal {

    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        String result = "";
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            result += result.equalsIgnoreCase("") ? node.data : " " + node.data;
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        Logger.getGlobal().info(result);
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/TreeLevelOrderTransversal.txt");
        Scanner scan = new Scanner(file);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }

}
