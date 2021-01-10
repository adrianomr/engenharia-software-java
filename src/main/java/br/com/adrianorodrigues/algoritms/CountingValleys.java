package br.com.adrianorodrigues.algoritms;

import jdk.nashorn.internal.runtime.logging.Logger;

import java.io.FileNotFoundException;

@Logger
public class CountingValleys {

    public static final char UPHILL = 'U';
    public static final char DOWNHILL = 'D';
    public static final char SEALEVEL = 'S';

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int altitude = 0;
        char status = SEALEVEL;
        int valleys = 0;
        for (int step = 0; step < steps; step++){
            char stepDirection = path.charAt(step);
            altitude = updateAltitudeCount(altitude, stepDirection);
            char newStatus = calculateNewStatus(altitude);
            valleys = updateValleysCount(status, newStatus, valleys);
            status = newStatus;
        }
        return valleys;
    }

    private static int updateValleysCount(char status, char newStatus, int valleys) {
        int increment = status == SEALEVEL && newStatus == DOWNHILL ? 1 : 0;
        return valleys + increment;
    }

    private static char calculateNewStatus(int altitude) {
        if(altitude > 0)
            return UPHILL;
        if(altitude < 0)
            return DOWNHILL;
        return SEALEVEL;
    }

    private static int updateAltitudeCount(int altitude, char stepDirection) {
        int stepElevation = stepDirection == UPHILL ? 1 : -1;
        return altitude + stepElevation;
    }

    public static void main(String[] args) throws FileNotFoundException {
        java.util.logging.Logger.getGlobal().info("Valleys " + countingValleys(7, "DUUDUUD"));
        java.util.logging.Logger.getGlobal().info("Valleys " + countingValleys(3, "DDD"));
        java.util.logging.Logger.getGlobal().info("Valleys " + countingValleys(2, "UD"));
        java.util.logging.Logger.getGlobal().info("Valleys " + countingValleys(10, "DUUDUUDDDD"));
    }
}

