import java.util.Scanner;

public class Perulanganfor1 {
    public static void main(String[] args){
                int a,i,j;
                System.out.print("Masukkan bilangan bulat --> ");
                Scanner nilai = new Scanner(System.in);
                a =nilai.nextInt();
                for (i=1; i<=a; i++) {
                    for (j=1; j<=i; j++)
                        System.out.print("*");
                        System.out.println();
        }
    }
}
