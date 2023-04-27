public class Cats2{
	
	public static void main(String[] args) {
		
		//ukuran 4x3
		String[][] cats = {{"Terry", "Brown"},
						{"Kittie", "White"},
						{"Tobyy", "Gray"},
						{"Fido", "John"}};
		//ukuran 3x3
		String[][] dogs = {{"Andi", "Budi", "Tono"},
							{"Tio", "Saputra", "Maulana"},
							{"Ageng", "Putra", "Pratama"}};  
						
		cetakArray2D(cats);
		System.out.println("");
		cetakArray2D(dogs);
}
	public static void cetakArray2D(String[][] myArray){	
		for(int baris=0; baris<myArray.length; baris++){
	
		for(int kolom=0; kolom<myArray[baris].length; kolom++){
			
			System.out.print(myArray[baris][kolom] + "\t");
			}
			System.out.println("");		
			}	
	}		
}
