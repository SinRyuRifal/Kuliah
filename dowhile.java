package punyaRipal;
import java.util.*;
public class dowhile {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Anda makan berapa kali?");
int makan = sc.nextInt();
int num = 0;
do {
	System.out.println("Makan");
	num = num + 1;
	}										
	while (num < makan);
}
}