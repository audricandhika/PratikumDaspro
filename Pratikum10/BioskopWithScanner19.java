package Pratikum10;

import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next, pengganti = "***";
        int menu;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.println("Pilih menu: ");
            menu = sc.nextInt();

            if (menu == 1) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if(penonton[baris-1][kolom-1] == null){
                       penonton[baris-1][kolom-1] = nama;
                    }else{
                        System.out.println("Kursi tidak tersedia");
                    }
                    
                    System.out.print("Input penonton lainnya? (y/n) ");
                    next = sc.next();
                    
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = pengganti;
                        }
                    }
                }
                System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
                System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
                System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
                System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);
                // for (int i = 0; i < penonton.length; i++) {
                    // System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(",", penonton[i]));
                // }
                
            }else if (menu == 3) {
                System.out.println("Keluar menu");
                break;
            }
        }
     }
    
}

