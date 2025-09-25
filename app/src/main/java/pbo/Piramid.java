package pbo;

public class Piramid {
    public static void main(String[] args) {
        int tinggi = 12;
        
        System.out.println("Piramid dengan tinggi " + tinggi + " baris:");
        System.out.println();
        
        // Nested loop untuk membuat piramid
        for(int i = 1; i <= tinggi; i++) {
            // Loop untuk mencetak spasi
            for(int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            
            // Loop untuk mencetak bintang
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            // Pindah ke baris baru
            System.out.println();
        }
    }
}