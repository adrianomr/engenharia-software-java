package br.com.adrianorodrigues.util.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUtils {
    public static List<Integer> generateArrayFromSize(int size){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(((Double)(Math.random()*100)).intValue());
        }
        return list;
    }

    public static void printArray(List list) {
        list
                .stream()
                .forEach(System.out::println);
    }
}
