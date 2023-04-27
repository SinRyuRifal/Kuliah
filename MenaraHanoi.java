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

public class MenaraHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah cakram: ");
        int jumlahCakram = sc.nextInt();
        doMenara(jumlahCakram, "A", "B", "C");
        sc.close();
    }

    public static void doMenara(int n, String start, String temp, String end) {
        if (n == 1) {
            System.out.println(start + " -> " + end);
        } else {
            doMenara(n - 1, start, end, temp);
            System.out.println(start + " -> " + end);
            doMenara(n - 1, temp, start, end);
        }
    }
}
