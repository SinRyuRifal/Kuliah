public class FlashSale{

	public static void main(String[] args) {
		
		//deklarasi array
		int[] harga = new int[10];

		harga[0] = 20000;
        harga[1] = 30000;
        harga[2] = 10000;
        harga[3] = 20000;
        harga[4] = 30000;
        harga[5] = 10000;
        harga[6] = 10000;
        harga[7] = 20000;
        harga[8] = 30000;
        harga[9] = 10000;

        //mencetak isi array
        for(int i=0; i<harga.length; i++){
                //FlashSale diskon 20%
                double hargaStlhDiskon = harga[i] - (harga[i]*0.2);

                //Tampilkan harga updatenya
                System.out.println("harga setelah diskon = " + hargaStlhDiskon);
                    }
 	}
}