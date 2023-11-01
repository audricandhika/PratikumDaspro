import java.util.Scanner;
public class Bilangan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil, bil2, bil3, bilanganTerbesar;

        System.out.println("Masukkan Bilangan 1");
        bil = sc.nextInt();
        System.out.println("Masukkan Bilangan 2");
        bil2 = sc.nextInt();
        System.out.println("Masukkan Bilangan 3");
        bil3 = sc.nextInt();
        
        bilanganTerbesar = bil>bil2 ? (bil>bil3 ? bil : (bil>bil3 ? bil : bil3)) : (bil>bil3 ? bil2 : (bil2>bil3 ? bil2 : bil3));

        System.out.println("Bilangan Terbesar: " + bilanganTerbesar);
        bilanganTerbesar = sc.nextInt();
       }
}