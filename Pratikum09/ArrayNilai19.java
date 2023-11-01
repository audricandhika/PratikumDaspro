import java.util.Scanner;

public class ArrayNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;
        double rata = 0;
        int mahasiswaLulus = 0;
        int mahasiswaTidakLulus = 0;

    int[] nilaiAkhir = new int[10];

    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
        nilaiAkhir[i] = sc.nextInt();
    }

    for (int i = 0; i < 10; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-" + (i+1) + " lulus ");
            mahasiswaLulus++;
        }
        else {
            System.out.println("Mahasiswa ke-" + (i+1) + " tidak lulus ");     
            mahasiswaTidakLulus++;  
        }
    }
        System.out.println("Jumlah mahasiswa lulus: " + mahasiswaLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + mahasiswaTidakLulus);

    for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > nilaiTertinggi) {
            nilaiTertinggi = nilaiAkhir[i];
        }
        if (nilaiAkhir[i] < nilaiTerendah) {
            nilaiTerendah = nilaiAkhir[i];
        }
    } 
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        
    for (int i = 0; i < nilaiAkhir.length; i++) {
        rata += nilaiAkhir[i];
   }
    rata /= nilaiAkhir.length;
    System.out.println("Nilai rata-rata: " + rata);

    }
}
