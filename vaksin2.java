package punyaRipal;
import java.util.*;

public class vaksin2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.println("1 = moderna");
                System.out.println("2 = astrazeneca");
                System.out.println("3 = virus zombie1");
		System.out.println("Vaksin ke berapakah yang sudah anda lakukan?");
		int v1 = sc.nextInt();
		System.out.println("Vaksin ke berapakah yang sudah anda lakukan?");
		int v2 = sc.nextInt();
		if(v1 == 1 & v2 == 1)
			System.out.println("Boleh 1, 2, dan 3");
		else if(v1 == 1 & v2 == 2)
			System.out.println("Boleh 2 dan 3");
		else if(v1 == 1 & v2 == 3)
			System.out.println("Boleh 3");
		else if(v1 == 2 & v2 == 1)
			System.out.println("Boleh 1, 2, dan 3");
		else if(v1 == 2 & v2 == 2)
			System.out.println("Boleh 2 dan 3");
		else if(v1 == 2 & v2 == 3)
			System.out.println("Boleh 3");
		else if(v1 == 3 & v2 == 1)
			System.out.println("Boleh 3");
		else if(v1 == 3 & v2 == 2)
			System.out.println("Boleh 3");
		else if(v1 == 3 & v2 == 3)
			System.out.println("Boleh 3");
		
	}
}