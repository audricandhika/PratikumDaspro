import java.util.Scanner;

public class SoalArray4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[8];
        double rata;
        int jumlah = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Masukkan bilangan bulat ke-" + i);
            a[i] = sc.nextInt();
            jumlah += a[i];
        }

        rata =(double)jumlah/8;
        System.out.println("Jumlah bilangan: " + jumlah);
        System.out.println("Rata-rata: " + rata);
    }
}