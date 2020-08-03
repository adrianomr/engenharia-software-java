package br.com.adrianorodrigues.algoritms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class SwapNodes {

    /*
     * Complete the swapNodes function below.
     */
    static int[][] swapOperation(int[][] indexes, int factor) {
        Queue<Integer> stackVisiting = new LinkedList<>();
        Queue<Integer> stackToVisit = new LinkedList<>();
        stackVisiting.add(0);
        int depth = 1;
        while (!stackVisiting.isEmpty()) {
            int node = stackVisiting.poll();
            boolean shouldSwap = depth % factor == 0;
            if (shouldSwap) {
                int aux = indexes[node][0];
                indexes[node][0] = indexes[node][1];
                indexes[node][1] = aux;
            }
            int left = indexes[node][0] == -1 ? -1 : indexes[node][0] - 1;
            int right = indexes[node][1] == -1 ? -1 : indexes[node][1] - 1;
            if (left != -1) {
                stackToVisit.add(left);
            }
            if (right != -1) {
                stackToVisit.add(right);
            }
            if (stackVisiting.isEmpty() && !stackToVisit.isEmpty()) {
                stackVisiting.addAll(stackToVisit);
                stackToVisit = new LinkedList<>();
                depth++;
            }
        }
        return indexes;
    }

    static int[][] swapNodes(int[][] indexes, int[] queries) {
        /*
         * Write your code here.
         */
        int[][] result = new int[queries.length][indexes.length];
        for (int i = 0; i < queries.length; i++) {
            swapOperation(indexes, queries[i]);
            Stack<Integer> stackVisiting = new Stack<>();
            List<Integer> listVisited = new Stack<>();
            stackVisiting.push(0);
            int k = 0;
            while (!stackVisiting.isEmpty()) {
                int node = stackVisiting.peek();
                int left = indexes[node][0] == -1 ? -1 : indexes[node][0] - 1;
                int right = indexes[node][1] == -1 ? -1 : indexes[node][1] - 1;
                if (left == -1) {
                    listVisited.add(node);
                    stackVisiting.pop();
                    if (right != -1)
                        stackVisiting.push(right);
                    result[i][k] = node + 1;
                    k++;
                } else {
                    if (listVisited.contains(left) && (!listVisited.contains(right) || right == -1)) {
                        listVisited.add(node);
                        stackVisiting.pop();
                        if (right != -1)
                            stackVisiting.push(right);
                        result[i][k] = node + 1;
                        k++;
                    } else {
                        stackVisiting.push(left);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/SwapNodes.txt");
        Scanner scanner = new Scanner(file);
        int n = Integer.parseInt(scanner.nextLine().trim());

        int[][] indexes = new int[n][2];

        for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
            String[] indexesRowItems = scanner.nextLine().split(" ");

            for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
                int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
                indexes[indexesRowItr][indexesColumnItr] = indexesItem;
            }
        }

        int queriesCount = Integer.parseInt(scanner.nextLine().trim());

        int[] queries = new int[queriesCount];

        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
            int queriesItem = Integer.parseInt(scanner.nextLine().trim());
            queries[queriesItr] = queriesItem;
        }

        int[][] result = swapNodes(indexes, queries);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));

                if (resultColumnItr != result[resultRowItr].length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}


