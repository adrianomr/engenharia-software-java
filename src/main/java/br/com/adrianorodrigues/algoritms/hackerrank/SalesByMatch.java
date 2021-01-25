package br.com.adrianorodrigues.algoritms.hackerrank;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

@Logger
public class SalesByMatch {


    static int sockMerchant(int n, int[] ar) {
        int pairOfSocksNumber = 0;
        HashMap<Integer, Integer> socksPerColor = new HashMap<>();
        for(int i = 0; i < n; i++){
            int socksColor = ar[i];
            int socksColorCount = addSocksToMap(socksColor, socksPerColor);
            pairOfSocksNumber = updatePairOfSocksCount(pairOfSocksNumber, socksColorCount);
        }
        return pairOfSocksNumber;
    }

    private static int updatePairOfSocksCount(int pairOfSocksNumber, int socksColorCount) {
        if(socksColorCount % 2 == 0)
            return pairOfSocksNumber + 1;
        return pairOfSocksNumber;
    }

    private static int addSocksToMap(int socksColor, HashMap<Integer, Integer> socksPerColor) {
        if(!socksPerColor.containsKey(socksColor)){
            socksPerColor.put(socksColor, 0);
        }
        int socksColorCount = socksPerColor.get(socksColor) + 1;
        socksPerColor.put(socksColor, socksColorCount);
        return socksColorCount;
    }

    public static void main(String[] args) throws FileNotFoundException {
        int[] teste1 = {1,2,1,2,1,3,2,3,2};
        int[] teste2 = {1};
        int[] teste3 = {1,2,1,2};
        int[] teste4 = {1,2,3,2,1};
        java.util.logging.Logger.getGlobal().info("" + sockMerchant(9, teste1));
        java.util.logging.Logger.getGlobal().info("" + sockMerchant(1, teste2));
        java.util.logging.Logger.getGlobal().info("" + sockMerchant(4, teste3));
        java.util.logging.Logger.getGlobal().info("" + sockMerchant(5, teste4));
    }
}

