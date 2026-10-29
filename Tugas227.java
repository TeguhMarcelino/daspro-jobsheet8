import java.util.Scanner;
    public class Tugas227 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan nilai n = ");
            int angka = sc.nextInt();
            
            for (int i = 1; i <= angka; i++) {
                for (int j = 1; j <= angka; j++) {
                System.out.printf( "%4d",j*i );
                }
                System.out.println();
            
                
            }
            sc.close();
        }
    }