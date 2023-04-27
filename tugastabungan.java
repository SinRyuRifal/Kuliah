package punyaRipal;
import java.util.*;
public class tugastabungan {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Berapa bulan lama anda menabung?");
int bulan = sc.nextInt();
System.out.println("Berapa saldo awal anda?");
int saldoawal = sc.nextInt();
System.out.println("Berapa uang yang anda setorkan tiap bulan?");
int setor = sc.nextInt();
System.out.println(" ");

	System.out.print(saldoawal + " ");
	for (int i=0; i < bulan; i++){
		saldoawal = saldoawal + setor;
		System.out.print(saldoawal + " ");
	}


}
}