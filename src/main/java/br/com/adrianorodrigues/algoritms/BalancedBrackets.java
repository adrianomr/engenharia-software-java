package br.com.adrianorodrigues.algoritms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BalancedBrackets {
    static Map<String, String> mapMatchers = Stream.of(
            new AbstractMap.SimpleEntry<>("{", "}"),
            new AbstractMap.SimpleEntry<>("(", ")"),
            new AbstractMap.SimpleEntry<>("[", "]")
    )
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    static boolean matcher(String begin, String end) {
        if (mapMatchers.containsKey(begin)) {
            return mapMatchers.get(begin).equalsIgnoreCase(end);
        }
        return false;
    }

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String character = "" + s.charAt(i);
            if (mapMatchers.containsKey(character))
                stack.push(character);
            else {
                if (stack.isEmpty())
                    return "NO";
                String begin = stack.pop();
                if (!matcher(begin, character))
                    return "NO";
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/BalancedBrackets.txt");
        Scanner scanner = new Scanner(file);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
