import java.util.Scanner;

public class LinearSearch19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int key;
        int hasil = -1;
        int elemen;
        
        System.out.print("Masukkan jumlah elemen array: ");
        elemen = sc.nextInt();
        int[] arrayInt = new int[elemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" +(i+0) + " : ");
            arrayInt[i] = sc.nextInt();

        }
            System.out.println("Masukkan key yang ingin dicari: ");
            key = sc.nextInt();
        
        for (int j = 0; j < arrayInt.length; j++) {
            if (arrayInt[j] == key) {
                hasil = j;
                System.out.println("Key ada di posisi indeks ke-" + hasil);
            } 
        }
        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        }
    }
}
