package inheritance;

public class Dosen extends Person {
     private String nidn;
     private String gelar;

     public Dosen() {
          super();
     }

     public String getNidn() {
          return nidn;
     }

     public void setNidn(String nidn) {
          this.nidn = nidn;
     }

     public String getGelar() {
          return gelar;
     }

     public void setGelar(String gelar) {
          this.gelar = gelar;
     }

     @Override
     public String toString() {
          return "Dosen [nidn=" + nidn + ", gelar=" + gelar + ", toString()=" + super.toString() + "]";
     }
}
