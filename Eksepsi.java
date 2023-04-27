package punyaRipal;
public class Eksepsi {

    public static void main(String[] args) {
        int[] arr = new int [10];
        try {
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Maaf, gaada bang");
        }
    }
}