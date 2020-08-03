package br.com.adrianorodrigues.algoritms;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortedQueue {
    Queue<Integer> minQueue = new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> maxQueue = new PriorityQueue<>();

    public void add(int value) {
        Integer minVal = minQueue.isEmpty() ? null : minQueue.peek();
        Integer maxVal = maxQueue.isEmpty() ? null : maxQueue.peek();
        if (minQueue.size() > maxQueue.size()) {
            if (minVal > value) {
                minQueue.poll();
                minQueue.add(value);
                maxQueue.add(minVal);
            } else
                maxQueue.add(value);
        } else {
            if (maxVal == null || maxVal < value) {
                if (maxVal != null && minQueue.size() < maxQueue.size()) {
                    maxQueue.poll();
                    minQueue.add(maxVal);
                }
                maxQueue.add(value);
            } else
                minQueue.add(value);
        }
    }

    public int[] peakHalf() {
        if (minQueue.size() == maxQueue.size()) {
            if (minQueue.size() == 0)
                return new int[0];
            else
                return new int[]{minQueue.peek(), maxQueue.peek()};
        } else {
            if (minQueue.size() > maxQueue.size())
                return new int[]{minQueue.peek()};
            else
                return new int[]{maxQueue.peek()};
        }
    }

}
