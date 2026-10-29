import java.util.Scanner;

public class Tugas127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int n = sc.nextInt();
        int i = 1;
        int Angka;

        while (i <= n) {
            int j = 0;
            Angka = 1;
            while (j < i) {
                System.out.print(Angka);
                Angka++;
                j++;
            }
            System.out.println();
            i++;
    
        }
    }
}