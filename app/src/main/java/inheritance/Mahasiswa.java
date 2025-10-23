package inheritance;

public class Mahasiswa extends Person {
     private String jurusan;
     private int semester;

     public Mahasiswa() {
          super();
     }

     public String getJurusan() {
          return jurusan;
     }

     public void setJurusan(String jurusan) {
          this.jurusan = jurusan;
     }

     public int getSemester() {
          return semester;
     }

     public void setSemester(int semester) {
          this.semester = semester;
     }

     @Override
     public String toString() {
          return "Mahasiswa [jurusan=" + jurusan + ", semester=" + semester + ", toString()=" + super.toString() + "]";
     }    
}
