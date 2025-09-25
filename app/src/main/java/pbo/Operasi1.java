package pbo;

public class Operasi1 {
    public static void main(String[] args) {
        // Deklarasi variabel rad1 bertipe float bernilai 14.0
        float rad1 = 14.0f;
        
        // Deklarasi variabel luas1 dan luas2 bertipe float
        float luas1, luas2;
        
        // Hitung luas1 sebagai luas lingkaran dengan rumus: 22f / 7 * rad1 * rad1
        luas1 = 22f / 7 * rad1 * rad1;
        
        // Hitung luas2 sebagai luas lingkaran dengan rumus: rad1 * rad1 * 22 / 7
        luas2 = rad1 * rad1 * 22 / 7;
        
        // Cetak luas1 dan luas2
        System.out.println("luas1 = " + luas1);
        System.out.println("luas2 = " + luas2);
        
        // Deklarasi variabel kecilDari bertipe boolean sebagai hasil operasi perbandingan
        boolean kecilDari = luas1 < luas2;
        
        // Cetak hasil perbandingan
        System.out.println("luas1 < luas2 = " + kecilDari);
    }
}