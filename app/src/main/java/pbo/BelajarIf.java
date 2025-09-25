package pbo;

public class BelajarIf {
    public static void main(String[] args) {
        // Definisikan variabel untuk segitiga 1
        double alas1 = 4.7;
        double tinggi1 = 3.8;
        double luas1 = 0.5 * alas1 * tinggi1;  // rumus luas segitiga = 1/2 x alas x tinggi
        
        // Definisikan variabel untuk segitiga 2
        double alas2 = 3.7;
        double tinggi2 = 4.8;
        double luas2 = 0.5 * alas2 * tinggi2;
        
        // Cetak luas kedua segitiga
        System.out.println("Luas segitiga 1: " + luas1);
        System.out.println("Luas segitiga 2: " + luas2);
        
        // Bandingkan luas kedua segitiga
        if(luas1 > luas2) { 
            System.out.println("segitiga 1 lebih besar"); 
        } 
        else if (luas1 < luas2) { 
            System.out.println("segitiga 1 lebih kecil"); 
        } 
        else { 
            System.out.println("kedua segitiga sama luas"); 
        }
    }
}