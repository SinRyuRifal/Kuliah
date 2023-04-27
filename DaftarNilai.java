package punyaRipal;
import java.util.*;

public class DaftarNilai{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan nilai murid: ");
		int nilai = sc.nextInt();

		if(nilai >=0 && nilai <=50)
			System.out.println("Bodo banget dapet E");
		else if(nilai >=51 && nilai <=65)
			System.out.println("Mayan lah dapet D");
		else if(nilai >=66 && nilai <=75)
			System.out.println("Not bad dapet C");
		else if(nilai >=76 && nilai <=90)
			System.out.println("Keren dapet B");
		else if(nilai >=91 && nilai <=100)
			System.out.println("Kamu dapet A nyontek siapa");
		else
			System.out.println("Nilai Ilegal");
	}
}
		
		
		
