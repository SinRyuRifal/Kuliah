import java.util.*;
public class rumah {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Berapa harga rumahnya?");
		int hargarumah = sc.nextInt();

		System.out.println("Berapa tabungan awal anda?");
		int tabunganawal = sc.nextInt();

		System.out.println("Berapa jumlah uang yang anda tabung tiap bulan?");
		int uangperbulan = sc.nextInt();
		System.out.println(" ");

			System.out.print(tabunganawal + " ");
			for (int i=0; i >= 0; i++){ 
			tabunganawal = tabunganawal + uangperbulan;
			System.out.print(tabunganawal + " ");

			//agar berhenti saat sudah melewati target harga rumah yakni 20jt
			if (tabunganawal >= hargarumah ) {
			break;
		}
	}


}
}