package Pratikum13;

public class LocalGlobal19 {
    static int a = 19;
    public static void main(String[] args) {
        int b = 10;
        int c = 17;

        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);

        display();
    }

    private static void display(){
        int b = 20;
        int c = 5;

        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);
    }
}
