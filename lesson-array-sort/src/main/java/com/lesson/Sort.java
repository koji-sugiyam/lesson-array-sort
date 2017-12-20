package com.lesson;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        Sort sort = new Sort();

        int[] source = sort.generateRandomArray(Integer.parseInt(args[0]));
        int[] result = sort.sort(source);
        for (int n : result) {
            System.out.println(n);
        }
    }

    public int[] generateRandomArray(int n) {
        Random randomizer = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = randomizer.nextInt();
        }
        return array;
    }

    public int[] sort(int[] source) {
        int[] result = new int[source.length];
        System.arraycopy(source, 0, result, 0, source.length);

        doSort(result);
        return result;
    }

    private void doSort(int[] result) {
        // write the awesome code
    }
}