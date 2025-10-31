package pertemuan6.abstrak;

public class SuaraHewan {
     public static void main(String[] args) {
          Hewan kucing = new Kucing();
          Hewan anjing = new Anjing();
          Hewan kambing = new Kambing();

          Hewan suara[] = {kucing, anjing, kambing};
          for (Hewan hewan : suara) {
               hewan.bersuara();
          }
     }
}
