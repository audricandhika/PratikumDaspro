import java.util.Scanner;
public class PemilihanOperator19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka 1");
        double angka1 = sc.nextDouble();
        System.out.println("Masukkan angka 2");
        double angka2 = sc.nextDouble();
        System.out.println("Masukkan operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        double hasil = 0;

        if (operator == '+')
        {
            hasil = angka1 + angka2;
        }
        else if (operator == '-')
        {
            hasil = angka1 - angka2;
        }
        else if (operator == '*')
        {
            hasil = angka1 * angka2;
        }
        else if (operator == '/')
        {
            hasil = angka1 / angka2;
        }
        else
        {
            System.out.println("tidak valid");
        }

        System.out.println("Hasil: " + hasil);
    }
}
