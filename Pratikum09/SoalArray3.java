import java.util.Scanner;

public class SoalArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[]bulan = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "Desember"};
        int angka;

        for (int i = 0; i < bulan.length; i++) {
            System.out.println("Masukkan angka (1-12)");
            angka = sc.nextInt();

            if (angka >= 1 && angka <= 12) {
                System.out.println("Bulan" + bulan[angka-1]);    
            }
        }
    }
}
