public class CountingSort {

    public static void countingSortDescending(int[] arr) {
        // Cari nilai maksimum
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Buat array hitung
        int[] count = new int[max + 1];

        // Menghitung frekuensi kemunculan setiap angka
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Menuliskan kembali ke array asli dengan urutan dari besar ke kecil
        int index = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {90, 40, 20, 50, 30, 60, 70, 80};

        System.out.println("Data Sebelum Sorting:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        countingSortDescending(data);

        System.out.println("\n\nData Setelah Sorting (Terbesar ke Terkecil):");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
