/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punyaRipal;

/**
 *
 * @author Saintek21
 */
import java.util.Arrays;
import java.util.Random;

    public class ArrayOrderedInsertion {
    private int[] arr;
    private int size;
    private int capacity;

    public ArrayOrderedInsertion(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public void insert(int value) {
        int i;
        for (i = size - 1; i >= 0 && arr[i] > value; i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = value;
        size++;
    }

    public static void main(String[] args) {
        ArrayOrderedInsertion arr = new ArrayOrderedInsertion(10);
        arr.insert(7);
        arr.insert(3);
        arr.insert(1);
        arr.insert(9);
        arr.insert(4);
        arr.insert(6);
        arr.insert(2);
        arr.insert(8);
        arr.insert(5);
        arr.insert(0);
        for (int i = 0; i < arr.size; i++) {
            System.out.print(arr.arr[i] + " ");
        }
    }
}
