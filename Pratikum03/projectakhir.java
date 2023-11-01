import java.util.Scanner;
public class projectakhir{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double hargatiket, jumlahtiket, total;

        System.out.println("masukkan harga tiket");
        hargatiket = sc.nextDouble();
        System.out.println("masukkan jumlah tiket");
        jumlahtiket = sc.nextDouble();

        total = jumlahtiket * hargatiket;

        System.out.println("total harga tiket: " + total);

    }
}

