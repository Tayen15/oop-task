package pbo;

public class HitungRataRata {
     public static void main(String[] args) {
          // Simpan data himpunan bilangan bulat di variabel array bilangan
          int[] bilangan = { 1, 2, 3, 5, 6, 7, 9, 10, 23 };

          // Hitung jumlah semua bilangan
          int jumlah = 0;
          for (int i = 0; i < bilangan.length; i++) {
               jumlah += bilangan[i];
          }

          // Hitung rata-rata dan simpan di variabel yang dapat menampung nilai pecahan
          double rata2 = (double) jumlah / bilangan.length;

          // Cetak hasil
          System.out.println("Data bilangan: ");
          for (int i = 0; i < bilangan.length; i++) {
               System.out.print(bilangan[i] + " ");
          }
          System.out.println();
          System.out.println("Jumlah: " + jumlah);
          System.out.println("Banyak data: " + bilangan.length);
          System.out.println("Rata-rata: " + rata2);
     }
}