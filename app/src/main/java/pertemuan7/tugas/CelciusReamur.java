package pertemuan7.tugas;

public class CelciusReamur implements KonverterSatuan {
     String asal, tujuan;

     public CelciusReamur() {
          this.asal = "Celcius";
          this.tujuan = "Reamur";
     }

     @Override
     public String satuanInput() {
          return this.asal;
     }

     @Override
     public String satuanOutput() {
          return this.tujuan;
     }

     @Override
     public float konversi(float in) {
          return 4f / 5 * in;
     }

     public static void main(String ar[]) {
          KonverterSatuan k1 = new CelciusReamur();
          float temp = 100; // titik didih air, Celcius
          System.out.println(temp + " " + k1.satuanInput() +
                    " setara dengan " + k1.konversi(temp) +
                    " " + k1.satuanOutput());
     }
}
