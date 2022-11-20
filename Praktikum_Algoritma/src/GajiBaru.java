import java.util.Scanner;

public class GajiBaru {
        public static void main(String[] args) {
            boolean ulang = true;
            do {
                Scanner scanner = new Scanner(System.in);
                String Nama = scanner.next();
                int Golongan = scanner.nextInt();
                int Gaji;

                if (Golongan == 1) {
                    Gaji = 5000000;
                } else if (Golongan == 2) {
                    Gaji = 3000000;
                } else {
                    Gaji = 1000000;
                }
                System.out.println("Nama " + Nama + '\n' + "Golongan " + Golongan + '\n' + "Gaji " + Gaji);
                int lagi = scanner.nextInt();
                if (lagi !=1){
                    ulang = false;
                }
            }while (ulang);
            }
        }
