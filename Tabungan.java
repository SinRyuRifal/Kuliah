package punyaRipal;
import java.util.*;
public class Tabungan {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Berapa harga rumahnya?");
int hargarumah = sc.nextInt();
System.out.println("Berapa tabungan awal anda?");
int tabunganawal = sc.nextInt();
System.out.println("Berapa jumlah uang yang anda tabung?");
int uang = sc.nextInt();
System.out.println(" ");

	System.out.print(tabunganawal + " ");
	for (int i=0; i < hargarumah; i++){
		tabunganawal = tabunganawal + uang;
		System.out.print(tabunganawal + " ");
	}


}
}