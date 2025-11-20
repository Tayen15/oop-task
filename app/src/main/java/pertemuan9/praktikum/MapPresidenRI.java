package pertemuan9.praktikum;

import java.util.Map;
import java.util.TreeMap;

public class MapPresidenRI {
     public static void main(String[] args) {
          Map<String, String> presiden = new TreeMap<String, String>();

          presiden.put("1-SKR", "Soekarno");
          presiden.put("2-HS", "Soeharto");
          presiden.put("3-BJ", "B.J. Habibie");
          presiden.put("4-AB", "Abdurrahman Wahid");
          presiden.put("5-MK", "Megawati Soekarnoputri");
          presiden.put("6-SBY", "Susilo Bambang Yudhoyono");
          presiden.put("7-JK", "Joko Widodo");
          presiden.put("8-PS", "Prabowo Subianto");

          System.out.println("Presiden RI ke-3 adalah " + presiden.get("3-BJ"));

          System.out.println("\nKode Presiden RI: " + presiden.keySet());

          System.out.println("\n===Daftar Presiden RI===");
          for (String kode : presiden.keySet()) {
               String nama = presiden.get(kode);
               System.out.println("Presiden dengan kode " + kode + " adalah " + nama);
          }
     }
}
