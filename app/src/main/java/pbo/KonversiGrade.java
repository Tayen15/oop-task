package pbo;

public class KonversiGrade {
    public static void main(String[] args) {
        // Himpunan nilai numerik
        int[] nilai = {88, 26, 67, 92, 55, 49};
        
        // Cetak grade yang sesuai untuk setiap nilai
        System.out.println("Konversi Nilai ke Grade:");
        System.out.println("========================");
        
        for(int i = 0; i < nilai.length; i++) {
            char grade;
            
            if(nilai[i] >= 90 && nilai[i] <= 100) {
                grade = 'A';
            }
            else if(nilai[i] >= 80 && nilai[i] <= 89) {
                grade = 'B';
            }
            else if(nilai[i] >= 56 && nilai[i] <= 79) {
                grade = 'C';
            }
            else if(nilai[i] >= 40 && nilai[i] <= 55) {
                grade = 'D';
            }
            else if(nilai[i] >= 0 && nilai[i] <= 39) {
                grade = 'E';
            }
            else {
                grade = '?'; // untuk nilai di luar range 0-100
            }
            
            System.out.println("Nilai " + nilai[i] + " mendapat grade: " + grade);
        }
        
        // Tampilkan tabel konversi
        System.out.println("\nTabel Konversi Grade:");
        System.out.println("====================");
        System.out.println("Range Nilai\tGrade");
        System.out.println("90 - 100\tA");
        System.out.println("80 - 89\t\tB");
        System.out.println("56 - 79\t\tC");
        System.out.println("40 - 55\t\tD");
        System.out.println("0 - 39\t\tE");
    }
}