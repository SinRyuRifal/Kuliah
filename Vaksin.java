package punyaRipal;
import java.util.*;
public class Vaksin{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Jika anda ingin melakukan vaksin ? masukkan umur anda terlebih dahulu : ");
		int umur = sc.nextInt();
		if(umur >= 18)
		   System.out.println("Anda wajib vaksin!"); 
		else if(umur >= 7)
			System.out.println("Anda boleh vaksin.");
		else 
			System.out.println("Anda tidak perlu vaksin");
	}
}		