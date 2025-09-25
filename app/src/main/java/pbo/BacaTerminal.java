package pbo;

import java.util.Scanner;

public class BacaTerminal {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Nama anda ? ");
          String nama = scan.nextLine(); // baca masukan
          System.out.println("Pa kabar " + nama + " ?");
          scan.close();
     }
}
