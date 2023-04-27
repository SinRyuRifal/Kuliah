package punyaRipal;
import java.util.*;
public class tugashari {
	public static void main(String[] args) {
int month,year;
Scanner sc = new Scanner(System.in);
System.out.println("Program ini digunakan untuk mengecek jumlah");
System.out.println("pilih bulan dari 1-12");
month = sc.nextInt();
System.out.println("tahun berapa?");
year = sc.nextInt();
switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.print("31 Hari" );	
	break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.print("30 Hari" );	
	break;
	
	case 2:

if (year % 400 == 0) {
      System.out.println("29 hari");
    }
    else if (year % 100 == 0) {
      System.out.println("28 hari");
    }
    else if (year % 4 == 0) {
      System.out.println("29 hari");
    }
    else {
      System.out.println("28 hari");
  }
}	
	}
}