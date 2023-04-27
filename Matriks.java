public class Matriks{
	
	public static void main(String[] args) {
		
		int[][] matriksA= {{2,8}, 
							{4,6}};
		int[][] matriksB= {{3,1}, 
							{5,4}};
		int[][] matriksC= new int[2][2];

		for(int i=0; i<2; i++){

			for(int j=0; j<2; j++){
				matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
			}
		}

		cetakArray2D(matriksA);
		System.out.println("    +");
		cetakArray2D(matriksB);
		System.out.println("    =");
		cetakArray2D(matriksC);
		

}
	public static void cetakArray2D(int[][] myArray){	
		for(int baris=0; baris<myArray.length; baris++){
	
		for(int kolom=0; kolom<myArray[baris].length; kolom++){
			
			System.out.print(myArray[baris][kolom] + "\t");
			}
			System.out.println("");		
			}	
	}		
}
