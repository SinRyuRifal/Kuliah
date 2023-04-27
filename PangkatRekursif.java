/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punyaRipal;

/**
 *
 * @author Saintek21
 */
import java.util.Scanner;

public class PangkatRekursif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int base = input.nextInt();
        System.out.print("Masukkan pangkat: ");
        int exponent = input.nextInt();
        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            int half = power(base, exponent / 2);
            return half * half;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
