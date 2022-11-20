import java.util.Scanner;

public class prak03_algo_21537141007{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan a: "); //a>0 Bilangan bulat dan ganjil
        int a = input.nextInt();
        System.out.println("Pilih Pola Segitiga yang diinginkan");
        System.out.println("1. Menghadap ke samping ");
        System.out.println("2. Menghadap ke atas ");
        System.out.print("Pilih :");
        int pilih = input.nextInt();
        switch (pilih){
            case 1:
            int i = a/2;
            int j = 1;
            while(j<=i+1){
                int l = 2*j-1;
                int m = 1;
                while (m<=l){
                    System.out.print("*");
                    m++;
            }
                System.out.println("");
                j++;
        }   j=i;
            while(j>=1) {
                int w = 2 * j - 1;
                int m = w;
                while (m >= 1) {
                    System.out.print("*");
                    m--;
            }
                System.out.println("");
                j--;

            }break;
            case 2:
                j = 0;
                i = a-1;
                do{
                    int k = i-j;
                    int l = 2*j+1;
                    int m = 0;
                    int r = 1;
                    do{
                        if(m <k){
                            System.out.print(" ");
                        }m++;
                    }while(m<=k);
                    do {
                        System.out.print("*");
                        r++;
                    }while (r<=l);
                    System.out.println("");
                    j++;
                }while(j<=i);
                break;
        }System.out.println("Nama : Kodrat Nusantara");
        System.out.println("NIM : 21537141007");
        System.out.println("Kelas : I.1");
        System.out.println("Terima Kasih!");
    }
}
