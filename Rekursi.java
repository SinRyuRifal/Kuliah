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
class fakorial {

    public static int faktorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}

    class fibonaci {

        public static int fibonaci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonaci(n - 1) + fibonaci(n - 2);
            }
        }

    }

    class cariElemen {

        public static int cariElemen(int[] arr, int x, int i) {
            if (i >= arr.length) {
                return -1;
            } else if (arr[i] == x) {
                return i;
            } else {
                return cariElemen(arr, x, i + 1);
            }
        }

    }


    public class Rekursi {

        public static void main(String[] args) {
            
            int n = 5;
            int hasilFaktorial = faktorial(n);
            System.out.println(n + "! = " + hasilFaktorial);

            
            int m = 7;
            int hasilFibonaci = fibonaci(m);
            System.out.println("Seri Fibonaci dengan panjang " + m + " adalah:");
            for (int i = 0; i < m; i++) {
                System.out.print(fibonaci(i) + " ");
            }
            System.out.println();
            System.out.println("Elemen pada indeks ke-4 dalam seri Fibonaci adalah: " + hasilFibonaci);

            
            int[] arr = {3, 5, 2, 7, 1, 8};
            int x = 7;
            int indeksX = cariElemen(arr, x, 0);
            System.out.println("Array: " + Arrays.toString(arr));
            System.out.println("Elemen " + x + " ditemukan pada indeks ke-" + indeksX);
        }

        public static int faktorial(int n) {
            if (n <= 1) {
                return 1;
            } else {
                return n * faktorial(n - 1);
            }
        }

        public static int fibonaci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonaci(n - 1) + fibonaci(n - 2);
            }
        }

        public static int cariElemen(int[] arr, int x, int i) {
            if (i >= arr.length) {
                return -1;
            } else if (arr[i] == x) {
                return i;
            } else {
                return cariElemen(arr, x, i + 1);
            }
        }
    }
