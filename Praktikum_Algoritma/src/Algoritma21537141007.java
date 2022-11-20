import java.util.Scanner;

public class Algoritma21537141007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan pertama : ");
        int A = input.nextInt();
        System.out.print("Bilangan kedua : ");
        int B = input.nextInt();
        System.out.print("Bilangan ketiga : ");
        int C = input.nextInt();
        int pilih;

        do {
            System.out.println("\n--- Tugas Praktik Algoritma ---");
            System.out.println("1. Menentukan nilai terbesar dari 3 angka");
            System.out.println("2. Mengurutkan angka dari 3 bilangan secara ascending ");
            System.out.println("3. Mengurutkan 4 bilangan secara descending");
            System.out.println("4. Exit");
            System.out.print("Pilih Menu> ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    if (A > B) {
                        if (A > C) {
                            System.out.println("Bilangan terbesar adalah " + A);
                        } else if (B > C) {
                            System.out.println("Bilangan terbesar adalah " + B);
                        }
                    } else {
                        System.out.println("Bilangan terbesar adalah " + C);
                    }
                    break;
                case 2:
                    if(A>B){
                        int x = A;
                        A = B;
                        B = x;
                        if (A > C) {
                            x = A;
                            A = C;
                            C = x;

                            if (B > C) {
                                x = B;
                                B = C;
                                C = x;
                            }
                        }
                    } else if (A>C) {
                        int x = A;
                        A = C;
                        C = x;
                    }if (B>C) {
                            int x = B;
                            B = C;
                            C = x;

                    }else {
                        System.out.println("Urutan Bilangan dari yang terkecil " + A + "," + B + "," + C);
                        break;
                    }
                case 3:
                    System.out.print("Bilangan keempat : ");
                    int D = input.nextInt();
                    if(A>B){
                        int x = A;
                        A = B;
                        B = x;
                        if (A > C) {
                            x = A;
                            A = C;
                            C = x;

                            if (B > C) {
                                x = B;
                                B = C;
                                C = x;
                            }
                        }
                    } else if (A>C) {
                        int x = A;
                        A = C;
                        C = x;
                    }if (B>C) {
                        int x = B;
                        B = C;
                        C = x;
                    }else if(A>D){
                        int x = A;
                        A = D;
                        D = x;
                }else{
                        System.out.println("Urutan Bilangan dari yang terbesar " + D + "," + C + "," + B + "," + A);
                    break;
                }
            }
        }while (pilih != 4);
    }
}
