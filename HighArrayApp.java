/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punyaRipal;

/**
 *
 * @author Saintek21
 */
class HighArray {

    private int[] arr;

    private int nElemen;

    public HighArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void orderedArrays() {
        for (int i = 0; i < nElemen; i++) {
            for (int j = 0; j < nElemen; j++) {
                if (arr[i] < arr[j]) {
                    int elem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = elem;
                }
            }
        }
        System.out.println("");
        for (int k = 0; k < nElemen; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

    }


    public boolean binarySearch(int key) {

        int i = 0;
        int tengah;
        while (i <= nElemen) {
            tengah = i + (nElemen - i) / 2;
            if (key == arr[tengah]) {
                return true;
            } else if (key < arr[tengah]) {
                nElemen = tengah - 1;
            } else {
                i = tengah + 1;
            }
        }

        return false;

    }

    public boolean find(int key) {

        int i;

        for (i = 0; i < nElemen; i++) {

            if (arr[i] == key) {

                break;

            }

        }

        if (i == nElemen) {

            return false;

        } else {

            return true;

        }

    }

    public boolean delete(int value) {
        int i;

        for (i = 0; i < nElemen; i++) {

            if (value == arr[i]) {

                break;

            }

        }

        if (i == nElemen) {

            return false;

        } else {

            for (int j = i; j < nElemen; j++) {

                arr[j] = arr[j + 1];

            }

            nElemen--;

            return true;

        }

    }

    public void display() {

        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

    }

}

public class HighArrayApp {

    public static void main(String[] args) {

        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(00);
        arr.insert(90);
        arr.insert(40);

        arr.display();
        int key = 100;
        if (arr.binarySearch(key)) {
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }

        arr.delete(00);
        arr.delete(80);
        arr.delete(55);

        arr.display();
        System.out.println(" ");
        System.out.println("Berikut ini setelah diurutkan");
        arr.orderedArrays();
       
    }

}
