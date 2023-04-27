public class OperasiString {
	public static void main(String[] args) {
		
		String s = "Pemrograman Java    ";
		String replace1 = s.replace("Pemrograman", "program");
		String replace2 = "Java".replace('v','w');

		System.out.println("Mengubah menjadi kapital semua\t" + s.toUpperCase());
		System.out.println("Mengubah menjadi huruf kecil semua\t" + s.toLowerCase());
		System.out.println("Mengambil char di posisi tertentu\t" + s.charAt(5));
		System.out.println("Membersihkan akhir\t" + s.trim());
		System.out.println("Memanggil substring\t" + s.substring(5, 15));
		System.out.println("Memanggil replace\t" + replace1 + " " + replace2);
		System.out.println("Memanggil indexOf\t" + s.indexOf("Java"));

		String nama = "Agus Harimurti Jokowi";
		String singkatan = buatInisial(nama);
		System.out.println("inisialnya = " + singkatan);
		}

		static String buatInisial(String nama) {
			String inisial = "";

			//split nama
			String[] sukuKata = nama.split(" ");

			for(int i=0; i<sukuKata.length; i++) {
				//ambil huruf pertama setiap kata
				inisial = inisial + sukuKata[i].charAt(0);

			}

			return inisial;
			
		}
}