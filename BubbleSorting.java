package punyaRipal;
import java.util.*;
public class BubbleSorting {

	//Program belajar mengurutkan data pada array
	public static void main(String[] args) {
		final int Panjang_Array = 10;
		int[] arrOriginal = new int[Panjang_Array];

		arrOriginal = isiArray(arrOriginal);
		System.out.println("Data sebelum disorting: ");
		CetakArray(arrOriginal);

		//memproses dengan bubble sorting
		System.out.println("Data setelah disorting: ");

		//long startTime = System.currentTimeMillis()
		int[] arrUrut = bubbleSort(arrOriginal);
		CetakArray(arrUrut);
	}

		static int[] bubbleSort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j=0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					//swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		return arr;
	}


	//fungsi untuk mengisi array dengan data random
	static int[] isiArray(int[] myArray) {

		for (int i = 0; i<myArray.length; i++ ) {
			myArray[i] = (int) (Math.random() * 100);
			}
			return myArray;
	}
	
	//fungsi untuk mencetak array
	static void CetakArray(int[] myArray){
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);

			
			}
		}	
	}
