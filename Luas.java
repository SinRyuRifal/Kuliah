package punyaRipal;
import java.util.*;

public class Luas{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inputkan Alas");
		int alas = sc.nextInt();
		System.out.println("Inputkan Tinggi");
		int tinggi = sc.nextInt();
		double luas = 0.5 * alas * tinggi;
		System.out.println("luas segitiga tersebut adalah " + luas);
	}
}