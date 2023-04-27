package punyaRipal;
public class Array2{

	public static void main(String[] args) {
		
		//deklarasi array
		int[] usia = new int[10];

	usia[0] = 20;
        usia[1] = 30;
        usia[2] = 10;
        usia[3] = 20;
        usia[4] = 30;
        usia[5] = 10;
        usia[6] = 10;
        usia[7] = 20;
        usia[8] = 30;
        usia[9] = 10;

        //mencetak isi array
        
        for(int i=0; i<usia.length; i++){
            if(usia[i]<18)
                System.out.println("Anda belum punya ktp");
            else
                System.out.println("Anda sudah punya KTP");
        }
 	}
}