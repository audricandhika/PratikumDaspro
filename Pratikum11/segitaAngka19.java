package Pratikum11;

import java.util.Scanner;

public class segitaAngka19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan angka: ");
            int n = sc.nextInt();
            
            if (n>2) {
                for (int i = 0; i <= n; i++) {
                    for (int j = 0; j < n - i; j++) {
                        System.out.print(" ");
                    }
                    
                    for (int j = 0; j < i; j++) {
                        int angka = j + 1;
                        System.out.print(angka);
                    }
                    System.out.println();
                }
            } else{
                System.out.println("Angka tidak valid");
            }
                    
            
        }
    }
}