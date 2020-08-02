package br.com.adrianorodrigues.algoritms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindByPartialString {

    /*
     * Complete the contacts function below.
     */
    static HashMap<Character, ArrayList<String>> buckets = new HashMap<>();

    static int[] contacts(String[][] queries) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            String function = queries[i][0];
            String name = queries[i][1];
            Character character = name.charAt(0);
            if (function.equalsIgnoreCase("add")) {
                if (!buckets.containsKey(character))
                    buckets.put(character, new ArrayList<>());
                buckets.get(character).add(name);
            } else {
                ArrayList<String> names = buckets.get(character);
                int count = 0;
                if (names != null)
                    for (String nameAux : names) {
                        if (nameAux.startsWith(name))
                            count++;
                    }
                result.add(count);
            }
        }
        return arrayListToArray(result);
    }

    static int[] arrayListToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/FindByPartialString.txt");
        Scanner scanner = new Scanner(file);
        int queriesRows = Integer.parseInt(scanner.nextLine().trim());

        String[][] queries = new String[queriesRows][2];

        for (int queriesRowItr = 0; queriesRowItr < queriesRows; queriesRowItr++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int queriesColumnItr = 0; queriesColumnItr < 2; queriesColumnItr++) {
                String queriesItem = queriesRowItems[queriesColumnItr];
                queries[queriesRowItr][queriesColumnItr] = queriesItem;
            }
        }

        int[] result = contacts(queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }


}
