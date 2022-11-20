import java.util.Scanner;

public class prak05_algo_21537141007 {
    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        double num1, num2;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pilihan Menu Operasi Aritmatika ");
            System.out.println("1. Penjumlahan ");
            System.out.println("2. Pengurangan ");
            System.out.println("3. Perkalian ");
            System.out.println("4. Pembagian ");
            System.out.println("5. Aritmatika dengan prosedur ");
            System.out.println("0. Keluar Program ");
            System.out.print("Pilih Menu : ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan bilangan pertama : ");
                    num1 = input.nextDouble();
                    System.out.print("Masukkan bilangan kedua : ");
                    num2 = input.nextDouble();
                    System.out.print("Hasil Penjumlahan " + num1 + " dengan " + num2 + " adalah " + jumlah(num1, num2));
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Masukkan bilangan pertama : ");
                    num1 = input.nextDouble();
                    System.out.print("Masukkan bilangan kedua : ");
                    num2 = input.nextDouble();
                    System.out.print("Hasil pengurangan " + num1 + " dengan " + num2 + " adalah " + kurang(num1, num2));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Masukkan bilangan pertama : ");
                    num1 = input.nextDouble();
                    System.out.print("Masukkan bilangan kedua : ");
                    num2 = input.nextDouble();
                    System.out.print("Hasil perkalian " + num1 + " dengan " + num2 + " adalah " + perkalian(num1, num2));
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Masukkan bilangan pertama : ");
                    num1 = input.nextDouble();
                    System.out.print("Masukkan bilangan kedua : ");
                    num2 = input.nextDouble();
                    System.out.print("Hasil bagi " + num1 + " dengan " + num2 + " adalah " + bagi(num1, num2));
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Masukkan bilangan pertama : ");
                    num1 = input.nextDouble();
                    System.out.print("Masukkan bilangan kedua : ");
                    num2 = input.nextDouble();
                    aritmatika(num1, num2);
                    break;
                case 0:
                    System.out.print("TERIMA KASIH");
                    break;
                default:
                    System.out.println("MENU YANG ANDA PILIH TIDAK ADA!");
                    System.out.println("--SILAHKAN PILIH MENU KEMBALI--");
                    System.out.println();
            }
        } while (menu != 0);
    }
    static double jumlah(double num1, double num2) {
        double hasil = num1 + num2;
        return hasil;
    }
    static double bagi(double num1, double num2) {
        double hasil = num1 / num2;
        return hasil;
    }
    static double kurang(double num1, double num2) {
        double hasil = num1 - num2;
        return hasil;
    }
    static double perkalian(double num1, double num2) {
        double hasil = num1 * num2;
        return hasil;
    }
    static void aritmatika(double num1, double num2) {
        double num3 = num1 + num2;
        double num4 = num1 - num2;
        double num5 = num1 * num2;
        double num6 = num1 / num2;
        System.out.println("Penjumlahan " + num1 + " dengan " + num2 + " menggunakan prosedur = " + num3);
        System.out.println("Pengurangan " + num1 + " dengan " + num2 + " menggunakan prosedur = " + num4);
        System.out.println("Perkalian " + num1 + " dengan " + num2 + " menggunakan prosedur = " + num5);
        System.out.println("Pembagian " + num1 + " dengan " + num2 + " menggunakan prosedur = " + num6);
        System.out.println();
    }
}