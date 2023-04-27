package punyaRipal;
public class method2{
	
	//mendefinisikan function Persegi Panjang
	static int luasPP(int panjang,int lebar){
		int luas1 = panjang * lebar;
		return luas1;
	}

	//mendefinisikan function Bujur Sangkar
	static int luasBS(int sisi){
		int luas2 = sisi * sisi;
		return luas2;
	}
		
	//memanggil function
	public static void main(String[] args) {
		int panjang = 10;
		int lebar = 5;
		int sisi = 4;

		int luasPersegiPanjang = luasPP(panjang,lebar);
		int luasBujurSangkar = luasBS(sisi);

		System.out.println("Luas persegi panjang tersebut = " + luasPersegiPanjang + " cm");
		System.out.println("Luas bujur sangkar tersebut = " + luasBujurSangkar + " cm");
	}
}