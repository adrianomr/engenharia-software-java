package br.com.adrianorodrigues.algoritms;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.io.FileNotFoundException;
import java.util.HashMap;

@Logger
public class ReverseArray {


    static int[] reverseArray(int[] a) {
        int[] reverseArray = new int[a.length];
        for (int i = 1; i <= a.length; i++)
            reverseArray[a.length - i] = a[i - 1];
        return reverseArray;
    }

    static void logArray(int[] a) {
        String array = "[";
        for (int i = 0; i < a.length; i++)
            array += a[i] + ", ";
        array += "]";
        java.util.logging.Logger.getGlobal().info(array);
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[] teste1 = {1,2,1,2,1,3,2,3,2};
        int[] teste2 = {1};
        int[] teste3 = {1,2,1,2};
        int[] teste4 = {1,2,3,2,1};
        logArray(reverseArray(teste1));
        logArray(reverseArray(teste2));
        logArray(reverseArray(teste3));
        logArray(reverseArray(teste4));
    }
}

