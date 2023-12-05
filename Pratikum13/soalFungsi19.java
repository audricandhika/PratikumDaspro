package Pratikum13;
import java.util.Scanner;

public class soalFungsi19 {
    
    static String [] students = {"Sari", "Rina", "Yani", "Budi", "Ali"};
    static int weeks = 3;
    static int[][] nilai = new int[students.length][weeks];
    
    public static void main(String[] args) {
        
        inputNilai();
        displayNilai();
        nilaiTerbaik();
    }
    
    public static void inputNilai(){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Masukkan nilai " + students[i]);
            for (int j = 0; j < weeks; j++) {
                System.out.print("Minggu " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }

    public static void displayNilai(){
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nNilai " + (students[i]));
            for (int j = 0; j < weeks; j++) {
                System.out.println("Minggu " + (j + 1) + ": " + nilai[i][j]);
            }
        }

    }

    public static void nilaiTerbaik(){
        for (int j = 0; j < weeks; j++) {
            int nilaiTerbaik = nilai[0][j];
        for (int i = 1; i < students.length; i++) {
            if (nilai[i][j] > nilaiTerbaik) {
                nilaiTerbaik = nilai[i][j];
            }
        }
        
        System.out.println("Nilai tertinggi Minggu " + (j + 1) + ": " + nilaiTerbaik);
    }
    }

}
