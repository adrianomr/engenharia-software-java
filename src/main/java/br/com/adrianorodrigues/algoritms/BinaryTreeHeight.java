package br.com.adrianorodrigues.algoritms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

public class BinaryTreeHeight {

    public static int height(Node root) {
        return root == null ? 0 : getMaxHeight(root) - 1;
    }

    private static int getMaxHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getMaxHeight(root.left), getMaxHeight(root.right)) + 1;
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
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/BinaryTreeHeightData.txt");
        Scanner scan = new Scanner(file);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        Logger.getGlobal().info("" + height);
    }
}

