package br.com.adrianorodrigues.algoritms.sort;

import br.com.adrianorodrigues.util.array.ArrayUtils;

import java.io.IOException;
import java.util.*;

public class QuickSort {
    // Pior caso O(n²)
    // Caso medio O(n log n)
    // Melhor caso O(n log n)
    // Pior caso memória O(n)

    private static List<Integer> sort(List<Integer> list, int begin, int end){
        Integer pivoIndex = getPivoIndex(begin, end);
        Integer pivo = list.get(pivoIndex);
        int higherNumberIndex = begin;
        int lowerNumberIndex = end;
        while(partitionIsNotComplete(higherNumberIndex, lowerNumberIndex)){
            higherNumberIndex = findFirstHigherNumber(list, pivo, higherNumberIndex);
            lowerNumberIndex = findFirstLowerNumber(list, pivo, lowerNumberIndex);
            if(mustSwap(higherNumberIndex, lowerNumberIndex)){
                list = swap(list, higherNumberIndex, lowerNumberIndex);
                higherNumberIndex = getNextHigherNumber(higherNumberIndex);
                lowerNumberIndex = getNextLowerNumber(lowerNumberIndex);
            }
        }
        sortFirstPartitionRecursevily(list, begin, lowerNumberIndex);
        sortSecondPartitionRecursively(list, end, higherNumberIndex);
        return list;
    }

    private static int getNextHigherNumber(int higherNumberIndex) {
        return higherNumberIndex + 1;
    }

    private static Integer getNextLowerNumber(int lowerNumberIndex) {
        return lowerNumberIndex - 1;
    }

    private static List<Integer> swap(List<Integer> list, int higherNumberIndex, int lowerNumberIndex) {
        Integer aux = list.get(higherNumberIndex);
        list.set(higherNumberIndex, list.get(lowerNumberIndex));
        list.set(lowerNumberIndex, aux);
        return list;
    }

    private static boolean mustSwap(int higherNumberIndex, int lowerNumberIndex) {
        return higherNumberIndex <= lowerNumberIndex;
    }

    private static void sortSecondPartitionRecursively(List<Integer> list, int end, int i) {
        if(end > i)
            sort(list, i, end);
    }

    private static void sortFirstPartitionRecursevily(List<Integer> list, Integer begin, Integer j) {
        if(begin < j)
            sort(list, begin, j);
    }

    private static boolean partitionIsNotComplete(int higherNumberIndex, int lowerNumberIndex) {
        return higherNumberIndex < lowerNumberIndex;
    }

    private static int findFirstLowerNumber(List<Integer> list, Integer pivo, int j) {
        while(list.get(j) > pivo)
            j = j - 1;
        return j;
    }

    private static int findFirstHigherNumber(List<Integer> list, Integer pivo, Integer i) {
        while(list.get(i) < pivo)
            i = i + 1;
        return i;
    }

    private static Integer getPivoIndex(int begin, int end) {
        return (begin + end) / 2;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> list = ArrayUtils.generateArrayFromSize(10);
        System.out.println("------------------Inicio-------------------");
        ArrayUtils.printArray(list);
        System.out.println("-------------------------------------------");
        ArrayUtils.printArray(sort(list, 0, list.size() -1));
        System.out.println("------------------Fim-------------------");
    }

}
