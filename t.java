import java.util.Scanner;
public class t{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi Roti
        String[] namaRoti = {"Roti Abon", "Roti Pizza", "Roti Moy", "Roti Sosis", "Milky Cheese"};
        double[] hargaRoti = {7500, 6500, 7000, 7000, 6000};
        int[] stockRoti = {10, 15, 15, 13, 18};
        int totalHarga = 0;

        // Tampilan data roti 
        System.out.printf("===================================================================%n");
        System.out.printf("| %-10s | %-17s | %-17s | %-10s | %n", "Kode", "Nama Roti", "Harga", "Stock");
        System.out.printf("-------------------------------------------------------------------%n");

        for (int i = 0; i < namaRoti.length; i++) {
            System.out.printf("| %-10d | %-17s | %-17.2f | %-10d |%n",i , namaRoti[i], hargaRoti[i], stockRoti[i]);
        }
        System.out.printf("===================================================================%n");
        System.out.println();

        // Transaksi pembelian 
        do {
            System.out.print("Masukkan Kode Roti yang dibeli : ");
            int kodeRoti = sc.nextInt();

            System.out.print("Masukkan Banyak Roti yang dibeli : ");
            int jumlahRoti = sc.nextInt();

            // hitung sisa stok roti
            stockRoti[kodeRoti] -= jumlahRoti;

            // hitung totoal harga
            totalHarga += hargaRoti[kodeRoti] * jumlahRoti;

            System.out.print("Tambah Roti ? (y/t) : ");
            char tambahRoti = sc.next().charAt(0);

            if (tambahRoti == 't') {
                break;
            }
        } while (true);

        // Diskon membership loyalty
        System.out.print("Apakah pembeli memiliki membership ? (y/t) : ");
        char membership = sc.next().charAt(0);

        if (membership == 'y') { 
            totalHarga *= 0.5; // jika ya diskon 5%
        }

        // output total haraga
        System.out.println("\nTotal Harga : " + totalHarga);

        System.out.print("Masukkan Pembayaran Pembeli : ");
        int pembayaranPembeli = sc.nextInt();

        int kembalian = pembayaranPembeli - totalHarga;

        // Output kembalian
        System.out.println("Kembalian : " + kembalian);

        // Menampilkan sisa stok roti setelah transaksi
        System.out.println("\n** Sisa stock roti : ** ");
        for (int i = 0; i < namaRoti.length; i++) {
            System.out.printf("| %-10d | %-17s | %-17.2f | %-10d |%n",i , namaRoti[i], hargaRoti[i], stockRoti[i]);
            }

        }
    }