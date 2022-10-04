package me.christian;

import me.christian.binary_search.BinarySearch;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Scanner scanner = new Scanner(System.in);
        final BinarySearch binarySearch = new BinarySearch();

        // Run 10 times to give user a few runs to see the difference.
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter an array size: ");
            int num = scanner.nextInt();
            int[] arrayToProcess = generateRandomSortedArray(num);
            System.out.printf("%s ... %s\n",arrayToProcess[0],arrayToProcess[arrayToProcess.length-1]);
            System.out.println("Please pick a number from this list.. or not");
            int target = scanner.nextInt();

            long startMilli1 = System.currentTimeMillis();
            int res1 = binarySearch.find(target, arrayToProcess);
            long diffMilli1 = System.currentTimeMillis() - startMilli1;
            long startMilli2 = System.currentTimeMillis();
            int res2 = -1;
            for (int r = 0; r < arrayToProcess.length; r++)
                if (arrayToProcess[r] == target) res2 = r;
            long diffMilli2 = System.currentTimeMillis() - startMilli2;

            System.out.printf("%n%s is located at index %s.%n", target, res1);
            System.out.printf("Total milliseconds taken for binary search: %sms.%n%n", diffMilli1);
            System.out.printf("%s is located at index %s.%n", target, res2);
            System.out.printf("Total milliseconds taken for linear search: %sms.%n%n", diffMilli2);
            Thread.sleep(5000);
        }
    }

    private static int[] generateRandomSortedArray(int size) {
        int[] listOfInts = new int[size+1];
        for (int i = 0; i < size; i++)
            listOfInts[i] = i+1;
        Arrays.sort(listOfInts);
        return listOfInts;
    }
}