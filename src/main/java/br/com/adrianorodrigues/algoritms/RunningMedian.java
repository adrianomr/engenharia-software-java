package br.com.adrianorodrigues.algoritms;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class RunningMedian {


    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        double[] result = new double[a.length];
        SortedQueue sortedQueue = new SortedQueue();
        for (int i = 0; i < a.length; i++) {
            sortedQueue.add(a[i]);
            int[] medianArray = sortedQueue.peakHalf();
            double median = 0;
            for (int j = 0; j < medianArray.length; j++)
                median += medianArray[j];
            median = median == 0 ? 0 : median / medianArray.length;
            result[i] = median;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/RunningMedian.txt");
        Scanner scanner = new Scanner(file);
        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

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
