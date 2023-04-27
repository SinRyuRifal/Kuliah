public class Cats{
	
	public static void main(String[] args) {
	
		String[][] cats = {{"Terry", "Brown"},
						{"Kittie", "White"},
						{"Tobyy", "Gray"},
						{"Fido", "John"}};

//menampilkan satu kucing
System.out.println(cats[0][0]);
System.out.println(cats[1][0]);

//tampilkan semua kucing

for(int baris=0; baris<4; baris++){
	
	for(int kolom=0; kolom<2; kolom++){
		
		System.out.print(cats[baris][kolom] + "\t");
		}
		System.out.println("");		
		}	
	}		
}
