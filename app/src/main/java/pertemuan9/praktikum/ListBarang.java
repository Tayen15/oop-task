package pertemuan9.praktikum;

import java.util.*;

public class ListBarang {
     public static void main(String[] args) {
          List<String> barang = new ArrayList<String>();

          barang.add("Sapu");
          barang.add("Pel");
          barang.add("Ember");
          barang.add("Gayung");

          System.out.println("===Daftar Barang===");

          for (int i = 0; i < barang.size(); i++) {
               System.out.println("Barang ke-" + (i + 1) + " : " + barang.get(i));
          }

          barang.set(2, "Kain Lap");
          barang.remove("Gayung");
          barang.add("Kipas Angin");

          System.err.println("===Daftar Barang Setelah Update===");
          for (int i = 0; i < barang.size(); i++) {
               System.out.println("Barang ke-" + (i + 1) + " : " + barang.get(i));
          }
     }
}
