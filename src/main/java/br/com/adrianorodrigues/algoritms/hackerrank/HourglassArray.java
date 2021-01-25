package br.com.adrianorodrigues.algoritms.hackerrank;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.io.FileNotFoundException;

@Logger
public class HourglassArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] matrix) {
        int maxHourglassSum = -10000;
        for (int rowIndex = 0; hourglassNotOutOfBounds(rowIndex); rowIndex++) {
            int[] row = matrix[rowIndex];
            for (int columnIndex = 0; hourglassNotOutOfBounds(columnIndex); columnIndex++) {
                int hourglassSum = calculateHourglassSum(matrix, rowIndex, columnIndex);
                maxHourglassSum = Math.max(hourglassSum, maxHourglassSum);
            }
        }
        return maxHourglassSum;
    }

    private static int calculateHourglassSum(int[][] matrix, int rowIndex, int columnIndex) {
        int hourglassTopSum = calculateHourglassTopSum(matrix, rowIndex, columnIndex);
        int hourglassMiddleSum = calculateHourglassMiddleSum(matrix, rowIndex, columnIndex);
        int hourglassBottomSum = calculateHourglassBottomSum(matrix, rowIndex, columnIndex);
        return hourglassTopSum + hourglassMiddleSum + hourglassBottomSum;
    }

    private static int calculateHourglassTopSum(int[][] matrix, int rowIndex, int columnIndex) {
        int firstPoint = matrix[rowIndex][columnIndex];
        int secondPoint = matrix[rowIndex][columnIndex + 1];
        int thirdPoint = matrix[rowIndex][columnIndex + 2];
        return firstPoint + secondPoint + thirdPoint;
    }

    private static int calculateHourglassMiddleSum(int[][] matrix, int rowIndex, int columnIndex) {
        return matrix[rowIndex + 1][columnIndex + 1];
    }

    private static int calculateHourglassBottomSum(int[][] matrix, int rowIndex, int columnIndex) {
        int firstPoint = matrix[rowIndex + 2][columnIndex];
        int secondPoint = matrix[rowIndex + 2][columnIndex + 1];
        int thirdPoint = matrix[rowIndex + 2][columnIndex + 2];
        return firstPoint + secondPoint + thirdPoint;
    }

    private static boolean hourglassNotOutOfBounds(int rowIndex) {
        return rowIndex < 4;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[][] teste1 =
                {
                        {1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 0, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}
                };
        int[][] teste2 =
                {
                        {-9, -9, -9, 1, 1, 1},
                        {0, -9, 0, 4, 3, 2},
                        {-9, -9, -9, 1, 2, 3},
                        {0, 0, 8, 6, 6, 0},
                        {0, 0, 0, -2, 0, 0},
                        {0, 0, 1, 2, 4, 0}
                };
        int[][] teste3 =
                {
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}
                };
        int[][] teste4 =
                {
                        {1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}
                };
        int[][] teste5 =
                {
                        {0, 0, 0, 1, 1, 1},
                        {0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 1, 1},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}
                };
        int[][] teste6 =
                {
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 1, 1},
                        {0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 1, 1}
                };
        int[][] teste7 =
                {
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0}
                };
        int[][] teste8 =
                {
                        {-1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1},
                        {-1, -1, -1, -1, -1, -1}
                };
        java.util.logging.Logger.getGlobal().info("" + hourglassSum(teste1));
        java.util.logging.Logger.getGlobal().info("" + hourglassSum(teste2));
        java.util.logging.Logger.getGlobal().info("" + hourglassSum(teste3));
        java.util.logging.Logger.getGlobal().info("" + hourglassSum(teste4));
        java.util.logging.Logger.getGlobal().info("" + hourglassSum(teste5));
        java.util.logging.Logger.getGlobal().info("" + hourglassSum(teste6));
        java.util.logging.Logger.getGlobal().info("" + hourglassSum(teste7));
        java.util.logging.Logger.getGlobal().info("" + hourglassSum(teste8));
    }
}

