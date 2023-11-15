package Pratikum11;

import java.util.Scanner;

public class NestedLoop19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rata = 0;
        
        System.out.print("Masukkan jumlah kota:");
        int jumlahKota = sc.nextInt();
        double[][] suhu = new double[jumlahKota][4];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA ke-" + (i + 1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(" Suhu ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < suhu.length; i++) {
            System.out.print("KOTA ke-" + (i + 1) + ": ");

            for (double Suhu : suhu[i]) {
                System.out.print(Suhu + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("Rata-rata suhu kota ke-" + (i + 1));
            double total = 0;

            for (int j = 0; j < suhu[i].length; j++) {
                total = total + suhu[i][j];
            }

            rata = (double)total / suhu[i].length;
            System.out.println(rata);

            System.out.println();
        }
    }
}
