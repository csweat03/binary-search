package me.christian;

import me.christian.binary_search.BinarySearch;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final BinarySearch binarySearch = new BinarySearch();

        // Run 10 times to give user a few runs to see the difference.
        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter an array size: ");
            int num = scanner.nextInt();
            int[] arrayToProcess = generateRandomSortedArray(num);
            System.out.println("Here is your array of numbers:\n"+Arrays.toString(arrayToProcess));
            System.out.println("Please pick a number from this list.. or not");
            int target = scanner.nextInt();

            long startMilli = System.currentTimeMillis();
            System.out.printf("%s is located at index %s.", target, binarySearch.find(target, arrayToProcess));
            System.out.printf("Total milliseconds taken: %sms", System.currentTimeMillis() - startMilli);
        }
    }

    private static int[] generateRandomSortedArray(int size) {
        int[] listOfInts = new int[size+1];
        for (int i = 0; i < size; i++)
            listOfInts[i] = new Random().nextInt(size * 2);
        Arrays.sort(listOfInts);
        return listOfInts;
    }
}