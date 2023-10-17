import java.util.Scanner;
public class Bilangan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil, bil2, bil3;

        System.out.println("Masukkan Bilangan 1");
        bil = sc.nextInt();
        System.out.println("Masukkan Bilangan 2");
        bil2 = sc.nextInt();
        System.out.println("Masukkan Bilangan 3");
        bil3 = sc.nextInt();

        if(bil>bil2){
            if(bil2>bil3){
                System.out.println("Bilangan Terbersar: " + bil);
            }else{
                if(bil>bil3){
                    System.out.println("Bilangan Terbesar: " + bil);
                } else{
                    System.out.println("Bilangan Terbesar: " + bil3);
                }
            }
        }else{
            if(bil>bil3){
                System.out.println("Bilangan Terbesar: " + bil2);
            }else{
                if(bil2>bil3){
                System.out.println("Bilangan Terbesar: " + bil2);
            } else{
                System.out.println("Bilangan Terbesar: " + bil3);
            }
        }
    }
}
}