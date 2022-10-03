package me.christian.binary_search;

public class BinarySearch {

    public int find(int target, int[] list) {
        int left = 0, right = list.length - 1;
        while (left <= right) {
            int middle = (left + right)/2;

            if (target == list[middle]) {
                return middle;
            } else if (target > list[middle]) {
                left = middle + 1;
            } else if (target < list[middle]) {
                right = middle - 1;
            }
        }
        return -1;
    }

}
