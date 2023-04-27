package punyaRipal;

import java.util.*;

class Mahasiswa {

    private long nim;
    private String nama;
    private String asal;

    public Mahasiswa(long nim, String nama, String asal) {
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;

    }

    public void displayMhs() {
        System.out.print("\tNIM: " + nim);
        System.out.print(" Nama: " + nama);
        System.out.println(", asal: " + asal);
    }

    public long getNim() {
        return nim;

    }

    public String getNama() {
        return nama;
    }
}

class DataArray {

    private Mahasiswa[] mhs;
    private int nElemen;

    public DataArray(int max) {
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }

    public void insert(long nim, String nama, String asal) {
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }

    public void displayArray() {
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }

    public void mergeSortByName() {
        mergeSortByName(0, nElemen - 1);
    }

    private void mergeSortByName(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSortByName(left, mid);
            mergeSortByName(mid + 1, right);

            mergeByName(left, mid, right);
        }
    }

    private void mergeByName(int left, int mid, int right) {
        Mahasiswa[] temp = new Mahasiswa[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (mhs[i].getNama().compareTo(mhs[j].getNama()) < 0) {
                temp[k++] = mhs[i++];
            } else {
                temp[k++] = mhs[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = mhs[i++];
        }

        while (j <= right) {
            temp[k++] = mhs[j++];
        }

        for (i = 0; i < k; i++) {
            mhs[left + i] = temp[i];
        }
    }

    public void shellSortByNim() {
        int in, out;
        Mahasiswa temp;

        int h = 1;
        while (h <= nElemen / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (out = h; out < nElemen; out++) {
                temp = mhs[out];
                in = out;

                while (in > h - 1 && mhs[in - h].getNim() >= temp.getNim()) {
                    mhs[in] = mhs[in - h];
                    in -= h;
                }

                mhs[in] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    public void quickSort() {
        recQuickSort(0, nElemen - 1);
    }

    private void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            String pivot = mhs[right].getNama();
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    private int partitionIt(int left, int right, String pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (mhs[++leftPtr].getNama().compareTo(pivot) < 0);
            while (rightPtr > 0 && mhs[--rightPtr].getNama().compareTo(pivot) > 0);
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    private void swap(int dex1, int dex2) {
        Mahasiswa temp = mhs[dex1];
        mhs[dex1] = mhs[dex2];
        mhs[dex2] = temp;
    }
}

public class DataArrayApp3 {

    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);
        arr.insert(16650290, "Jundi", "Malang");
        arr.insert(16650280, "Ahmad", "Sidoarjo");
        arr.insert(16650270, "Ismail", "Banyuwangi");
        arr.insert(16650260, "Sofi", "Semarang");
        arr.insert(16650250, "Dinda", "Bandung");
        arr.insert(16650240, "Rais", "Ambon");
        arr.insert(16650230, "Helmi", "Madura");
        arr.insert(16650220, "Agung", "Madiun");
        arr.insert(16650210, "Arina", "Malang");

        System.out.println("data awal: ");
        arr.displayArray();

        System.out.println("data urut melalui nama yang dimerge sort: ");
        arr.mergeSortByName();
        arr.displayArray();

        System.out.println("data urut melalui nim yang dishell sort: ");
        arr.shellSortByNim();
        arr.displayArray();

        System.out.println("data urut melalui nama yang diquick sort: ");
        arr.quickSort();
        arr.displayArray();

    }
}
