package punyaRipal;
public class method{
	
	//mendefiniskan prosedur
	static void prosedurShalom(){
		System.out.println("Homswastiastu");
	}

	//mendefinisikan function
	static String fungsiShalom(String nama){
		String menyapa = "Homswastiastu" + nama;
		return menyapa;
	}

	public static void main(String[] args) {
		//memanggil prosedur	
		prosedurShalom();

		//memanggil function/method
		String salam = fungsiShalom(" JoniJohn");
		System.out.println(salam);
	}

}