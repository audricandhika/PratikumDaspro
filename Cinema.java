import java.util.Scanner;

public class Cinema{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket, pilihan, Sesi;
        int[] jumlahTiket = {20, 25, 30};
        String[] sesiFilm = {"12.00", "16.00", "20.00"};

        System.out.println("Masukkan jumlah tiket yang ingin dipesan: ");
        tiket = sc.nextInt();

        System.out.println("\nTiket yang tersedia: ");
        for (int i = 0; i < jumlahTiket.length; i++) {
            System.out.println((i + 1) + ". " + sesiFilm[i] + " (" + jumlahTiket[i] + " tiket)");
        }

        System.out.println("\nMasukkan pilihan tiket (1, 2, atau 3): ");
        pilihan = sc.nextInt();

        if (pilihan < 1 || pilihan > 3) {
            System.out.println("Sesi film tidak tersedia");
        } else {
                Sesi = pilihan - 1;
            if (jumlahTiket[Sesi] >= tiket) {
                jumlahTiket[Sesi] -= tiket;
                System.out.println("Pesanan berhasil");
            } else {
                System.out.println("Maaf, tiket yang anda pilih telah habis.");
            }
        }

        System.out.println("\nTiket yang tersedia: ");
        for (int i = 0; i < jumlahTiket.length; i++) {
            System.out.println(sesiFilm[i] + " (" + jumlahTiket[i] + " tiket)");
        }
    }
}