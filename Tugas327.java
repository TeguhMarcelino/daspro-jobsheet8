import java.util.Scanner;
    public class Tugas327 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int toko, pelanggan, barang;
            System.out.print("Masukkan Jumlah Toko : ");
            toko = sc.nextInt();

            if (toko < 0) {
                System.out.print("Jumlah toko harus >= 0.");
            } else {
                int i = 1;
                int tokotinggi = 0;
                int totalBarangTerbaik = 0;
                int totalakumulasi = 0;

                while (i <= toko) {
                    System.out.println("==============================");
                    System.out.println("Toko " + i);
                    System.out.print("Masukkan jumlah pelanggan : ");
                    pelanggan = sc.nextInt();
                    int totalbarang = 0;

                    for (int j = 1; j <= pelanggan; j++) {
                        do { 
                            System.out.print("Masukkan jumlah barang yang dibeli pelanggan " + j + ": ");
                            barang = sc.nextInt();
                            if (barang < 0) {
                                System.out.println("Barang tidak boleh negatif");
                            } 
                        } while (barang < 0);
                        totalbarang += barang;
                        totalakumulasi += barang;
                    }
                    System.out.println("Total barang: "+ totalbarang);

                    if (totalbarang > totalBarangTerbaik) {
                        tokotinggi = i;
                    }
                    i++; 
                }
            System.out.println("==============================");
            System.out.println("Total barang seluruh tokok : "+ totalakumulasi);
            System.out.println("Toko dengan barang terbanyak : "+ tokotinggi);
            }
            sc.close();

        }
    
}
