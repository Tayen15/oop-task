package inheritance;

public class CivitasKampus {
     public static void main(String[] args) {
          Dosen d1 = new Dosen();
          Dosen d2 = new Dosen(); 
          Mahasiswa m1 = new Mahasiswa();
          Mahasiswa m2 = new Mahasiswa();

          d1.setNidn("1111"); d1.setName("Okta");
          d1.setGender('L'); d1.setGelar("S.Kom");

          d2.setNidn("2222"); d2.setName("Budi"); 
          d2.setGender('L'); d2.setGelar("S.T.");

          m1.setJurusan("TI"); m1.setSemester(3);
          m1.setName("Ekok"); m1.setGender('L');

          m2.setJurusan("SI"); m2.setSemester(5);
          m2.setName("Siti"); m2.setGender('P');

          Person ar[] = {d1, d2, m1, m2};
          for (Person p : ar) {
               System.out.println(p.toString());
          }
     }
}
