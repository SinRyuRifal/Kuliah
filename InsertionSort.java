import java.util.*;
public class InsertionSort {

    //Program belajar mengurutkan data pada array
    public static void main(String[] args) {
        final int Panjang_Array = 10;
        int[] arrOriginal = new int[Panjang_Array];

        arrOriginal = isiArray(arrOriginal);
        System.out.println("Data sebelum disorting: ");
        CetakArray(arrOriginal);

        //memproses dengan Insertion Sort
        System.out.println("Data setelah disorting: ");

        //long startTime = System.currentTimeMillis()
        int[] arrUrut = insertionSort(arrOriginal);
        CetakArray(arrUrut);
    }

        static int[] insertionSort(int arr[])
    {
        //fungsi untuk insertion sort nya
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
                {
                    //memindahkan element yang lebih besar dari "temp", 
                    //ke satu posisi di depan dari posisi saat ini
                    while (j >= 0 && arr[j] > temp) {
                    arr[j+1] = arr[j];
                    j=j-1;
                    }
                arr[j+1] = temp;
                }
        }
        return arr;
    }


    //fungsi untuk mengisi array dengan data random
    static int[] isiArray(int[] myArray) {

        for (int i = 0; i<myArray.length; i++ ) {
            myArray[i] = (int) (Math.random() * 100);
            }
            return myArray;
    }
    
    //fungsi untuk mencetak array
    static void CetakArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);

            
            }
        }   
    }
