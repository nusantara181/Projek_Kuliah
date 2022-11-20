import java.util.Scanner;

public class Deret4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int n = input.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            int c = i - 1;
            a = a + c;
            if (i == 1) {
                System.out.print(a);
            }else if (i%2==0) {
                System.out.print(" + " + -a);
            }else{
                System.out.print(" + " + a);
            }
        }
    }
}