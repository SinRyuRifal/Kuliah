package punyaRipal;
public class Eksepsi2{

    public static void main(String[] args) {
        int[] penyebut = {2, 4, 6, 0, 8, 10};
        for(int i = 0; i < penyebut.length; i++) {      
         try {
            double hasil = 100 / penyebut[i];
            System.out.println("hasil pembagian =" + hasil);
        }
        catch(ArithmeticException ae) {
            System.out.println("Pembagian dengan nol, harap periksa lagi.");
        }
    }
}
}