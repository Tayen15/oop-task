package pbo;

public class Var1 {
    public static void main(String[] args) {
        // Deklarasi variabel siswa1 bertipe String
        String siswa1 = "Armind Maulani";
        
        // Deklarasi variabel nilai1 bertipe char dengan nilai ujian B
        char nilai1 = 'B';
        
        // Cetak tulisan menggunakan variabel-variabel tersebut
        System.out.println("Nilai siswa " + siswa1 + " adalah " + nilai1);
        
        // Deklarasi variabel phi1 dengan bertipe float
        float phi1 = 3.142857f;
        
        // Deklarasi variabel phi2 dengan bertipe double
        double phi2 = 3.142857142857143;
        
        // Cetak nilai PI
        System.out.println("PI (double) : " + phi2);
        System.out.println("PI (float) : " + phi1);
        
        // Deklarasi variabel rad1, rad2, rad3
        int rad1 = 14;      // int dengan nilai 14
        int rad2 = 0xe;     // int dengan nilai hexadecimal 0xe (14 dalam decimal)
        short rad3 = 14;    // short dengan nilai 14
        
        // Cetak isi variabel rad1, rad2, rad3
        System.out.println("rad1 = " + rad1);
        System.out.println("rad2 = " + rad2);
        System.out.println("rad3 = " + rad3);
        
        // Deklarasi variabel besarDari dengan tipe boolean
        boolean besarDari = true;
        
        // Cetak isi variabel besarDari
        System.out.println("besarDari = " + besarDari);
    }
}