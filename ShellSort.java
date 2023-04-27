package punyaRipal;

import java.util.Arrays;

public class ShellSort {

    private int[] arr;
    private int nElemen;

    public ShellSort(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void display() {
        System.out.println("Array:");
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void shellSortSummon() {
        int in, out, temp;
        int h = 1;

        while (h <= nElemen / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = arr[out];
                in = out;
                while (in > h - 1 && arr[in - h] >= temp) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    public void shellSortSummon2() {
        int in, out, temp;
        int h = nElemen / 2;
        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = arr[out];
                in = out;
                while (in > h - 1
                        && arr[in - h] >= temp) {
                    arr[in] = arr[in - h];
                    in -= h;
                }
                arr[in] = temp;
            }
            h /= 2;
        }
    }

    public static void main(String[] args) {
        ShellSort arr = new ShellSort(8);

        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(00);

        arr.display();
        arr.shellSortSummon();
        arr.display();
    }
}
