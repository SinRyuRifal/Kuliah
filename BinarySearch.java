/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punyaRipal;

/**
 *
 * @author Saintek21
 */
public class BinarySearch {
    public static int find(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 9, 11, 13 };
        int value = 7;

        int index = find(arr, value);

        if (index != -1) {
            System.out.println("Value " + value + " is found at index " + index);
        } else {
            System.out.println("Value " + value + " is not found in the array.");
        }
    }
}
