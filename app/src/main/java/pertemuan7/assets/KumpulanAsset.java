package pertemuan7.assets;

public class KumpulanAsset {
     public static void main(String[] args) {
          Rumah r1 = new Rumah();
          r1.setLuas(120);
          r1.setTipe(45);
          
          Motor m1 = new Motor();
          m1.setMerk("Honda");
          m1.setCc(110);
          m1.setTahun(2020);
          
          Motor m2 = new Motor();
          m2.setMerk("Yamaha");
          m2.setCc(150);
          m2.setTahun(2022);
          
          Assets assetku[] = { r1, m1, m2 };
          double total = 0;
          for (Assets a : assetku) {
               System.out.println(a);
               total += a.nilaiAsset();
          }
          System.out.printf("Total Asset: Rp. %,.2f ", total);
     }
}
