/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punyaRipal;

/**
 *
 * @author Saintek21
 */
public class QuickSortArray {
    
    private long[] arr;
    private int nElemen;
    
    public QuickSortArray(int max) {
        arr = new long[max];
        nElemen = 0;
    }
    
    public void insert(long value) {
        arr[nElemen] = value;
        nElemen++;
    }
    
    public void display() {
        System.out.print("Array: ");
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public void swap(int index1, int index2) {
        long temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    public void QuickSort() {
        recQuickSort(0, nElemen - 1);
    }
    
    public void recQuickSort(int batasKiri, int batasKanan) {
        if (batasKanan - batasKiri <= 0) {
            return;
        } else {
            int pivot = (int) arr[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi - 1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }
    
    public int partitionIt(int batasKiri, int batasKanan, int pivot) {
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan + 1;
        while (true) {
            while (indexKiri < batasKanan && arr[++indexKiri] < pivot) ;
            while (indexKanan > batasKiri && arr[--indexKanan] > pivot) ;
            if (indexKiri >= indexKanan) {
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
        }
        return indexKiri;
    }
    
    public static void main(String[] args) {
        QuickSortArray arr = new QuickSortArray(8);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(0);
        arr.display();
        arr.QuickSort();
        arr.display();
    }
}
