package punyaRipal;
public class method3{
//mendefinisikan function
	static String fungsiShalom(String nama){
		String menyapa = "Homswastiastu" + nama;
		return menyapa;
	}
public static void main(String[] args) {
	//memanggil function/method

		String nama = " JoniJohn";

		String salam = fungsiShalom(nama);
		System.out.println(salam);
	}

}