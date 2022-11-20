import java.util.Scanner;

public class Gaji_PNS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Nama = scanner.next();
        int Golongan = scanner.nextInt();
        int Gaji;
            if (Golongan == 1) {
                Gaji = 5000000;
                System.out.println("Nama " + Nama + '\n' + "Golongan " + Golongan + '\n' + "Gaji " + Gaji);
            } else if (Golongan == 2) {
                Gaji = 3000000;
                System.out.println("Nama " + Nama + '\n' + "Golongan " + Golongan + '\n' + "Gaji " + Gaji);
            } else {
                Gaji = 1000000;
                System.out.println("Nama " + Nama + '\n' + "Golongan " + Golongan + '\n' + "Gaji " + Gaji);
            }
        }
    }