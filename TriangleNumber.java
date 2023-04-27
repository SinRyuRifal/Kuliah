/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punyaRipal;

/**
 *
 * @author Saintek21
 */
public class TriangleNumber {

    public static void main(String[] args) {
        int n = 5;
        int resultIter = triangleIter(n);
        int resultRecur = triangleRecur(n);
        int resultIter2 = factorialIter(n);
        int resultRecur2 = factorialRecur(n);
        
        System.out.println("Bilangan segitinya adalah " + n
                + " Jika dikerjakan menggunakan iterasi: " + resultIter);
        System.out.println("Bilangan segitinya adalah " + n
                + " Jika dikerjakan menggunakan rekursi: " + resultRecur);
        System.out.println("Faktorialnya adalah: " + n
                + " Jika dikerjakan menggunakan iterasi: " + resultIter2);
        System.out.println("Faktorialnya adalah: " + n
                + " Jika dikerjakan menggunakan rekursi: " + resultRecur2);
    }

    public static int triangleIter(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }

    public static int triangleRecur(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangleRecur(n - 1);
        }
    }

    public static int factorialIter(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecur(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecur(n - 1);
        }
    }

}
