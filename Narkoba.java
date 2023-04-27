package punyaRipal;
import java.util.*;

public class Narkoba{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mau Konsumsi Narkoba? Masukkan Umur Anda : ");
		int umur = sc.nextInt();
		if(umur >= 18)
			System.out.println("Silahkan Nyabu");
		else if (umur >=6 )
			System.out.println("Belum cukup umur dek");
		else
			System.out.println("Mau mati kapan lu");
	}
}